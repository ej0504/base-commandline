package io.edwardjoyce.base.commandline;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Logger;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class LoggingServiceTest {

    @InjectMocks
    private LoggingService loggingService;

    @Mock
    private Logger logger;

    @Test
    public void testApp() {
        String input = "input";
        loggingService.log(input);
        verify(logger).info(input);
    }
}
