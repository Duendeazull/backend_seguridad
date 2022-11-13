package tutorial.misionTIC.Seguridad.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Rol {

    @Id
    private String id;
    private String nombre;

    public Rol(String nombre) {
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}