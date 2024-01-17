public class PremiumNotEnabledException extends Exception{
    public PremiumNotEnabledException() {
        super("Ai nevoie de abonamentul premium pentru a vizualiza acest film!");
    }
}
