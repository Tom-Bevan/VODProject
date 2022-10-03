package Implementation;

import Interface.ConnectionInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;

public class Connection extends UnicastRemoteObject  implements ConnectionInterface{
    private FileWriter credentials;

    protected Connection(int numport) throws IOException {
        super(numport);
        String csvFilename = "../Data/credentials.csv";
        try {
            credentials = new FileWriter(csvFilename);
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
    };

    @Override
    public boolean signUp(String mail, String pwd) throws SignUpFailed {

        return false;
    }

    @Override
    public VODService login(String mail, String pwd) throws InvalidCredentialsException {
        return null;
    }


}
