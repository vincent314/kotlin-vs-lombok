import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.NonNull;

class TestNonNull {

    String echo(@NonNull String message) {
        return "You said: " + message;
    }

    @Test
    @DisplayName("should not authorize null value")
    void shouldNotAuthorizeNullValue() {
        assertThat(echo("Hello")).isEqualTo("You said: Hello");

        assertThatThrownBy(() -> echo(null))
                .isInstanceOf(NullPointerException.class);
    }
}

