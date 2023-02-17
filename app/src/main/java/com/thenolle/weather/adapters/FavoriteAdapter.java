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

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {
    private final Context mContext;
    private final ArrayList<City> mCities;

    public FavoriteAdapter(Context context, ArrayList<City> cities) {
        mContext = context;
        mCities = cities;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_favorite_city, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        City city = mCities.get(position);
        holder.mTextViewCityName.setText(city.mName);
        holder.mTextViewCityDesc.setText(city.mDescription);
        holder.mImageViewWeatherIcon.setImageResource(city.mWeatherIcon);
        holder.mTextViewTemperature.setText(String.valueOf(city.mTemperature));
    }

    @Override
    public int getItemCount() {
        return mCities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewCityName;
        public TextView mTextViewCityDesc;
        public ImageView mImageViewWeatherIcon;
        public TextView mTextViewTemperature;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewCityName = itemView.findViewById(R.id.item_weather_name);
            mTextViewCityDesc = itemView.findViewById(R.id.item_weather_desc);
            mImageViewWeatherIcon = itemView.findViewById(R.id.item_weather_icon);
            mTextViewTemperature = itemView.findViewById(R.id.item_weather_temperature);
        }
    }
}
