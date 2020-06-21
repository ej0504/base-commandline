package io.edwardjoyce.base.commandline;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AppTest {

    @Test
    void shouldThrowException_emptyVarArgs() {
        assertThatThrownBy(App::main)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Expected exactly 1 argument.");
    }

    @Test
    void shouldThrowException_tooManyVarArgs() {
        assertThatThrownBy(() -> App.main("one", "two"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Expected exactly 1 argument.");
    }
}