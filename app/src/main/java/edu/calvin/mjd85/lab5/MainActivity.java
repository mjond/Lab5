package edu.calvin.mjd85.lab5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/*
Main Activity shows the main page
Lab05, CS262
 */

public class MainActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private boolean preference = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        showPreferences();
    }

    private void showPreferences() {
        TextView preferenceTextView = (TextView) findViewById(R.id.preferenceTextView);
        preferenceTextView.setText("Preference: " + prefs.getBoolean("preference", false));
    }

    @Override
    public void onPause() {
        //instance variable saved
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("preference", preference);
        editor.commit();
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        preference = prefs.getBoolean("Preference", false);
        showPreferences();
    }

    //creates the menu.
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    //links the drop down menu options to start about activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_about:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                return true;
            case R.id.menu_settings:
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
