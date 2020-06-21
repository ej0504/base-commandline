package io.edwardjoyce.base.commandline;

public class EchoService {

    String echo(final String input) {
        return input == null || input.isBlank()
                ? "" : String.format("%s %s", input, input);
    }
}
