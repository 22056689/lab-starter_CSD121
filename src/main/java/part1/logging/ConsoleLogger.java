package part1.logging;

import java.time.Instant;

public class ConsoleLogger {
    public void log(String message, LogLevel level) {
        System.out.println(Instant.now().toString() + " [" + level + "] " + message);
    }
}
