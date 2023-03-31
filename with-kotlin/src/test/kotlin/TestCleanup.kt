import java.io.StringWriter
import kotlin.test.Test
import kotlin.test.assertEquals

class TestCleanup {

    @Test
    fun `should clean resource`() {
        val out = StringWriter()

        // Extension function 'use'
        out.use { it.write("Hello Kotlin") }

        assertEquals("Hello Kotlin", out.toString())
    }
}
