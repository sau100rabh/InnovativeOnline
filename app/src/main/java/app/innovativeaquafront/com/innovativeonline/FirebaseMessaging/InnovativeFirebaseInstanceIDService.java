package app.innovativeaquafront.com.innovativeonline.FirebaseMessaging;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Saurabh Yadav on 28-Sep-16.
 */

public class InnovativeFirebaseInstanceIDService extends FirebaseInstanceIdService {

    String TAG = "InnovativeOnlineService";
    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}
