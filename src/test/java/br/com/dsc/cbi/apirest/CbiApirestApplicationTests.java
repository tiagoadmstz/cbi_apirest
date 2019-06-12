package br.com.dsc.cbi.apirest;

import br.com.dsc.cbi.apirest.entities.Usuario;
import br.com.dsc.cbi.apirest.odbc.ConnectionManager;
import br.com.dsc.cbi.apirest.repositories.MarcaRepository;
import br.com.dsc.cbi.apirest.repositories.UsuarioRepository;
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
    private MarcaRepository repository;
    
    //@Test
    public void test() {
        new ConnectionManager().jsonInsert(repository);
    }

    public void addUser(String login, String senha) {
        Usuario usuario = new Usuario();
        usuario.setUsername(login);
        usuario.setPassword(new BCryptPasswordEncoder().encode(senha));
        //repository.save(usuario);
    }

}
