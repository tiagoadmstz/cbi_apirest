package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Etapa_Servico;
import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import br.com.dsc.cbi.apirest.entities.Teste;
import br.com.dsc.cbi.apirest.odbc.ConnectionOdbc;
import br.com.dsc.cbi.apirest.repositories.OrdemServicoRepository;
import java.sql.ResultSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CbiApirestApplicationTests {

    @Test
    public void contextLoads() {
    }

    //@Test
    public void obdcTransfer() {
        transferData();
        //repository.findAll().forEach(System.out::println);
    }

    public String getTestValues(JTable table) {
        //recupera o model da tabela
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //cria um array com valores procurados na ordem de apresentação no resultado final
        String[] testes = {"MV", "T5", "", "TS2", "T90", "C-Chart", "Densidade"};
        //recupera a quantidade total de linhas
        int rows = model.getRowCount();
        //cria um mapa para guardar os testes e seus respectivos valores
        Map<String, String> map = new HashMap();
        //loop que pega os valores na tabela
        for (int r = 0; r < rows; r++) {
            //loop secundário para cada testes no array
            for (String t : testes) {
                //cria duas variáveis temporárias
                String teste = "", valor = "";
                try {
                    //pega os valores de cada linha nas colunas 1 para testes e 9 ou 10 para valores
                    teste = Objects.toString(model.getValueAt(r, 1), "<html><span color='red'><b><i><u>valor nulo</u></i></b></span>");
                    valor = Objects.toString(model.getValueAt(r, !teste.equals(testes[5]) ? 9 : 10), "<html><span color='red'><b><i><u>valor nulo</u></i></b></span>");
                } catch (Exception e) {
                }
                //caso o teste encontrado seja igual ao existente no array o mesmo é adicionado no mapa
                if (teste.equals(t)) {
                    map.put(teste, valor);
                }
            }
        }
        //mensagem que será retornada
        String msg = "<html><p><span color='blue'><b><i>Salvar?</i></b></span></p>";
        //loop que ordena a lista baseado no array testes
        for (String t : testes) {
            msg = map.entrySet().stream()
                    .filter((entry) -> (entry.getKey().equals(t)))
                    .map((entry) -> "<p><span color='black'><b><i>" + entry.getKey() + " = " + entry.getValue() + "</i></b></span></p>")
                    .reduce(msg, String::concat);
        }

        //JOptionPane.showConfirmDialog(null, msg, "Etiqueta : ".concat("etiqueta"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return msg.concat("</html>");
    }

    @Autowired
    private OrdemServicoRepository repository;

    public void transferData() {
        try {
            List<Ordem_Servico> ordens = repository.findAll().stream().filter(os -> os.getOs() != null && os.getEquipamento() == null).collect(Collectors.toList());
            Connection conn = new ConnectionOdbc().getConnection();
            for (Ordem_Servico os : ordens) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM Testes tt WHERE tt.ID = (SELECT TOP 1 db.ID FROM [Dados de Bobinagem] db WHERE db.OS = ?)");
                ps.setString(1, os.getOs());
                ResultSet rst = ps.executeQuery();
                while (rst.next()) {
                    Teste teste = new Teste();
                    teste.setTensao(rst.getString(4));
                    teste.setRst(rst.getString(5));
                    teste.setRst_resultado(rst.getString(6));
                    teste.setResitencia_enrolamento(rst.getString(7));
                    teste.setResultado_miliohmimetro(rst.getString(8));
                    teste.setIsolacao(rst.getString(9));
                    teste.setResistencia(rst.getString(10));
                    teste.setVibracao(rst.getBoolean(11));
                    teste.setVibracao_dianteira(rst.getString(12));
                    teste.setVibracao_traseira(rst.getString(13));
                    teste.setCampainha(rst.getString(14));
                    teste.setRpm(rst.getString(15));
                    teste.setEtapas(new ArrayList());
                    Etapa_Servico desmontagem = new Etapa_Servico();
                    desmontagem.setNome_etapa("Desmontagem");
                    desmontagem.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(16)));
                    desmontagem.setData_etapa(stringToLocalDateTime(rst.getString(17)));
                    if (desmontagem.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(desmontagem);
                    }
                    Etapa_Servico desmanche = new Etapa_Servico();
                    desmanche.setNome_etapa("Desmanche");
                    desmanche.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(18)));
                    desmanche.setData_etapa(stringToLocalDateTime(rst.getString(19)));
                    if (desmanche.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(desmanche);
                    }
                    Etapa_Servico bobina = new Etapa_Servico();
                    bobina.setNome_etapa("Bobina");
                    bobina.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(20)));
                    bobina.setData_etapa(stringToLocalDateTime(rst.getString(21)));
                    if (bobina.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(bobina);
                    }
                    Etapa_Servico rebobinamento = new Etapa_Servico();
                    rebobinamento.setNome_etapa("Rebobinamento");
                    rebobinamento.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(22)));
                    rebobinamento.setData_etapa(stringToLocalDateTime(rst.getString(23)));
                    if (rebobinamento.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(rebobinamento);
                    }
                    Etapa_Servico acabamento = new Etapa_Servico();
                    acabamento.setNome_etapa("Acabamento");
                    acabamento.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(24)));
                    acabamento.setData_etapa(stringToLocalDateTime(rst.getString(25)));
                    if (acabamento.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(acabamento);
                    }
                    Etapa_Servico impregnacao = new Etapa_Servico();
                    impregnacao.setNome_etapa("Impregnação");
                    impregnacao.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(26)));
                    impregnacao.setData_etapa(stringToLocalDateTime(rst.getString(27)));
                    teste.setImpregnacao_hora_final(stringToLocalDateTime(rst.getString(28)));
                    if (impregnacao.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(impregnacao);
                    }
                    Etapa_Servico montagem = new Etapa_Servico();
                    montagem.setNome_etapa("Montagem");
                    montagem.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(29)));
                    montagem.setData_etapa(stringToLocalDateTime(rst.getString(30)));
                    if (montagem.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(montagem);
                    }
                    Etapa_Servico pintura = new Etapa_Servico();
                    pintura.setNome_etapa("Pintura");
                    pintura.setData_etapa(stringToLocalDateTime(rst.getString(31)));
                    pintura.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(32)));
                    if (pintura.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(pintura);
                    }
                    teste.setCor_pintura(rst.getString(33));
                    Etapa_Servico outros = new Etapa_Servico();
                    outros.setNome_etapa(rst.getString(34));
                    outros.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(35)));
                    if (outros.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(outros);
                    }
                    teste.setEquipamentos_utilizados(rst.getString(36));
                    teste.setEnsaio_final(new Etapa_Servico("Ensaio Final", null, getNomeFuncionario(conn, rst.getInt(37))));
                    os.setTestes(Arrays.asList(teste));
                    //System.out.println(teste);
                    repository.save(os);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BigDecimal stringToBigDecimal(String string) {
        return string != null ? new BigDecimal(string.replace(",", ".")) : null;
    }

    private LocalDateTime stringToLocalDateTime(String date) {
        return date != null ? LocalDateTime.parse(date.substring(0, 21), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")) : null;
    }

    private String getNomeFuncionario(Connection conn, int id) {
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM [Funcionários] WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet rst = ps.executeQuery();
            rst.next();
            return rst.getString(3);
        } catch (Exception e) {
        }
        return null;
    }

}
