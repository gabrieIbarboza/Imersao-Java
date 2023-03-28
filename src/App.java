import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*System.out.println("Hello, World!");*/

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";
        String resquestedData;

        // Conexão HTTP para buscar dados na API
        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address)
            .GET()
            .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        resquestedData = response.body();
    
        // Extrair dados desejados (título, poster, classificação)
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> listTopTVShows = jsonParser.parse(resquestedData);

        // Manipular e exibir os dados
        for (Map<String,String> tvShow : listTopTVShows) {

            var rating = Float.parseFloat(tvShow.get("imDbRating"));
			String star = "";
			for (int i = 0; i < rating; i++) {
				star += "⭐";
			}
            
            System.out.println(tvShow.get("title"));
            System.out.println(tvShow.get("image"));
            System.out.println(String.format("Rating: %.1f %n %s", rating, star));

        }
    }
}
