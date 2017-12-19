package app.innovativeaquafront.com.innovativeonline.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import app.innovativeaquafront.com.innovativeonline.R;
import app.innovativeaquafront.com.innovativeonline.Support.AssociationMember;

/**
 * Created by Saurabh Yadav on 23-Sep-16.
 */

public class AssociationAdapter extends RecyclerView.Adapter<AssociationAdapter.ViewHolder> {

    private ArrayList<AssociationMember> memberList = null;

    public AssociationAdapter(ArrayList<AssociationMember> memberList) {
        this.memberList = memberList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView mTextView_name = null;
        TextView mTextView_contact = null;
        TextView mTextView_flat = null;
        TextView mTextView_post = null;

        public ViewHolder(View itemView) {
            super(itemView);

            mTextView_name = (TextView) itemView.findViewById(R.id.txtView_asstmem_name);
            mTextView_contact = (TextView) itemView.findViewById(R.id.txtView_asstmem_contact);
            mTextView_flat = (TextView) itemView.findViewById(R.id.txtView_asstmem_flat);
            mTextView_post = (TextView) itemView.findViewById(R.id.txtView_asstmem_post);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_association_member, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextView_name.setText(memberList.get(position).getName());
        holder.mTextView_contact.setText(memberList.get(position).getContact());
        holder.mTextView_flat.setText(memberList.get(position).getFlat());
        holder.mTextView_post.setText(memberList.get(position).getPost());
    }

    @Override
    public int getItemCount() {
        return memberList != null ? memberList.size() : 0;
    }


}
