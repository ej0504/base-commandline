package io.edwardjoyce.base.commandline;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.logging.Logger;

public class App {

    @Inject
    private final EchoService echoService;

    @Inject
    private final Logger logger;

    @Inject
    public App(final EchoService echoService,
               final Logger logger) {
        this.echoService = echoService;
        this.logger = logger;
    }

    public static void main(String... args) {
        Injector injector = Guice.createInjector();
        injector.getInstance(App.class).start(args);
    }

    public void start(final String... args) {
        if(args == null || args.length != 1) {
            throw new IllegalArgumentException("Expected exactly 1 argument.");
        }
        logger.info(echoService.echo(args[0]));
    }
}
