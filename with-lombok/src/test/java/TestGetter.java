import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.Getter;
import lombok.Setter;

class TestGetter {

    /**
     * Immutable java bean
     * see record in Java 18
     */
    @Getter
    @Setter
    static class User {
        private String firstname;
        private String lastname;
    }

    @Test
    @DisplayName("should test user getters")
    void shouldTestUserGetters() {
        User user = new User();
        user.setFirstname("John");
        user.setLastname("Doe");

        assertThat(user.getFirstname()).isEqualTo("John");
        assertThat(user.getLastname()).isEqualTo("Doe");
    }
}
