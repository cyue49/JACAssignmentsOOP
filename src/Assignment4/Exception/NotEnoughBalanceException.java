package Assignment4.Exception;

public class NotEnoughBalanceException extends BankAccountException {
    public NotEnoughBalanceException() {
        super("There isn't enough balance.");
    }

    public NotEnoughBalanceException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
