package main.java.br.com.gabrieibarboza.javaexplorer;
import java.util.List;

public interface IContentExtractor {
    
    List<Content> extractContents(String json, String apiId);

}
