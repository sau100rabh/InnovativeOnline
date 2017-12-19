package app.innovativeaquafront.com.innovativeonline.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.innovativeaquafront.com.innovativeonline.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link UtilityContact.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link UtilityContact#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UtilityContact extends Fragment {

    public UtilityContact() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_utility_contact, container, false);
    }

}
