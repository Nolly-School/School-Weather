package com.thenolle.weather.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thenolle.weather.R;
import com.thenolle.weather.models.City;

import java.util.ArrayList;
import java.util.List;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {
    private final LayoutInflater mInflater;
    private List<City> mCities;

    public FavoriteAdapter(Context context, List<City> cities) {
        this.mInflater = LayoutInflater.from(context);
        this.mCities = cities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_favorite_city, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        City city = mCities.get(position);
        holder.cityName.setText(city.mName);
        holder.cityDescription.setText(city.mDescription);
        holder.cityTemperature.setText(city.mTemperature);
        holder.cityIcon.setImageResource(city.mWeatherIcon);
    }

    @Override
    public int getItemCount() {
        return mCities.size();
    }

    public void submitList(ArrayList<City> cities) {
        mCities = cities;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityName;
        TextView cityDescription;
        TextView cityTemperature;
        ImageView cityIcon;

        ViewHolder(View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.item_weather_name);
            cityDescription = itemView.findViewById(R.id.item_weather_desc);
            cityTemperature = itemView.findViewById(R.id.item_weather_temperature);
            cityIcon = itemView.findViewById(R.id.item_weather_icon);
        }
    }
}
