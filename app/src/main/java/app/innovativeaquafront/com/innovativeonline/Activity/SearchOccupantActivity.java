package app.innovativeaquafront.com.innovativeonline.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import app.innovativeaquafront.com.innovativeonline.R;

public class SearchOccupantActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner searchOption = null;
    private EditText searchInput = null;
    TextView occupantName = null;
    TextView contactNumber = null;
    TextView flatNumber = null;
    TextView vehicleNumber = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_occupant);

        searchOption = (Spinner) findViewById(R.id.search_options);
        searchInput = (EditText) findViewById(R.id.editTxt_search_input);

        occupantName = (TextView) findViewById(R.id.txtView_ownername);
        contactNumber = (TextView) findViewById(R.id.txtView_contactNumber);
        flatNumber = (TextView) findViewById(R.id.txtView_flatNumber);
        vehicleNumber = (TextView) findViewById(R.id.txtView_vehicleNumber);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.search_options, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        searchOption.setAdapter(adapter);
        searchOption.setOnItemSelectedListener(this);

        searchInput.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(searchInput != null)
        {
            switch (position)
            {
                case 0:
                    searchInput.setHint("e.g. SAURABH YADAV");
                    break;
                case 1:
                    searchInput.setHint("e.g. 9919760929");
                    break;
                case 2:
                    searchInput.setHint("e.g. C406");
                    break;
                case 3:
                    searchInput.setHint("e.g. KAO3HN3333");
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void searchOccupant(View view)
    {
        occupantName.setText("Saurabh Yadav");
        contactNumber.setText("8880516501");
        flatNumber.setText("C406");
        vehicleNumber.setText("KA03HN3333");
    }

    public void callOccupant(View view)
    {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8880516501"));
        startActivity(intent);
    }

    public void messageOccupant(View view)
    {
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address", "8880516501");
        startActivity(smsIntent);
    }
}
