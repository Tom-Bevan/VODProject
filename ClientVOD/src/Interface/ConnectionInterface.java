package Interface;



public interface ConnectionInterface {

    boolean signUp (String mail, String pwd) throws SignUpFailed; //(eg, if a client with this email already exists)

    VODServiceInterface login(String mail, String pwd) throws InvalidCredentialsException; //(if mail/pwd don't match)

    class InvalidCredentialsException extends Exception {
    }

    class SignUpFailed extends Exception {
    }
}
