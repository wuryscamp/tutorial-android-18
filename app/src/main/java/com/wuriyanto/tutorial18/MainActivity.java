package com.wuriyanto.tutorial18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = (Button) findViewById(R.id.btn_submit);

        buttonSubmit.setOnClickListener(new ButtonSubmitListener());
    }

    private class ButtonSubmitListener implements View.OnClickListener {

        private TimePicker timePicker;
        private TextView textView;

        public ButtonSubmitListener() {

            timePicker = (TimePicker) findViewById(R.id.time_picker);
            textView = (TextView) findViewById(R.id.tv_result);

            timePicker.setIs24HourView(true);
        }

        @Override
        public void onClick(View view) {

            StringBuilder builder = new StringBuilder();
            builder.append("Hour : "+timePicker.getCurrentHour());
            builder.append("\nMinute : "+timePicker.getCurrentMinute());

            textView.setText(builder.toString());
        }
    }
}
