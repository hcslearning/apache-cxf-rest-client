package cl.hcslearning.cxf.rest.client;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

public class Usuario {
    // si el campo tiene el mismo nombre no es necesario nada
    private Long id;
    @JsonbProperty("name")
    private String nombre;
    private String email;
    @JsonbTransient // marcando como Transiente un campo para que no se incluya en la serialización ni deserialización
    private boolean conectado;
    @JsonbProperty("address")
    private Direccion direccion;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", conectado=" + conectado +
                ", direccion=" + direccion +
                '}';
    }
}
