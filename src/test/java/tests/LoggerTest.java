package tests;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {
    private Logger logger = LogManager.getLogger(LoggerTest.class);

    @Test
    public void logLevelTest() {
        logger.trace("Trace Message: ...");
        logger.debug("Debug Message: ...");
        logger.info("Info Message: ...");
        logger.warn("Warning Message: ...");
        logger.error("Error Message: ...");
        logger.fatal("Fatal Message: ...");
    }
}