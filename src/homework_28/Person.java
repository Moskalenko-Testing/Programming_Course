package homework_28;

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
