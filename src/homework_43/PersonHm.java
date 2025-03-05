package homework_43;

import lesson_43.EmailValidateExeption;
import lesson_43.PersonValidator;

public class PersonHm {
    private String email;
    private String password;

    public PersonHm(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
            this.email = email;
        }
    }

    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        if (email.indexOf('.', indexAt + 2) == -1) return false;

        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '_' || ch == '-' || ch == '.' || ch == '@')) {
                return false;
            }

        }
        if(indexAt == 0) return false;

        if(!Character.isAlphabetic(email.charAt(0))) return false;

        return true;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        try {
                PersonPsValodator.validPassword(password);
                System.out.println("Password is valid");
                this.password = password;
            } catch (PasswordValidateExeption e) {
                System.out.println("Вы ввели некорректный password: " + e.getMessage());;
            }
        }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
