package com.neurondigital.helpers;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

//import com.google.firebase.messaging.FirebaseMessaging;
import com.neurondigital.cityguide.Configurations;
import desoft.municipio.turifortul.R;



public class MyPreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragment_settings);

        //get push notification preference and detect Change
        Preference myPref = findPreference("pref_enable_push_notifications");
        myPref.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                if ((boolean) o) {
                    //FirebaseMessaging.getInstance().subscribeToTopic(Configurations.FIREBASE_PUSH_NOTIFICATION_TOPIC);
                } else {
                    //FirebaseMessaging.getInstance().unsubscribeFromTopic(Configurations.FIREBASE_PUSH_NOTIFICATION_TOPIC);
                }
                return true;
            }
        });



    }
}
