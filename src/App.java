import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";

        // Conexão HTTP para buscar dados na API
        var httpClient = new ClientHttp();
        String resquestedData = httpClient.requestData(url);
    
        // Extrair dados desejados (título, poster, classificação)
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> contentList = jsonParser.parse(resquestedData);

        // Manipular e exibir os dados

        StickerGenerator stickerGenerator = new StickerGenerator();

        for (Map<String,String> content : contentList) {

            var rating = Float.parseFloat(content.get("imDbRating"));
			String star = "";
			for (int i = 0; i < rating; i++) {
				star += "⭐";
			}
            
            System.out.println(content.get("title"));
            System.out.println(content.get("image"));
            System.out.println(String.format("Rating: %.1f %s", rating, star));

            // Gerar Sticker
            String imageURL = (content.get("image"));
            String stickerName = ((content.get("rank")) + "_" + (content.get("title")))
                .replaceAll("\\s+","");
            InputStream imageInputStream = new URL(imageURL).openStream();;
            String strickerText = (content.get("title"));

            stickerGenerator.create(stickerName, imageInputStream, strickerText);

        }
    }
}
