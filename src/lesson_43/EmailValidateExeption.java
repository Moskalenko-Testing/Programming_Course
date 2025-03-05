package lesson_43;

public class EmailValidateExeption extends Exception{
    public EmailValidateExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "EmailValidateExeption | " + super.getMessage();
    }
}
