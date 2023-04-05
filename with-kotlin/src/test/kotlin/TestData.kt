import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestData {
    /**
     * Mutable Data class with nullable attributes with default value
     */
    data class UserData(
        var firstname: String? = null,
        var lastname: String? = null,
    )

    /**
     * Immutable Data class
     */
    data class UserDataImmutable(val firstname: String?, val lastname: String?)

    @Test
    fun `should data class implement toString`() {
        val user1 = UserData()
        user1.firstname = "John"
        user1.lastname = "Doe"

        assertEquals("UserData(firstname=John, lastname=Doe)", user1.toString())
    }

    @Test
    fun `should data class implement equals`() {
        val user1 = UserData("John", "Doe")
        val user2 = UserData("John", "Doe")

        assertEquals(user1, user2)
    }

    @Test
    fun `should create an immutable user`(){
        val immutableUser = UserDataImmutable("François","Pignon")
//        immutableUser.firstname = "Jean"

        assertEquals("UserDataImmutable(firstname=François, lastname=Pignon)",immutableUser.toString())
    }
}
