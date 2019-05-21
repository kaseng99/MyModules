package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ModuleDetailActivity extends AppCompatActivity {

TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay.findViewById(R.id.textView);


        //Solution 1
        Intent intentReceived = getIntent();
        int num = intentReceived.getIntExtra("code", 0);
        String mssg="";
        if(num==1){
            mssg = "Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2018\nSemester: 1\nModule Credit: 4\nVenue: W66M";


            tvDisplay.setText(mssg);

        }
        if(num==2){
            //same as num==1
        }
        //Solution 2
        /*
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("mcode");
        String name = intentReceived.getStringExtra("mname");
        int year = intentReceived.getIntExtra("ayear", 8102);
        int semester = intentReceived.getIntExtra("sms",11);
        int credit = intentReceived.getIntExtra("mcredit",44);
        String vn = intentReceived.getStringExtra("venue");

        tvDisplay.setText("Module Code: " + code);
        tvDisplay.setText("Module Name: " + name);
        tvDisplay.setText("Academic Year: " + year);
        tvDisplay.setText("Semester: " + semester);
        tvDisplay.setText("Module Credit: " + credit);
        tvDisplay.setText("Venue: " + vn);
        */

    }
}
