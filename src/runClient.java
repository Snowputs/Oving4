import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class runClient {
    public static void main(String[] args) {
        try{
            EchoClient client = new EchoClient();
            boolean running = true;
            while(running){
                stringMath inn = new stringMath(getA(""), getB(""), getop());
                String resp = client.sendEcho(inn.getLoad());
                System.out.println(resp);
            }
            client.close();


        }catch (IOException e){
            e.printStackTrace();

        }
    }

    static int getA(String message){
        String a = JOptionPane.showInputDialog(message +"Skriv tall 1:");
        try{
            return Integer.parseInt(a);
        }catch (NumberFormatException e){
            return getA("Dårlig input, prøv igen \n");
        }


    }
    static int getB(String message){
        String b = JOptionPane.showInputDialog(message+ "Skriv tall 2:");
        try{
            return Integer.parseInt(b);
        }catch (NumberFormatException e){
            return getB("Dårlig input, prøv igen \n");
        }
    }

    static String getop(){
        Object[] options = {"+", "-"};
        int n = JOptionPane.showOptionDialog(
                null,
                "Addere eller subtrahere?",
                "operator",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                "+");
        if (n == 0){
            return "+";
        }else {
            return "-";
        }
    }
}
