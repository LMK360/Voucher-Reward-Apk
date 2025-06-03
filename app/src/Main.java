```java
package app;

import utils.TimerUtils;

public class Main {
    public static void main(String[] args) {
        if (TimerUtils.isEligible()) {
            System.out.println("✅ You've received your 200 voucher!");
            TimerUtils.saveLastClaimTime();
        } else {
            System.out.println("⏳ You must wait before claiming again.");
        }
    }
}
