package com.thenolle.weather;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thenolle.weather.functions.Utils;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mWeatherLayout;
    private TextView mWeatherName;
    private TextView mWeatherDesc;
    private ImageView mWeatherIcon;
    private TextView mWeatherTemp;
    private Button mFavoriteButton;
    private EditText mSendMessage;
    private TextView mNoInternetConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeatherLayout = findViewById(R.id.weather_layout);
        mWeatherName = findViewById(R.id.weather_name);
        mWeatherDesc = findViewById(R.id.weather_description);
        mWeatherIcon = findViewById(R.id.weather_icon);
        mWeatherTemp = findViewById(R.id.weather_temperature);
        mFavoriteButton = findViewById(R.id.favorite_button);
        mSendMessage = findViewById(R.id.send_message);
        mNoInternetConnection = findViewById(R.id.no_internet_connection);

        Application application = getApplication();
        Boolean isNetworkAvailable = Utils.isNetworkAvailable(application);

        if (isNetworkAvailable) {
            mWeatherName.setText(R.string.weather_name);
            mWeatherDesc.setText(R.string.weather_desc);
            mWeatherIcon.setImageResource(R.drawable.weather_sunny_white);
            mWeatherTemp.setText(R.string.weather_temp);
            mFavoriteButton.setText(R.string.favorite_button);
            mSendMessage.setHint(R.string.placeholder);

            mFavoriteButton.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, FavoriteActivity.class);
                intent.putExtra(Utils.Keys.MESSAGE_KEY, mSendMessage.getText().toString());
                startActivity(intent);
            });

            mWeatherLayout.setVisibility(View.VISIBLE);
            mFavoriteButton.setVisibility(View.VISIBLE);
            mFavoriteButton.setVisibility(View.VISIBLE);
            mNoInternetConnection.setVisibility(View.GONE);
        } else {
            mNoInternetConnection.setText(R.string.no_internet_connection);

            mWeatherLayout.setVisibility(View.GONE);
            mFavoriteButton.setVisibility(View.GONE);
            mNoInternetConnection.setVisibility(View.VISIBLE);
        }
    }
}
