import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TestValVar {

    @Test
    fun `should test Kotlin val operator`() {
        val complexeValue = mapOf(
            "firstList" to listOf("one", "two", "three")
        )

        assertTrue(complexeValue.isNotEmpty())
        assertTrue(complexeValue is Map<String, List<String>>)

        /*
        Forbidden: value is not reassignable
        complexeValue = mapOf("secondList" to listOf("one", "two"))
         */
    }

    @Test
    fun `should test Kotlin var operator`() {
        var complexeVariable = mapOf(
            "thirdList" to listOf("one", "two", "three")
        )
        complexeVariable = emptyMap()

        assertTrue(complexeVariable.isEmpty())
        assertTrue(complexeVariable is Map<String, List<String>>)
    }
}
