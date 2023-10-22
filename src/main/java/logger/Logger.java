package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger {
    private static Logger instance = null;

    private Logger() {
        // Приватный конструктор
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = Logger.getLogger("ComplexCalculator");
            instance.setLevel(Level.INFO);
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(Level.INFO);
            instance.addHandler(handler);
        }
        return instance;
    }

    public void log(String message) {
        instance.info(message);
    }
}
