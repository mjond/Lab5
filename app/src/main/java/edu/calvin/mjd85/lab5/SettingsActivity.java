package edu.calvin.mjd85.lab5;

/**
 * Created by Mark Davis mjd85 on 10/7/2016.
 * Class for the settings preference
 * lab05, CS262, Calvin College
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {
    //basic activity build.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display the ragment as the main content
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
    }
}