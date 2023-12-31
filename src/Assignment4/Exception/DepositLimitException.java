package Assignment4.Exception;

public class DepositLimitException extends BankAccountException {
    public DepositLimitException() {
        super("The deposit limit has been exceeded.");
    }

    public DepositLimitException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
