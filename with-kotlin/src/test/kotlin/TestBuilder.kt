import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * No native equivalent for @Builder in Kotlin.
 * Use constructor with named parameter instead.
 */
class TestBuilder {

    data class MyBigClass(
        var attr1: Int = 0,
        var attr2: Int = 0,
        var attr3: Int = 0,
        var attr4: Int = 0,
        var attr5: Int = 0,
        var attr6: Int = 0,
        var attr7: Int = 0,
        var attr8: Int = 0,
        var attr9: Int = 0,
    )

    @Test
    fun `should build a partial an instance`() {
        val instance = MyBigClass(attr3 = 42, attr5 = 99)
            .apply {
                attr8 = 888
            }

        assertEquals(
            "MyBigClass(attr1=0, attr2=0, attr3=42, attr4=0, " +
                    "attr5=99, attr6=0, attr7=0, attr8=888, attr9=0)",
            instance.toString()
        )
    }
}
