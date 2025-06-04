```java
package core;

import utils.TimerUtils;
import java.util.Random;

public class RewardManager {
    private long lastClaimTime = 0;

    public boolean canClaim() {
        return TimerUtils.isOneHourPassed(lastClaimTime);
    }

    public String generateVoucherCode() {
        Random rand = new Random();
        return rand.nextInt(9000) + 1000 + "-" +
               rand.nextInt(9000) + 1000 + "-" +
               rand.nextInt(9000) + 1000 + "-" +
               rand.nextInt(9000) + 1000;
    }

    public String generateAirtimeCode(String network) {
        // Customize per network if needed
    String randomDigits = String.valueOf(1000 + new Random().nextInt(8999));
        return "*136*2*" + randomDigits + "#";
    }

    public String claimReward(String network) {
        if (canClaim()) {
            lastClaimTime = TimerUtils.getCurrentTimestamp();
            String voucher = generateVoucherCode();
            String airtime = generateAirtimeCode(network);
            return "🎁 200 Voucher: " + voucher + "\n📞 200GB Airtime: " + airtime;
        } else {
            return "⏳ Please wait before claiming again.";
        }
    }
}
```

---

*3. Main.java*  
`app/src/Main.java`

```java
import core.RewardManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RewardManager manager = new RewardManager();

        System.out.print("Enter your network (MTN/Vodacom/Telkom/Cell C): ");
        String network = scanner.nextLine().trim();

        String reward = manager.claimReward(network);
        System.out.println("\n=== Your Reward ===");
        System.out.println(reward);
    }
}
```
