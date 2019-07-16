package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Etapa_Servico;
import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import br.com.dsc.cbi.apirest.entities.Ensaio_Padrao;
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
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CbiApirestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private OrdemServicoRepository repository;

    @Test
    public void obdcTransfer() {
        repository.findAll().forEach(System.out::println);
    }

    public void transferData() {
        try {
            List<Ordem_Servico> ordens = repository.findByEquipamento("Máquina de Solda").stream().filter(os -> os.getOs() != null).collect(Collectors.toList());
            Connection conn = new ConnectionOdbc().getConnection();
            for (Ordem_Servico os : ordens) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM [Teste Máquina de Solda] tt WHERE tt.ID = (SELECT TOP 1 db.ID FROM [Máquinas de Solda] db WHERE db.OS = ?)");
                ps.setString(1, os.getOs());
                ResultSet rst = ps.executeQuery();
                while (rst.next()) {
                    Ensaio_Padrao teste = new Ensaio_Padrao();

                    teste.setEtapas(new ArrayList());
                    Etapa_Servico desmontagem = new Etapa_Servico();
                    desmontagem.setNome_etapa("Desmontagem");
                    desmontagem.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(7)));
                    //desmontagem.setData_etapa(stringToLocalDateTime(rst.getString(17)));
                    if (desmontagem.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(desmontagem);
                    }
                    Etapa_Servico desmanche = new Etapa_Servico();
                    desmanche.setNome_etapa("Desmanche");
                    desmanche.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(8)));
                    //desmanche.setData_etapa(stringToLocalDateTime(rst.getString(19)));
                    if (desmanche.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(desmanche);
                    }
                    Etapa_Servico rebobinamento = new Etapa_Servico();
                    rebobinamento.setNome_etapa("Rebobinamento");
                    rebobinamento.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(9)));
                    //rebobinamento.setData_etapa(stringToLocalDateTime(rst.getString(23)));
                    if (rebobinamento.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(rebobinamento);
                    }
                    Etapa_Servico bobina = new Etapa_Servico();
                    bobina.setNome_etapa("Bobina");
                    bobina.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(10)));
                    //bobina.setData_etapa(stringToLocalDateTime(rst.getString(21)));
                    if (bobina.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(bobina);
                    }
                    /*Etapa_Servico acabamento = new Etapa_Servico();
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
                    }*/
                    Etapa_Servico montagem = new Etapa_Servico();
                    montagem.setNome_etapa("Montagem");
                    montagem.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(11)));
                    //montagem.setData_etapa(stringToLocalDateTime(rst.getString(30)));
                    if (montagem.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(montagem);
                    }
                    /*Etapa_Servico pintura = new Etapa_Servico();
                    pintura.setNome_etapa("Pintura");
                    pintura.setData_etapa(stringToLocalDateTime(rst.getString(31)));
                    pintura.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(32)));
                    if (pintura.getResponsavel_etapa() != null) {
                    teste.getEtapas().add(pintura);
                    }
                    teste.setCor_pintura(rst.getString(33));*/
                    Etapa_Servico outros = new Etapa_Servico();
                    outros.setNome_etapa(rst.getString(12));
                    outros.setResponsavel_etapa(getNomeFuncionario(conn, rst.getInt(13)));
                    if (outros.getResponsavel_etapa() != null) {
                        teste.getEtapas().add(outros);
                    }
                    //teste.setEquipamentos_utilizados(rst.getString(36));
                    //teste.setEnsaio_final(new Etapa_Servico("Ensaio Final", null, getNomeFuncionario(conn, rst.getInt(37))));
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
