package homework_43;

public class PasswordValidateExeption extends Exception{
    public PasswordValidateExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "PasswordValidateExeption | " + super.getMessage();
    }
}
