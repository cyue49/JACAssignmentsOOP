package Assignment4.Exception;

public class WithdrawLimitException extends BankAccountException {
    public WithdrawLimitException() {
        super("The withdraw limit has been reached.");
    }

    public WithdrawLimitException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
