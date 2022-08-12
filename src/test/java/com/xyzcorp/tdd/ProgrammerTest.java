package com.xyzcorp.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ProgrammerTest {

    
    @Test
    public void testSomething() {
        assertThat("1").isEqualTo("1");
    }
}
