package cl.hcslearning.cxf.rest.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

public class App {

    public static void main(String[] args) {
        //recuperaUnUsuario();
        recuperaListadoUsuarios();
    }

    private static void recuperaListadoUsuarios() {
        // 1. Crear el cliente
        Client client = ClientBuilder.newClient();

        // 2. Definir el recurso REST
        // apunta a https://jsonplaceholder.typicode.com/users/1
        WebTarget recurso = client.target("https://jsonplaceholder.typicode.com")
                .path("users");

        // 3. Hacer petición GET
        Response response = recurso.request(MediaType.APPLICATION_JSON).get();

        // 4. Procesar respuesta
        if( response.getStatus() == 200 ) {
            //String json = response.readEntity(String.class);
            //System.out.println(json);

            List<Usuario> usuarios = response.readEntity(new GenericType<List<Usuario>>(){});
            for( Usuario u : usuarios ) {
                System.out.println(u);
            }

        } else {
            System.out.println("ERROR: " + response.getStatus());
        }

        // 5. Cerrar cliente
        client.close();
    }

    private static void recuperaUnUsuario() {
        // 1. Crear el cliente
        Client client = ClientBuilder.newClient();

        // 2. Definir el recurso REST
        // apunta a https://jsonplaceholder.typicode.com/users/1
        WebTarget recurso = client.target("https://jsonplaceholder.typicode.com")
                .path("users")
                .path("1");

        // 3. Hacer petición GET
        Response response = recurso.request(MediaType.APPLICATION_JSON).get();

        // 4. Procesar respuesta
        if( response.getStatus() == 200 ) {
            //String json = response.readEntity(String.class);
            //System.out.println(json);

            Usuario usuario = response.readEntity(Usuario.class);
            System.out.println(usuario);
        } else {
            System.out.println("ERROR: " + response.getStatus());
        }

        // 5. Cerrar cliente
        client.close();
    }

}

