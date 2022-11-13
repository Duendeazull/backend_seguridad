package tutorial.misionTIC.Seguridad.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class Permiso {

    @Id
    private String Id;
    private String URL;
    private String metodo;

    public Permiso(String URL, String metodo) {
        this.URL = URL;
        this.metodo = metodo;
    }


    public String getId() {
        return Id;
    }
    public String getURL() {return URL;}
    public void setURL(String URL) {
        this.URL = URL;
    }
    public String getMetodo() {
        return metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}