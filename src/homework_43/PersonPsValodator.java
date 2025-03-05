package homework_43;

public class PersonPsValodator {
    public static void validPassword(String password) throws PasswordValidateExeption{
        if(password == null || password.length()< 8){
            System.out.println("Password  should be at least 8 characters");
            throw new PasswordValidateExeption("Password  should be at least 8 characters");
        }


        boolean[] result = new boolean[4];
        String symbols = "!%$@*()[]";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        if (!result[0]) throw new PasswordValidateExeption("Password must contain at least one digit");
        if (!result[1]) throw new PasswordValidateExeption("Password must contain at least one uppercase letter");
        if (!result[2]) throw new PasswordValidateExeption("Password must contain at least one lowercase letter");
        if (!result[3]) throw new PasswordValidateExeption("Password must contain at least one special character");
    }
}
