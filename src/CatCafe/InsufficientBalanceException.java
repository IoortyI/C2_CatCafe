package CatCafe;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String gripe){
        super(gripe);
    }
}
