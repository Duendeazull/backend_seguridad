package tutorial.misionTIC.Seguridad.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PermisosRoles {

    @Id
    private String id;
    @DBRef
    private Rol id_rol;
    @DBRef
    private Permiso id_permiso;

    public PermisosRoles() {

    }

    public String getId() {
        return id;
    }

    public Rol getRol() {
        return id_rol;
    }

    public void setRol(Rol rol) {
        this.id_rol = rol;
    }

    public Permiso getPermiso() {
        return id_permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.id_permiso = permiso;
    }
}
