package app.innovativeaquafront.com.innovativeonline.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import app.innovativeaquafront.com.innovativeonline.R;
import app.innovativeaquafront.com.innovativeonline.Support.AssociationMember;
import app.innovativeaquafront.com.innovativeonline.Support.ServiceStatus;

/**
 * Created by Saurabh Yadav on 25-Sep-16.
 */

public class ServiceStatusAdapter extends RecyclerView.Adapter<ServiceStatusAdapter.ViewHolder> {

    private ArrayList<ServiceStatus> serviceList = null;

    public ServiceStatusAdapter(ArrayList<ServiceStatus> serviceStatusList) {
        this.serviceList = serviceStatusList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView mTextView_serviceId = null;
        TextView mTextView_serviceType = null;
        TextView mTextView_serviceDate = null;
        TextView mTextView_serviceStatus = null;

        public ViewHolder(View itemView) {
            super(itemView);

            mTextView_serviceId = (TextView) itemView.findViewById(R.id.txtView_service_Id);
            mTextView_serviceType = (TextView) itemView.findViewById(R.id.txtView_Service_Type);
            mTextView_serviceDate = (TextView) itemView.findViewById(R.id.txtView_Service_Date);
            mTextView_serviceStatus = (TextView) itemView.findViewById(R.id.txtView_Service_Status);
        }
    }
    @Override
    public ServiceStatusAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_service_status, parent, false);
        ServiceStatusAdapter.ViewHolder vh = new ServiceStatusAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ServiceStatusAdapter.ViewHolder holder, int position) {
        holder.mTextView_serviceId.setText(serviceList.get(position).getServiceId());
        holder.mTextView_serviceType.setText(serviceList.get(position).getServiceType());
        holder.mTextView_serviceDate.setText(serviceList.get(position).getServiceDate());
        holder.mTextView_serviceStatus.setText(serviceList.get(position).getServiceStatus());
    }

    @Override
    public int getItemCount() {
        return serviceList != null ? serviceList.size() : 0;
    }
}
