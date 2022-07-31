import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.val;

class TestValVar {

    @Test
    @DisplayName("should test the lombok val operator")
    void shouldTestValOperator() {
        // final Map<String,List<String>>
        val complexeValue = Map.of(
                "firstList",
                List.of("one", "two", "three")
        );
        assertThat(complexeValue)
                .isNotEmpty()
                .isInstanceOf(Map.class);
        assertThat(complexeValue.get("firstList"))
                .isNotEmpty()
                .isInstanceOf(List.class);
        /*
         Forbidden: complexeType is final
         complexeType = Map.of(
              "secondList",
              List.of("one", "two")
         );
        */
    }

    @Test
    @DisplayName("should test the Java 10 var operator")
    void shouldTestVarOperator() {
        // non-final Map<String,List<String>>
        // *Non-lombok feature, using Java 10 var key declaration*
        var complexeVariable = Map.of(
                "thirdList",
                List.of("one", "two")
        );
        complexeVariable = Map.of();

        assertThat(complexeVariable).isEmpty();
    }
}
