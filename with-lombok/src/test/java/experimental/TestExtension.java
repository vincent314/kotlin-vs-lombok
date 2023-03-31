package experimental;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.ExtensionMethod;

@ExtensionMethod({TestExtension.Extensions.class})
public class TestExtension {

    @Data
    @AllArgsConstructor
    public static class Person{
        String firstname;
        String lastname;
    }

    public static class Extensions {
        public static Person toPerson(String value){
            String[] split = value.split("\\|");
            return new Person(split[0], split[1]);
        }
    }

    @Test
    void testExtension() {
        Person person = "John|Doe".toPerson();

        assertThat(person.firstname).isEqualTo("John");
        assertThat(person.lastname).isEqualTo("Doe");
    }
}
