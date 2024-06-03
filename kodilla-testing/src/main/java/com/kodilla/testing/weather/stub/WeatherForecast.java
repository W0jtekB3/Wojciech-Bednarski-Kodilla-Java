package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0.0;
        for (Double temperature : temperatures.getTemperatures().values()) {
            sum += temperature;
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperatureList);
        int size = temperatureList.size();
        if (size % 2 == 0) {
            return (temperatureList.get(size / 2 - 1) + temperatureList.get(size / 2)) / 2;
        } else {
            return temperatureList.get(size / 2);
        }
    }
}
