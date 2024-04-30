package com.kodilla.testing.weather.stub;

import java.util.Collections;
import java.util.List;
import com.kodilla.testing.weather.stub.Temperatures;
public class WeatherForecast {

    public TemperatureProvider temperatureProvider;

    public WeatherForecast(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public double calculateAverageTemperature() {
        List<Double> temperatures = temperatureProvider.getTemperatures();
        double sum = 0.0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperatures = temperatureProvider.getTemperatures();
        Collections.sort(temperatures);
        int size = temperatures.size();
        if (size % 2 == 0) {
            return (temperatures.get(size / 2) + temperatures.get(size / 2 - 1)) / 2;
        } else {
            return temperatures.get(size / 2);
        }
    }
}
