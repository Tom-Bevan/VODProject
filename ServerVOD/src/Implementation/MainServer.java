package Implementation;

import Interface.ClientBox;
import Interface.ConnectionInterface;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class MainServer {
    public static void main(String[] args) throws IOException {
        Registry reg = LocateRegistry.createRegistry(2001);

        Connection connection=new Connection(10001);
        reg.rebind("ClientConnection",connection);
    }
    private ArrayList<ClientBox> clients;

    private List<MovieDesc> movies;

}