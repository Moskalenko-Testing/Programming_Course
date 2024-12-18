package homework_28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @ParameterizedTest
    @MethodSource("validPasswordData")
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        assertEquals(validPassword, person.getPassword());
    }

    static Stream<String> validPasswordData() {
        return Stream.of(
                "Valid123@",
                "My$ecurePass2024",
                "Str0ngP@ssw0rd",
                "NewP@ss12345",
                "SuperP@ssw0rD!",
                "Ch@ngeMeNow123",
                "Qwerty1234!",
                "Welcome@1234",
                "S3cur3P@ssword",
                "Tricky!Passw0rd"
        );
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        assertNotEquals(invalidPassword, person.getPassword());
        assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "abc123!",
                "qwerty!234",
                "1234abcd",
                "mypassword@",
                "passw0rdd!",
                "abcdefg123!",
                "123abc@321",
                "securepassword",
                "Xx@password"
        );
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail, person.getEmail());
        assertNotEquals(startEmail, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"
        );
    }
}
