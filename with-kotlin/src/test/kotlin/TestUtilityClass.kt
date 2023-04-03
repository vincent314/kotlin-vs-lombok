import kotlin.test.Test
import kotlin.test.assertEquals

// Standalone function
fun utilFunction1(input: String): String = input.uppercase()

// final by default
object Singleton {
    fun utilFunction2(input: String): String = input.uppercase()
}

// final by default
class ClassWithCompanion {
    // Kotlin syntax for static methods
    companion object {
        fun utilFunction3(input: String): String = input.uppercase()
    }
}

class TestUtilityClass {
    @Test
    fun `should test standalone function`() {
        assertEquals("HELLO WORLD", utilFunction1("hello world"))
    }

    @Test
    fun `should test singleton function`() {
        assertEquals("HELLO WORLD", Singleton.utilFunction2("hello world"))
    }

    @Test
    fun `should test with companion object`() {
        assertEquals("HELLO WORLD", ClassWithCompanion.utilFunction3("hello world"))
    }
}
