package experimental;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.experimental.UtilityClass;

public class TestUtilityClass {

    @UtilityClass
    // final
    class VeryUtil{
        // static final
        public String toUpper(String input){
            return input.toUpperCase();
        }
    }

    @Test
    void testToUpper(){
        String result = VeryUtil.toUpper("hello world");
        Assertions.assertThat(result).isEqualTo("HELLO WORLD");
    }
}
