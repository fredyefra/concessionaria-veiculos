package br.com.rest;

import br.com.entities.Mes;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.BufferedReader;

@RestClient
@Path("/consultaVeiculo")
public class ConsultaVeiculo {

//    @Inject
//    Template hello;
//
//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    public TemplateInstance get() {
//        return hello.data("name", "Quarkus");
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BufferedReader consulta() throws Exception {
        return ConsultaVeiculoGateway.buscaMes();
    }
}
