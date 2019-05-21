package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvap;
    TextView tvip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvap = findViewById(R.id.textViewap);
        tvip = findViewById(R.id.textViewip);

        tvap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Solution 1

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", 1);
                startActivity(intent);


                //Solution 2
                /*
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mcode","C346");
                intent.putExtra("mname","Android Programming");
                intent.putExtra("ayear",2018);
                intent.putExtra("sms",1);
                intent.putExtra("mcredit",4);
                intent.putExtra("venue","W66M");
                */


            }
        });

        tvip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Solution 1
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", 2);
                startActivity(intent);
            }
        });

    }
}
