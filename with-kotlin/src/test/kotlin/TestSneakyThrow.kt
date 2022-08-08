import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.util.stream.Collectors

class TestSneakyThrow {

//    @Throws(FileNotFoundException::class)
    fun readFile(filename: String): String {
        return BufferedReader(FileReader(filename)).lines()
            .collect(Collectors.joining())
    }

    @Test
    fun `should throw a FileNotFoundException`() {
        assertThrows<FileNotFoundException> {
            readFile("unknown file")
        }
    }
}
