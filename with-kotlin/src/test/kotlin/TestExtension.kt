import kotlin.test.Test
import kotlin.test.assertEquals

class Person(val firstname:String, val lastname:String)

fun String.toPerson():Person{
    val (firstname, lastname) = this.split("|")
    return Person(firstname, lastname)
}

class TestExtension {
    @Test
    fun `should map a person`(){
        val person = "John|Doe".toPerson()

        assertEquals("John",person.firstname)
        assertEquals("Doe",person.lastname)
    }
}
