package lesson_43;

public class PersonValidator {
    public static void validateEmail(String email) throws EmailValidateExeption {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateExeption("@ error");

        if (email.indexOf('.', indexAt + 2) == -1) throw new EmailValidateExeption(". after @ error");

        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateExeption("last . error");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '_' || ch == '-' || ch == '.' || ch == '@')) {
                throw new EmailValidateExeption("illegal symbol");
            }

        }
        if(indexAt == 0) throw new EmailValidateExeption("@ should not be first");

        if(!Character.isAlphabetic(email.charAt(0))) throw new EmailValidateExeption("first symbol should be letter");


    }
}
