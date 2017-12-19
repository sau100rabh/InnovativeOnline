package app.innovativeaquafront.com.innovativeonline.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import app.innovativeaquafront.com.innovativeonline.Adapter.AssociationAdapter;
import app.innovativeaquafront.com.innovativeonline.Adapter.ServiceStatusAdapter;
import app.innovativeaquafront.com.innovativeonline.R;
import app.innovativeaquafront.com.innovativeonline.Support.AssociationMember;
import app.innovativeaquafront.com.innovativeonline.Support.ServiceStatus;

public class ServiceRequestActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_request);

        mRecyclerView = (RecyclerView) findViewById(R.id.servicestatus_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        ArrayList<ServiceStatus> list = new ArrayList<ServiceStatus>();
        ServiceStatus s1 = new ServiceStatus();
        s1.setServiceId("123");
        s1.setServiceType("Plumber");
        s1.setServiceDate("21-09-2016");
        s1.setServiceStatus("OPEN");

        ServiceStatus s2 = new ServiceStatus();
        s2.setServiceId("123");
        s2.setServiceType("Electrician");
        s2.setServiceDate("15-09-2016");
        s2.setServiceStatus("CLOSED");


        list.add(s1);
        list.add(s2);

        mAdapter = new ServiceStatusAdapter(list);

        mRecyclerView.setAdapter(mAdapter);
    }

    public void addServiceRequest(View view)
    {
        Intent addServiceIntent = new Intent(getApplicationContext(),AddServiceActivity.class);
        startActivity(addServiceIntent);
    }

}
