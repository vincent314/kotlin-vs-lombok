import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.Data;
import lombok.Value;

class TestData {

    /**
     * Mutable Java bean with toString, equal and hashcode
     */
    @Data
    static class UserData {
        private String firstname;
        private String lastName;
    }

    @Value
    static class UserValue {
        String firstname;
        String lastname;
    }

    @Test
    @DisplayName("should data classes implement toString")
    void shouldDataImplementToString() {
        UserData userData = new UserData();

        userData.setFirstname("John");
        userData.setLastName("Doe");

        assertThat(userData).hasToString("TestData.UserData(firstname=John, lastName=Doe)");
    }

    @Test
    @DisplayName("should value classes implement toString")
    void shouldValueImplementToString(){
        UserValue userValue = new UserValue("Jane", "Doe");

        assertThat(userValue).hasToString("TestData.UserValue(firstname=Jane, lastname=Doe)");
    }
}
