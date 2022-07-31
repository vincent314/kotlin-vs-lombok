import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

class TestWith {

    @Data
    @AllArgsConstructor
    @With
    class User {
        private String firstname;
        private String lastname;
    }

    @Test
    @DisplayName("should clone an instance with With")
    void shouldCloneWithWith() {
        User user1 = new User("John", "Doe");
        User user2 = user1.withLastname("Smith");

        assertThat(user1)
                .hasToString("TestWith.User(firstname=John, lastname=Doe)");

        assertThat(user2)
                .hasToString("TestWith.User(firstname=John, lastname=Smith)");
    }
}
