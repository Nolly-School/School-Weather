package com.thenolle.weather.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.thenolle.weather.R;
import com.thenolle.weather.adapters.FavoriteAdapter;
import com.thenolle.weather.databinding.ActivityFavoriteBinding;
import com.thenolle.weather.models.City;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {
    private ActivityFavoriteBinding binding;
    private Context mContext;
    private Intent intent;
    private ArrayList<City> mCities;
    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private FavoriteAdapter mAdapter;
    private FloatingActionButton mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        mContext = getApplicationContext();
        intent = getIntent();
        mCities = new ArrayList<>();
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new FavoriteAdapter(this, mCities);

        recyclerView = findViewById(R.id.favorite_recycle_view);
        mSearch = findViewById(R.id.favorite_search);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

        mSearch.setImageResource(R.drawable.ic_search);

        mSearch.setOnClickListener(v -> {
            final MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(mContext);
            builder.setTitle(R.string.popup_title);
            builder.setMessage(R.string.popup_message);

            View view = LayoutInflater.from(mContext).inflate(R.layout.dialog_add_favorite, null);
            final EditText input = view.findViewById(R.id.favorite_popup_city);
            builder.setView(view);

            builder.setPositiveButton(R.string.popup_button_add, (dialog, which) -> {
                String cityName = input.getText().toString();
                City city = new City(cityName, getResources().getString(R.string.popup_unknown), R.drawable.weather_unknown, "0°C");
                mCities.add(city);
                mAdapter.submitList(new ArrayList<>(mCities));
            });
            builder.setNegativeButton(R.string.popup_button_cancel, (dialog, which) -> dialog.cancel());
            builder.create().show();
        });

        City city1 = new City("Montréal", "Légères pluies", R.drawable.weather_rainy_grey, "22°C");
        City city2 = new City("New York", "Ensoleillé", R.drawable.weather_sunny_grey, "22°C");
        City city3 = new City("Paris", "Nuageux", R.drawable.weather_foggy_grey, "24°C");
        City city4 = new City("Toulouse", "Pluies modérées", R.drawable.weather_rainy_grey, "20°C");

        mCities.add(city1);
        mCities.add(city2);
        mCities.add(city3);
        mCities.add(city4);

        mAdapter.submitList(new ArrayList<>(mCities));
    }
}
