import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {

    private static final Logger logger =
            LogManager.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        process();
    }

    public static void process() {

        logger.trace("From trace method");

        logger.debug("From debug method");

        logger.info("From info method");

        logger.warn("From warning method");

        logger.error("From error method");

        logger.fatal("From fatal method");
    }
}