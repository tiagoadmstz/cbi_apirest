package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Categoria;
import br.com.dsc.cbi.apirest.entities.Usuario;
import br.com.dsc.cbi.apirest.odbc.ConnectionManager;
import br.com.dsc.cbi.apirest.repositories.CategoriaRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CbiApirestApplicationTests {

    @Test
    public void contextLoads() {
    }

    //@Autowired
    private CategoriaRepository repository;

    //@Test
    public void test() {
        ConnectionManager cm = new ConnectionManager();
        cm.jsonInsert(repository, cm.fileToJson("cad_categorias.json"), new TypeReference<List<Categoria>>() {
        });
    }

    public void addUser(String login, String senha) {
        Usuario usuario = new Usuario();
        usuario.setUsername(login);
        usuario.setPassword(new BCryptPasswordEncoder().encode(senha));
        //repository.save(usuario);
    }

}
