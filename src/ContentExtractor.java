import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentExtractor implements IContentExtractor {

    private static final String API_NASA = "NASA";
    private static final String API_IMDB = "IMDB";
    
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

                var genericContent = new Content(title, imageURL);

                genericContentList.add(genericContent);

            }
        }
        else if (apiName == API_IMDB)
        {
            // Popular lista de conteúdos genérica
            for (Map<String,String> content : contentList) {

                String title = content.get("title");
                String imageURL = content.get("image");

                var genericContent = new Content(title, imageURL);

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
