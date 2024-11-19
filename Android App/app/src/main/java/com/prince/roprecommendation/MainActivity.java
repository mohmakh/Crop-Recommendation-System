package com.prince.roprecommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


import java.util.HashMap;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    EditText Nitrogen, Phosphorus, Potassium, Temperature, Humidity, Ph, Rainfall;
    Button predict;
    TextView result;
    String url = "https://0ae9-14-139-162-2.ngrok-free.app";
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nitrogen = findViewById(R.id.Nitrogen);
        Phosphorus= findViewById(R.id.Phosphorus);
        Potassium = findViewById(R.id.Potassium);
        Temperature = findViewById(R.id.Temperature);
        Humidity= findViewById(R.id.Humidity);
        Ph= findViewById(R.id.Ph);
        Rainfall = findViewById(R.id.Rainfall);
        predict= findViewById(R.id.predict);
        result= findViewById(R.id.result);
        predict.setOnClickListener(view -> {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            StringRequest stringRequest = new StringRequest(Request.Method.POST, url,

                    response -> {
                        result.setVisibility(View.VISIBLE);
                        result.setText(getString(R.string.predicted_crop_message, response));
                    },
                    error -> {
                        result.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Please Fill all values correctly and check your internet connection.", Toast.LENGTH_SHORT).show();
                    })
            {
                @Override
                protected Map<String, String> getParams(){
                    Map<String, String> parms = new HashMap<>();
                    parms.put("Nitrogen", Nitrogen.getText().toString());
                    parms.put("Phosphorus", Phosphorus.getText().toString());
                    parms.put("Potassium", Potassium.getText().toString());
                    parms.put("Temperature", Temperature.getText().toString());
                    parms.put("Humidity", Humidity.getText().toString());
                    parms.put("Ph", Ph.getText().toString());
                    parms.put("Rainfall", Rainfall.getText().toString());
                    return parms;
                }
            };
            RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
            queue.add(stringRequest);
        });
    }
    @Override
    public void onBackPressed() {

        if (pressedTime + 1000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}