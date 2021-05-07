package exceptions;

public class ServerStartupException extends RuntimeException {

    //Add serialize versionID

    public ServerStartupException(String message) {
        super(message);
    }
}
