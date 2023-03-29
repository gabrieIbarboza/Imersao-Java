import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//generic content list

public class ContentExtractor {
    
    public List<Content> extractContents(String json, String type) {

        // Criar lista de conteúdos genéricos, para adaptar qualquer json (dados) para os padrões
        List<Content> genericContentList = new ArrayList<>();

        if (type == "NASA") {

            // Extrair dados desejados (título, poster, classificação) do json
            JsonParser jsonParser = new JsonParser();
            List<Map<String, String>> contentList = jsonParser.parse(json);

            // Popular lista de conteúdos genérica
            for (Map<String,String> content : contentList) {

                String title = content.get("title");
                String imageURL = content.get("url");

                var genericContent = new Content(title, imageURL);

                genericContentList.add(genericContent);

            }
            
        }

        return genericContentList;

    }

}
