import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            // obtém a referência do objeto remoto no Registry
            InetAddress ip = InetAddress.getByName("localhost");
            Registry registry = LocateRegistry.getRegistry(ip.getHostAddress(), 1099);

            MyRemoteInterface remoteObj = (MyRemoteInterface) registry.lookup("MyRemoteObj");

            // chama o método remoto e recebe a resposta
            String data = "O sol é uma estrela";
            String result = remoteObj.processData(data);

            System.out.println("Resposta recebida: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
