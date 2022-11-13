package tutorial.misionTIC.Seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.Seguridad.Modelos.Permiso;


public interface RepositorioPermiso extends MongoRepository<Permiso, String> {

}