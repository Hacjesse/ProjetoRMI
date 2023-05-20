import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteServer {
    public static void main(String[] args) {
        try {
            // cria o objeto remoto
            MyRemoteInterface remoteObj = new MyRemoteImpl();

            // registra o objeto remoto no Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MyRemoteObj", remoteObj);

            System.out.println("Servidor RMI pronto!");
            System.out.println("Servidor RMI pergunta: O que e o sol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
