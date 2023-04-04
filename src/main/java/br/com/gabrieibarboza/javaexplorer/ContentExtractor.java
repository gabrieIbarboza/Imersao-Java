package main.java.br.com.gabrieibarboza.javaexplorer;
import java.util.List;
import java.util.Map;

public class ContentExtractor implements IContentExtractor {

    private static final String API_NASA = API.NASA.getId();
    private static final String API_IMDB = API.IMDB.getId();
    private static final String API_BARB = API.BARBOZA.getId(); //BARB is my API
    
    public List<Content> extractContents(String json, String apiId) {

        // Extrair dados desejados (título, poster, classificação) do json
        JsonParser jsonParser = new JsonParser();
        List<Map<String, String>> contentList = jsonParser.parse(json);

        if (apiId == API_NASA)
        {
            // Retornar lista de conteúdos genérica populada por contentList da API
            return contentList.stream()
            .map(content -> new Content(content.get("title"), content.get("url"), content.get("title")))
            .toList();
        }
        else if (apiId == API_IMDB)
        {
            // Retornar lista de conteúdos genérica populada por contentList da API
            return contentList.stream()
            .map(content -> new Content(content.get("title"), content.get("image"), content.get("title")))
            .toList();
        }
        else if (apiId == API_BARB)
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
