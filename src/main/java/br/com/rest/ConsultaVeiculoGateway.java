package br.com.rest;

import br.com.entities.Mes;
import br.com.utils.CampoBusca;
import br.com.utils.Converte;
import com.google.gson.Gson;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@RegisterRestClient
@ApplicationScoped
public class ConsultaVeiculoGateway {

    static String webService = "https://fipe.parallelum.com.br/api/v2";
    static int codigoSucesso = 200;

    public static BufferedReader buscaMes() throws Exception {

        String urlParaChamada = webService + CampoBusca.MES.getMes();

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            return new BufferedReader(new InputStreamReader((conexao.getInputStream())));

        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
