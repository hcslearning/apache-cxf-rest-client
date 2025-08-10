package cl.hcslearning.cxf.rest.client;

import jakarta.json.bind.annotation.JsonbProperty;

public class Direccion {
    @JsonbProperty("street")
    private String calle;
    @JsonbProperty("suite")
    private String departamento;
    @JsonbProperty("city")
    private String ciudad;

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", departamento='" + departamento + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
