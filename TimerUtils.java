```java
  import java.time.Duration;
import java.time.LocalDateTime;

public class TimerUtils {
    public static boolean canClaim(LocalDateTime lastClaim) {
        Duration duration = Duration.between(lastClaim, LocalDateTime.now());
        return duration.toHours() >= 1;
    }
}
```

---

✅ 3. *How to Upload to GitHub*

From Termux or Git:
```bash
git add .
git commit -m "Initial Java logic for voucher claim"
git push origin main
```

---

✅ 4. *Next Steps*

Once the code is uploaded:
- I’ll help you make it into an Android app (APK).
- Then connect a simple UI using XML.
- You can build the APK using an Android compiler like *Sketchware Pro* or *Replit + Termux*.

Let me know when you’ve uploaded this structure or if you want to proceed to the APK build step.
