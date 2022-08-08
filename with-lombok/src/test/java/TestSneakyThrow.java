import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.SneakyThrows;

class TestSneakyThrow {

    @SneakyThrows(FileNotFoundException.class)
    String readFile(String filename) { // throws FileNotFoundException
        return new BufferedReader(new FileReader(filename)).lines()
                .collect(Collectors.joining());
    }

    @Test
    @DisplayName("should throw a sneaky exception")
    void shouldThrowASneakyException() {
        Assertions.assertThatThrownBy(() -> readFile("unknow file"))
                .isInstanceOf(FileNotFoundException.class);
    }
}
