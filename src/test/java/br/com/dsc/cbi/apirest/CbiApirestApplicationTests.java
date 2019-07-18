package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import br.com.dsc.cbi.apirest.entities.atmosferaex.Ensaio_Ex_d;
import br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios.Ensaio_Eletrico;
import br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios.Resistencia_Isolamento;
import br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios.Resistencia_Ohmica;
import br.com.dsc.cbi.apirest.interfaces.Ensaio;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CbiApirestApplicationTests {

    @Test
    public void contextLoads() {
    }

    //@Autowired
    private OrdemServicoRepository repository;

    //@Test
    public void obdcTransfer() {
        transferData();
    }

    public void transferData() {
        try {
            List<Ordem_Servico> ordens = repository.findByEquipamento(null).stream().filter(os -> os.getOs() != null).collect(Collectors.toList());
            Connection conn = new ConnectionOdbc().getConnection();
            int cont = 0;
            for (Ordem_Servico os : ordens) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM ensaiosIniciaisEX ei WHERE ei.idOS = (SELECT TOP 1 db.ID FROM [Dados de Bobinagem] db WHERE db.OS = ?)");
                ps.setString(1, os.getOs());
                ResultSet rst = ps.executeQuery();

                while (rst.next()) {
                    /*Equipamento_Eletrico equip = os.getDados_equipamento();
                    equip.setFrequencia(rst.getString(5));
                    equip.setFator_servico(stringToBigDecimal(rst.getString(6)));
                    equip.setIndice_protecao(rst.getString(7));
                    equip.setClasse_isolacao(rst.getString(8));
                    equip.setIpIn(stringToBigDecimal(rst.getString(9)));
                    equip.setRegime(rst.getString(10));
                    equip.setCertificado(rst.getString(11));*/
                    List<Ensaio> ensaios = os.getTestes() != null ? os.getTestes() : new ArrayList();
                    Ensaio_Ex_d ensaio = new Ensaio_Ex_d();
                    ensaio.setTipo_motor_ex(rst.getString(4));
                    Map<String, Ensaio_Eletrico> map = new HashMap();
                    Ensaio_Eletrico ensaio_eletrico = new Ensaio_Eletrico();
                    Resistencia_Isolamento resistencia_isolamento = new Resistencia_Isolamento();
                    resistencia_isolamento.setTensao_aplicada(rst.getString(12));
                    resistencia_isolamento.setRst_x_massa(rst.getString(13));
                    resistencia_isolamento.setEquip_verif_rstMassa(rst.getString(14));
                    resistencia_isolamento.setRst_x_fase(rst.getString(15));
                    resistencia_isolamento.setEquip_verif_rstFase(rst.getString(16));
                    resistencia_isolamento.setTensao_aplicada_Hipot(rst.getString(17));
                    resistencia_isolamento.setRst_x_Hipot(rst.getString(18));
                    resistencia_isolamento.setEquip_verif_rstHipot(rst.getString(19));
                    Resistencia_Ohmica resistencia_ohmica = new Resistencia_Ohmica();
                    ensaio_eletrico.setResistencia_isolamento(resistencia_isolamento);
                    ensaio_eletrico.setResistencia_ohmica(resistencia_ohmica);
                    map.put("inicial", ensaio_eletrico);
                    ensaio.setEnsaios_eletricos(map);
                    ensaios.add(ensaio);
                    repository.save(os);
                }
            }
            System.out.println("Quantidade: " + cont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BigDecimal stringToBigDecimal(String string) {
        return string != null && !"".equals(string) ? new BigDecimal(string.replace(",", ".")) : null;
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
