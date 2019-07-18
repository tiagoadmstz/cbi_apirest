package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Etapa_Servico;
import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import br.com.dsc.cbi.apirest.entities.Ensaio_Padrao;
import br.com.dsc.cbi.apirest.entities.Equipamento_Eletrico;
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
            for (Ordem_Servico os : ordens) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM ensaiosIniciaisEX ei WHERE ei.idOS = (SELECT TOP 1 db.ID FROM [Dados de Bobinagem] db WHERE db.OS = ?)");
                ps.setString(1, os.getOs());
                ResultSet rst = ps.executeQuery();
                while (rst.next()) {
                    Equipamento_Eletrico equip = os.getDados_equipamento();
                    equip.setFrequencia(rst.getString(5));
                    equip.setFator_servico(stringToBigDecimal(rst.getString(6)));
                    equip.setIndice_protecao(rst.getString(7));
                    equip.setClasse_isolacao(rst.getString(8));
                    equip.setIpIn(stringToBigDecimal(rst.getString(9)));
                    equip.setRegime(rst.getString(10));
                    equip.setCertificado(rst.getString(11));
                    repository.save(os);
                }
            }
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
