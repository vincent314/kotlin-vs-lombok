import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestGetter {
    /**
     * Classic mutable Java Bean with nullable attributes with default values
     */
    class User {
        var firstname: String? = null
        var lastname: String? = null
    }

    @Test
    fun `should test User getters`() {
        val user = User()
        user.firstname = "John"
        user.lastname = "Doe"

        assertEquals("John",user.firstname)
        assertEquals("Doe",user.lastname)
    }
}
