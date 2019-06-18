package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import br.com.dsc.cbi.apirest.entities.ae.ExAnelFixacao;
import br.com.dsc.cbi.apirest.odbc.ConnectionOdbc;
import br.com.dsc.cbi.apirest.repositories.ExAnelFixacaoRepository;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Comparator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.dsc.cbi.apirest.repositories.OrdemServicoRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CbiApirestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private ExAnelFixacaoRepository repository;

    @Test
    public void test() {
        transferData();
    }

    public void transferData() {
        try {
            ResultSet rst = new ConnectionOdbc().getSimpleResultSet("SELECT * FROM dimensoesOriginaisAnelFixEX");
            while (rst.next()) {
                ExAnelFixacao anel = new ExAnelFixacao();
                anel.setCarcaca(rst.getInt(2));
                anel.setLinha(rst.getString(3));
                anel.setPolos(rst.getInt(4));
                anel.setW_dianteiro(rst.getString(5));
                anel.setW1_dianteiro(rst.getString(6));
                anel.setW2_dianteiro(rst.getString(7));
                anel.setW3_dianteiro(rst.getString(8));
                anel.setW_traseiro(rst.getString(9));
                anel.setW1_traseiro(rst.getString(10));
                anel.setW2_traseiro(rst.getString(11));
                anel.setW3_traseiro(rst.getString(12));
                anel.setComprimento_passagem_chama_L(rst.getString(13));
                anel.setDiametro_passagem_chama_dianteiro(rst.getString(14));
                anel.setDiametro_passagem_chama_traseiro(rst.getString(15));
                anel.setDiametro_passagem_chama_eixoE_dianteiro(rst.getString(16));
                anel.setDiametro_passagem_chama_eixoE_traseiro(rst.getString(17));
                anel.setFolga_maxima_dianteira(rst.getString(18));
                anel.setFolga_maxima_traseira(rst.getString(19));
                System.out.println(anel);
                //repository.save(anel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
