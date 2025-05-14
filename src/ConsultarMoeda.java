import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoeda {

    public Moeda consultaMoeda(String moedaBase, String moedaAlvo, double valor){

        // Gerador da URL
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/ed302789f43692ef78baf497/pair/"
                + moedaBase + "/"
                + moedaAlvo + "/"
                + valor);

        // Bloco Request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();
        try {

            // Bloco Response
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        }catch (Exception e){
            throw new RuntimeException("Não foi possivel consultar a moeda informada");
        }
    }
    public String consultaCodigos(){

        // Gerador da URL
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/ed302789f43692ef78baf497/codes");

        // Bloco Request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();
        try {
            // Bloco Response
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (Exception e){
            throw new RuntimeException("Não foi possivel consultar a moeda informada");
        }
    }
}
