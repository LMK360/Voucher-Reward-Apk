```java
import java.time.LocalDateTime;

public class RewardManager {
    private LocalDateTime lastClaimTime;

    public void claimReward() {
        if (lastClaimTime == null || TimerUtils.canClaim(lastClaimTime)) {
            lastClaimTime = LocalDateTime.now();
            System.out.println("🎉 You've received 200 voucher points!");
        } else {
            System.out.println("⏳ Please wait before claiming again.");
        }
    }
}
```
