package lesson_43;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateExeption e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
        }
    }



    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        if (isPasswordValid(password)) {

            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    private boolean isPasswordValid(String password){
        if(password == null || password.length()< 8){
            System.out.println("Password  should be at least 8 characters");
            return false;
        }
        boolean isDigit = false;

        String symbols = "!%$@*()[]";
        boolean[] result = new boolean[4];

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch))result[0]= true;
            if (Character.isUpperCase(ch))result[1]=true;
            if (Character.isLowerCase(ch))result[2]=true;
            if (symbols.indexOf(ch)>=0)result[3]= true;
        }

        return result[0] && result[1] && result[2] && result[3];
    }
}
