```java
package utils;

public class TimerUtils {
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    public static boolean isOneHourPassed(long lastTime) {
        return (getCurrentTimestamp() - lastTime) >= 3600000;
    }
}
```
