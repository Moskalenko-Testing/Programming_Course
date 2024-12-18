package lesson_28.person;

import lesson_27.Day;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    //Метод, помеченный @BeforeEach будет выполняться перед каждым тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("Метод @BeforeEach");
    }
    /*



     */





    @Test
    public void testAddiotion(){
        System.out.println("Test addition");

        int result = 2 + 2;

        //assertEquals(expected,actual)
        Assertions.assertEquals(4,result);
        assertNotEquals(5,result);
        assertTrue(result >= 4);
        assertFalse(result > 4);
        assertNull(null);
        assertNotNull("String");
    }


    @Disabled
    @Test
    public void emptyTest(){
        System.out.println("Empty test");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,5,9,11})
    public void testNumbers(int number){
        System.out.println("number = " + number);
        assertTrue(number > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple","banana","cherry"})
    public void testFruit(String fruit){
        System.out.println("fruit : "+ fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @CsvSource({"apple, 1","banana, 2","cherry, 3"})
    void testWithCsvSource(String fruit,int rank){
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithCsvFileSource(String fruit,int rank,boolean flag){
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }
    @ParameterizedTest
    @EnumSource(Day.class)
    void testEnums(Day day) {
        System.out.println("day = " + day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWithMethodSource(String argument) {
        System.out.println("argument = " + argument);
        assertNotNull(argument);
    }

    static Stream<String> testDataString() {
        return Stream.of("apple", "banana", "cherry");
    }

    static Stream<Integer> testInteger() {
        return Stream.of(1, 5, 6, 7, 78, 8);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource2(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String email) {
        System.out.println("person = " + person);
        System.out.println("email = " + email);
        System.out.println("================\n");
    }

    static Stream<Arguments> testPersonsData() {
        Person person = new Person("test@mail.net", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.net"),
                Arguments.of(new Person("invalid.email.com", "password"), "mail.test.com")
        );
    }



}