package sg.edu.rp.c346.id22035802.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etPhone;
    EditText etSize;
    CheckBox smoke;
    CheckBox nonSmoke;
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    Button btnConfirm;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.Name);
        etPhone = findViewById(R.id.phone);
        etSize = findViewById(R.id.size);
        tvDisplay = findViewById(R.id.textViewDisplay);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.buttonReset);
        btnConfirm = findViewById(R.id.button);
        smoke = findViewById(R.id.smoke);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getCurrentHour().toString() + ":" + tp.getCurrentMinute();
                tvDisplay.setText(time);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = "The date is " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear();
                tvDisplay.setText(date);
            }
        }); {
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tp.setCurrentHour(7);
                    tp.setCurrentMinute(30);
                    dp.updateDate(2020, 6, 1);
                    tvDisplay.setText("");
                }
            });
        }
    }

}