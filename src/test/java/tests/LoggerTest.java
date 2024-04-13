package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
    private Logger logger  = LogManager.getLogger(LoggerTest.class);

    @Test
    public void loggerTest() {
        logger.trace("Trace message:.... ");
        logger.debug("debug message:.... ");
        logger.info("info message:.... ");
        logger.warn("warn message:.... ");
        logger.error("error message:.... ");
        logger.fatal("fatal message:.... ");
    }
}
