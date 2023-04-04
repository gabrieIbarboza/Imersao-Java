package main.java.br.com.gabrieibarboza.javaexplorer;
// ClientHttpException herda de RuntimeException
public class ClientHttpException extends RuntimeException {

    public ClientHttpException(String message) {

        //Passar mensagem para a superclasse (a mãe)
        super(message);

    }

}
