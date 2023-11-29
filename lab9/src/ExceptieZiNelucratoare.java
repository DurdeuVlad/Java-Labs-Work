public class ExceptieZiNelucratoare extends Exception{
    public ExceptieZiNelucratoare() {
        super("Un lucrator a fost pus intr-o zi nelucratoare!");
    }

    public ExceptieZiNelucratoare(String message) {
        super(message);
    }
}
