import java.util.List;
import java.util.Map;

public class ContentExtractor implements IContentExtractor {

    private static final String API_NASA = "NASA";
    private static final String API_IMDB = "IMDB";
    private static final String API_BARB = "BARB"; //BARB is my API
    
    public List<Content> extractContents(String json, String apiName) {

        // Extrair dados desejados (título, poster, classificação) do json
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> contentList = jsonParser.parse(json);

        if (apiName == API_NASA)
        {
            // Retornar lista de conteúdos genérica populada por contentList da API
            return contentList.stream()
            .map(content -> new Content(content.get("title"), content.get("url"), content.get("title")))
            .toList();
        }
        else if (apiName == API_IMDB)
        {
            // Retornar lista de conteúdos genérica populada por contentList da API
            return contentList.stream()
            .map(content -> new Content(content.get("title"), content.get("image"), content.get("title")))
            .toList();
        }
        else if (apiName == API_BARB)
        {
            // Retornar lista de conteúdos genérica populada por contentList da API
            return contentList.stream()
            .map(content -> new Content(content.get("title"), content.get("imageUrl"), content.get("quote")))
            .toList();
        }
        else
        {
            return null;
        }

    }

}
