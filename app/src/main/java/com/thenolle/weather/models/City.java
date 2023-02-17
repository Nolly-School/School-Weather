package com.thenolle.weather.models;

public class City {
    public String mName;
    public String mDescription;
    public Integer mWeatherIcon;
    public String mTemperature;

    public City(String name, String description, Integer weatherIcon, String temperature) {
        mName = name;
        mDescription = description;
        mWeatherIcon = weatherIcon;
        mTemperature = temperature;
    }
}
