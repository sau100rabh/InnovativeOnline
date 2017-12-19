package app.innovativeaquafront.com.innovativeonline.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.innovativeaquafront.com.innovativeonline.R;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void showAssociationDetails(View v)
    {
        Intent membersPage = new Intent(getApplicationContext(),AssociationDetailsActivity.class);
        startActivity(membersPage);
    }

    public void showSearchPage(View v)
    {
        Intent searchPageIntent = new Intent(getApplicationContext(),SearchOccupantActivity.class);
        startActivity(searchPageIntent);
    }

    public void showUtilityContactsDetails(View v)
    {
        Intent utilityContact = new Intent(getApplicationContext(),UtilityContactsActivity.class);
        startActivity(utilityContact);
    }

    public void showComplaintsPage(View v)
    {
        Intent serviceRequestIntent = new Intent(getApplicationContext(),ServiceRequestActivity.class);
        startActivity(serviceRequestIntent);
    }
}
