import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestWith {

    data class User(val firstname: String, val lastname: String)

    @Test
    fun `should clone an instance with copy`() {
        val user1 = User("John","Doe")
        val user2 = user1.copy(lastname = "Smith")

        assertEquals("User(firstname=John, lastname=Doe)",user1.toString())
        assertEquals("User(firstname=John, lastname=Smith)",user2.toString())
    }
}
