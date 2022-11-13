package tutorial.misionTIC.Seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.Seguridad.Modelos.Rol;


public interface RepositorioRol extends MongoRepository<Rol, String> {

}