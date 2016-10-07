package edu.calvin.mjd85.lab5;

/**
 * Created by Mark Davis on 10/7/2016.
 * Settings Fragment class to show content on all screen sizes
 * Lab05, CS 262, Calvin College
 */
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Load the preferences from an SML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
