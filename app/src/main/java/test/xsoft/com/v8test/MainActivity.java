package test.xsoft.com.v8test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xsoft.bitable.BitableActivity;

public class MainActivity extends AppCompatActivity {
    private Button mStartBitableBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartBitableBtn = (Button)findViewById(R.id.start_btn);
        mStartBitableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BitableActivity.class);
                startActivity(intent);
            }
        });
    }
}
