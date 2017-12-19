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
 * {@link UtilityRate.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link UtilityRate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UtilityRate extends Fragment {

    public UtilityRate() {
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
        return inflater.inflate(R.layout.fragment_utility_rate, container, false);
    }
}
