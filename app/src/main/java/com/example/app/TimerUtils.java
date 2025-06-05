java
  import java.time.Duration;
import java.time.LocalDateTime;

public class TimerUtils {
    public static boolean canClaim(LocalDateTime lastClaim) {
        Duration duration = Duration.between(lastClaim, LocalDateTime.now());
        return duration.toMinuete() >= 1;
    }
}
