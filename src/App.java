import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";
        //String apiName = "IMDB";
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json";
        //String apiName = "NASA";
        String url = "https://barboza-first-api.agreeablerock-774901b7.southcentralus.azurecontainerapps.io/barboza-first-api";
        String apiName = "BARB";

        // Conexão HTTP para buscar dados na API
        ClientHttp httpClient = new ClientHttp();
        String resquestedData = httpClient.requestData(url);
    
        // Extrair dados desejados (título, imagem)
        ContentExtractor extractor = new ContentExtractor();
        List<Content> contents = extractor.extractContents(resquestedData, apiName);

        // Manipular e exibir os dados

        StickerGenerator stickerGenerator = new StickerGenerator();

        for (int i = 0; i < contents.size(); i++)
        {
            Content content = contents.get(i);

            System.out.println(content.title());
            System.out.println(content.imageURL());
            System.out.println(content.quote());

            // Gerar Sticker
            String imageURL = (content.imageURL());
            InputStream imageInputStream = new URL(imageURL).openStream();
            String stickerName = (i + 1) + "_" + ((content.title())
                .replaceAll("[^a-zA-Z]","")
                .trim());
            String strickerText = (content.quote());

            stickerGenerator.create(stickerName, imageInputStream, strickerText, apiName);
        }
    }
}
