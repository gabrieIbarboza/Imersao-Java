package main.java.br.com.gabrieibarboza.javaexplorer;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class JavaExplorerApp {
    public static void main(String[] args) throws Exception {
        
        // Setando API em uso atualmente para gerar URL
        API currentAPI = API.BARBOZA;

        // Conexão HTTP para buscar dados na API
        ClientHttp httpClient = new ClientHttp();
        String resquestedData = httpClient.requestData(currentAPI.getUrl());
    
        // Extrair dados desejados (título, imagem)
        ContentExtractor extractor = new ContentExtractor();
        List<Content> contents = extractor.extractContents(resquestedData, currentAPI.getId());

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

            stickerGenerator.create(stickerName, imageInputStream, strickerText, currentAPI.getId());
        }
    }
}
