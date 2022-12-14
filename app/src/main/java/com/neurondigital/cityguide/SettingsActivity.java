package com.neurondigital.cityguide;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import desoft.municipio.turifortul.R;

import android.view.View;

import com.neurondigital.helpers.MyPreferenceFragment;

/**
 * Settings activity which basically shows MyPreferenceFragment.
 * Done like this due to a limitation of PreferenceFragment
 */
public class SettingsActivity extends AppCompatActivity {

    Toolbar toolbar;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        this.context = this;

        //set toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // close on back button pressed
                finish();
            }
        });

        //set fragment to MyPreferenceFragment
        getFragmentManager().beginTransaction().replace(R.id.content, new MyPreferenceFragment()).commit();

    }


}
