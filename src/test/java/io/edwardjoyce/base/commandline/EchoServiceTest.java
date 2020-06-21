package io.edwardjoyce.base.commandline;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class EchoServiceTest {

    @InjectMocks
    private EchoService echoService;

    private static Stream<Arguments> dataForShouldEcho() {
        return Stream.of(
                Arguments.of("input", "input input"),
                Arguments.of("", ""),
                Arguments.of("  ", ""),
                Arguments.of(null, ""));
    }

    @ParameterizedTest
    @MethodSource(value = "dataForShouldEcho")
    public void testApp(final String input, final String expectedOutput) {
        assertThat(echoService.echo(input)).isEqualTo(expectedOutput);
    }
}
