package com.xyzcorp.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;

public class ProgrammerTest {

    
    @Test
    public void testFullName() {
        Programmer programmer = new Programmer(
            "Bjarne", "Strousoup", LocalDate.of(1950, 12, 30),
             () -> LocalDate.of(2018, 6, 1));
         assertThat(programmer.getFullName()).isEqualTo("Bjarne Strousoup");
    }
}
