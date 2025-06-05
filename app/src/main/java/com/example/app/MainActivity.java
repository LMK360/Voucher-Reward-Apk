java
package com.example.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView rewardText = new TextView(this);
        rewardText.setText("Your voucher code:\n" + generateVoucher());

        setContentView(rewardText);
    }

    private String generateVoucher() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 16).toUpperCase();
    }
  }
