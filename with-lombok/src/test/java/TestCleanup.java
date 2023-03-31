import java.io.IOException;
import java.io.StringWriter;

import lombok.Cleanup;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCleanup {

    @Test
    // throws IOException is mandatory …
    void shouldCleanResource() throws IOException {
        @Cleanup StringWriter out = new StringWriter();

        out.write("Hello Java");

        Assertions.assertThat(out.toString()).hasToString("Hello Java");
    }
}
