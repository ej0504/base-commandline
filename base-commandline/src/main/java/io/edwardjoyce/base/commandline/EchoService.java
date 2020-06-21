package io.edwardjoyce.base.commandline;

import com.google.inject.Inject;

import java.util.logging.Logger;

public class LoggingService {

    private final Logger logger;

    @Inject
    public LoggingService(final Logger logger) {
        this.logger = logger;
    }

    void log(final String input) {
        logger.info(input);
    }
}
