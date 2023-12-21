package Assignment4.Exception;

public class InvalidAmountException extends Exception{
    public InvalidAmountException() {
        super("The amount is invalid.");
    }

    public InvalidAmountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
