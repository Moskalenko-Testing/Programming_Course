package lesson_27.persons;

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
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
