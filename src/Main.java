import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        double valor = 0;
        int escolha = 0;
        String moeda;

        System.out.println("Digite a moeda que deseja consultar");
        moeda = leitura.nextLine();

        //ConsultarMoeda consulta = new ConsultarMoeda();
        //Moeda novaMoeda = consulta.consultaMoeda(moeda);
        //System.out.println(novaMoeda);

        // Gerador da URL
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/ed302789f43692ef78baf497/latest/"+moeda);

        // Bloco Request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        //try {

        // Bloco Response
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String retornoCotacao = response.body();
        Gson cotacaoGson = new Gson();
        Moeda novaMoeda = cotacaoGson.fromJson(retornoCotacao, Moeda.class);
        System.out.println(novaMoeda);
    }
}