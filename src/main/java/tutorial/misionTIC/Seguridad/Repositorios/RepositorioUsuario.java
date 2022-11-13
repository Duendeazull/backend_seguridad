package tutorial.misionTIC.Seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.Seguridad.Modelos.Usuario;


public interface RepositorioUsuario extends MongoRepository<Usuario, String> {

}