package com.thenolle.weather.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.thenolle.weather.R;
import com.thenolle.weather.databinding.ActivityFavoriteBinding;
import com.thenolle.weather.functions.Utils;
import com.thenolle.weather.models.City;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {
    private ActivityFavoriteBinding binding;
    private TextView messageTextView;

    private Intent intent = getIntent();
    private ArrayList<City> mCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        mCities = new ArrayList<>();

        City city1 = new City("Montréal", "Légères pluies", R.drawable.weather_rainy_grey, "22°C");
        City city2 = new City("New York", "Ensoleillé", R.drawable.weather_sunny_grey, "22°C");
        City city3 = new City("Paris", "Nuageux", R.drawable.weather_foggy_grey, "24°C");
        City city4 = new City("Toulouse", "Pluies modérées", R.drawable.weather_rainy_grey, "20°C");

        mCities.add(city1);
        mCities.add(city2);
        mCities.add(city3);
        mCities.add(city4);
    }
}
