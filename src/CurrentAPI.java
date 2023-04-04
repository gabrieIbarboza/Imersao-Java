public class CurrentAPI {
    
    private final String url;
    private final String name;

    public CurrentAPI(String name) {

        this.name = name;
        
        switch (name) {
            case "BARB":
                this.url = "https://barboza-first-api.agreeablerock-774901b7.southcentralus.azurecontainerapps.io/barboza-first-api";
                break;
            case "NASA":
                this.url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json";
                break;
            case "IMDB":
                this.url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";
                break;
            default:
                this.url = "https://no-api-found-for-gabrielbarbozasapp.com";
                break;
        }

    }

    public String getUrl() {
        return url;
    }
    public String getName() {
        return name;
    }

    

}
