// CurrentAPIException herda de RuntimeException
public class CurrentAPIException extends RuntimeException{

    public CurrentAPIException(String message) {

        //Passar mensagem para a superclasse (a mãe)
        super(message);

    }

}
