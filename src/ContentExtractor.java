import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentExtractor implements IContentExtractor {

    private static final String API_NASA = "NASA";
    private static final String API_IMDB = "IMDB";
    private static final String API_BARB = "BARB"; //BARB is my API
    
    public List<Content> extractContents(String json, String apiName) {

        // Criar lista de conteúdos genéricos, para adaptar qualquer json (dados) para os padrões
        List<Content> genericContentList = new ArrayList<>();

        // Extrair dados desejados (título, poster, classificação) do json
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> contentList = jsonParser.parse(json);

        if (apiName == API_NASA)
        {
            // Popular lista de conteúdos genérica
            for (Map<String,String> content : contentList) {

                String title = content.get("title");
                String imageURL = content.get("url");
                String quote = title;

                var genericContent = new Content(title, imageURL, quote);

                genericContentList.add(genericContent);

            }
        }
        else if (apiName == API_IMDB)
        {
            // Popular lista de conteúdos genérica
            for (Map<String,String> content : contentList) {

                String title = content.get("title");
                String imageURL = content.get("image");
                String quote = title;

                var genericContent = new Content(title, imageURL, quote);

                genericContentList.add(genericContent);

            }
        }
        else if (apiName == API_BARB)
        {
            // Popular lista de conteúdos genérica
            for (Map<String,String> content : contentList) {

                String title = content.get("title");
                String imageURL = content.get("imageUrl");
                String quote = content.get("quote");

                var genericContent = new Content(title, imageURL, quote);

                genericContentList.add(genericContent);

            }
        }
        else
        {
            return null;
        }

        return genericContentList;

    }

}
