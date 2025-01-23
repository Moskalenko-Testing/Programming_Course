package lesson_29.equals;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private int age;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;// Проверка на сравнение с самим собой
        if (obj == null || this.getClass() != obj.getClass())
            return false; // Проверка на совпадение классов тоисть типов объектов
        Employee employee = (Employee) obj;
        if (!Objects.equals(this.name, employee.name)) return false;
        if (Objects.equals(this.lastName, employee.lastName)) return false;
        return this.age == employee.age;
    }


    @Override
    public String toString() {
        return "Employee: {" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


}
