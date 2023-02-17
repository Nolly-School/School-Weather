package com.thenolle.weather;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.thenolle.weather.databinding.ActivityFavoriteBinding;
import com.thenolle.weather.functions.Utils;

public class FavoriteActivity extends AppCompatActivity {
    private ActivityFavoriteBinding binding;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        Intent intent = getIntent();
        String message = "Message: " + intent.getStringExtra(Utils.Keys.MESSAGE_KEY);

        messageTextView = findViewById(R.id.favorite_message);

        messageTextView.setText(message);
    }
}
