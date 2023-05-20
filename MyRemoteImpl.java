import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String processData(String data) throws RemoteException {
        // processa os dados recebidos e retorna a resposta
        return "Resposta processada para os dados: " + data;
    }
}
