import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.Builder;
import lombok.ToString;

class TestBuilder {

    @Builder
    @ToString
    static
    class MyBigClass{
        private int attr1;
        private int attr2;
        private int attr3;
        private int attr4;
        private int attr5;
        private int attr6;
        private int attr7;
        private int attr8;
        private int attr9;
    }

    @Test
    @DisplayName("should build a partial instance of MyBigClass")
    void shouldBuildAnInstance(){
        MyBigClass myInstance = MyBigClass.builder()
                .attr3(42)
                .attr5(99)
                .build();

        Assertions.assertThat(myInstance)
                .hasToString("TestBuilder.MyBigClass("
                        + "attr1=0, attr2=0, attr3=42, attr4=0, attr5=99, "
                        + "attr6=0, attr7=0, attr8=0, attr9=0)");
    }
}
