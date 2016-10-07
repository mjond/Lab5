package edu.calvin.mjd85.lab5;

/**
 * Created by mjd85 on 9/30/2016.
 * CS 262, lab04
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//class for the About Page
public class AboutActivity extends AppCompatActivity {
    //basic activity build.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //changes the title on the about page to lab04-about. was defualt lab04
        setTitle("About");
    }
}