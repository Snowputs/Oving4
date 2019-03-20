import java.net.SocketException;

public class runServer {
    public static void main(String[] args) {
        try{
            new EchoServer().start();
        }catch (SocketException e){
            e.printStackTrace();
        }
    }
}
