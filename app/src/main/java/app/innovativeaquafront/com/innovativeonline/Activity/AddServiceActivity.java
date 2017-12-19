package app.innovativeaquafront.com.innovativeonline.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import app.innovativeaquafront.com.innovativeonline.R;

public class AddServiceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_service);
    }

    public void setAvailabilityDateTime(final View view)
    {
        final View dialogView = View.inflate(this, R.layout.layout_set_availability, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setView(dialogView);

        alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DatePicker datePicker = (DatePicker) dialogView.findViewById(R.id.datePicker);
                TimePicker timePicker = (TimePicker) dialogView.findViewById(R.id.timePicker);
                TextView availableDateTime = (TextView) findViewById(R.id.textView_availableDateTime);

                Calendar calendar = GregorianCalendar.getInstance();
                calendar.set(Calendar.DATE,datePicker.getDayOfMonth());
                calendar.set(Calendar.MONTH,datePicker.getMonth());
                calendar.set(Calendar.YEAR,datePicker.getYear());

                calendar.set(Calendar.HOUR,timePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE,timePicker.getCurrentMinute());
                calendar.set(Calendar.AM_PM,timePicker.getCurrentHour() < 12 ? Calendar.AM : Calendar.PM);

                SimpleDateFormat formattedDateTime = new SimpleDateFormat("dd-MMM-yyyy hh:mm a");
                availableDateTime.setText(formattedDateTime.format(calendar.getTime()));
            }
        });

        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertDialog.create().show();
    }



}
