public class Content {
    
    private final String title;
    private final String imageURL;
    private final String quote;

    // Constructors
    public Content(String title, String imageURL, String quote) {
        this.title = title;
        this.imageURL = imageURL;
        this.quote = quote;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getImageURL() {
        return imageURL;
    } 
    public String getQuote() {
        return quote;
    }

}
