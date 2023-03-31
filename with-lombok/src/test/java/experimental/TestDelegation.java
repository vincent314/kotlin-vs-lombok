package experimental;

import java.util.HashMap;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.experimental.Delegate;

public class TestDelegation {

    public static class DelegationMap {
        public interface DelegatedMethods {
            void put(String key, String value);

            String get(String key);
        }

        @Delegate(types = DelegatedMethods.class)
        private final Map<String, String> map = new HashMap<>();
    }

    @Test
    void testDelegationMap() {
        DelegationMap delegationMap = new DelegationMap();
        delegationMap.put("name", "John Doe");

        Assertions.assertThat(delegationMap.get("name")).isEqualTo("John Doe");
    }
}
