import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestNonNull {

    fun echo(message:String):String = "You said: $message"

    @Test
    fun `echo function should not allow null value`(){
        assertEquals("You said: Hello", echo("Hello"))

//        echo(null) -> *Compilation error*
    }
}
