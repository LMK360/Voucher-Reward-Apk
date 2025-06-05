java
package com.yourappname;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.content.ClipData;
import java.util.Random;

public class MainActivity extends Activity {

    private TextView voucherText;
    private Button copyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        voucherText = findViewById(R.id.voucherText);
        copyButton = findViewById(R.id.copyButton);

        String generatedCode = generateVoucherCode();
        voucherText.setText(generatedCode);

        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("voucher", voucherText.getText().toString());clipboard.setPrimaryClip(clip);
            }
        });
    }

    private String generateVoucherCode() {
        StringBuilder code = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 16; i++) {
            code.append(rand.nextInt(10));
        }
        return code.toString();
    }
}
