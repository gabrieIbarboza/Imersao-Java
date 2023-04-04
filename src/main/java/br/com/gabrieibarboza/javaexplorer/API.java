package main.java.br.com.gabrieibarboza.javaexplorer;
public enum API {
    
    BARBOZA("BARB", "https://barboza-first-api.agreeablerock-774901b7.southcentralus.azurecontainerapps.io/barboza-first-api"),
    IMDB("IMDB", "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json"),
    NASA("NASA", "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json");

    private String id;
    private String url;

    API(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }

}
