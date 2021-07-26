package vacunacion;

import java.util.HashMap;

public class Usuarios {
    HashMap<String, String> users = new HashMap<>();

    public void agregarUsuario(String usuario, String contrasena) {
        this.users.put(usuario, contrasena);
    }

    public Boolean autentificarse(String usuario, String contrasena){
        return users.get(usuario).equals(contrasena);
    }
}
