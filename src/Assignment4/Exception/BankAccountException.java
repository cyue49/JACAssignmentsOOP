package Assignment4.Exception;

public class BankAccountException extends Exception{
    public BankAccountException() {
        super("Bank account exception.");
    }

    public BankAccountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
