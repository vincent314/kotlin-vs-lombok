import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * The Map real instance is actually a field of DelegationMap.
 * Each MutableMap interface methods redirect to this instance.
 */
class DelegationMap : MutableMap<String, String> by mutableMapOf()

class TestDelegation {
    @Test
    fun `should add a value`() {
        val delegationMap = DelegationMap()
        delegationMap.put("name", "John Doe")

        assertEquals(delegationMap.get("name"), "John Doe")
    }
}
