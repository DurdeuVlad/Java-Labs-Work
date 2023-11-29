public class InvalidFundsExeception extends Exception{
    public InvalidFundsExeception() {
        super("Invalid funds!");
    }

    public InvalidFundsExeception(String message) {
        super(message);
    }
}
