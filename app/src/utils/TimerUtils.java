java
package utils;

public class TimerUtils {
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    public static boolean isOneMinuetePassed(long lastTime) {
        return (getCurrentTimestamp() - lastTime) >= 3600000;
    }
}

