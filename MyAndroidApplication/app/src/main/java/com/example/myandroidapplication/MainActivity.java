package com.example.myandroidapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.example.myandroidapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText metersInput;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metersInput = findViewById(R.id.metersInput);
        resultText = findViewById(R.id.resultText);
    }

    public void convertMetersToMillimeters(View view) {
        try {
            double meters = Double.parseDouble(metersInput.getText().toString());
            double millimeters = meters * 1000;
            resultText.setText(String.format("%.2f meters is %.2f millimeters", meters, millimeters));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter a valid number in meters.");
        }
    }
}




