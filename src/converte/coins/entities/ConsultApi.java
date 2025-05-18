package converte.coins.entities;

import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConsultApi {
    private static final String API_KEY = "6a38809cc020c272e51d5c99";

    public double getQuotation(String base, String destiny){
        try {
            String baseEncoded = URLEncoder.encode(base, StandardCharsets.UTF_8);
            URI url = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + baseEncoded);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(url).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Quotation quotation = gson.fromJson(response.body(), Quotation.class);

            return quotation.conversion_rates().getOrDefault(destiny, -1.0);
        }catch (Exception e){
            System.err.println("Erro: " + e.getMessage());
            return -1.0;
        }
    }
}
