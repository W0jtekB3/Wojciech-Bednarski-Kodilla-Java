import com.kodilla.testing.weather.stub.TemperatureProvider;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    public TemperatureProvider temperaturesMock;

    @Test
    void testCalculateAverageTemperature() {
        // Given
        when(temperaturesMock.getTemperatures()).thenReturn(List.of(20.0, 25.0, 30.0, 35.0));
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        // Then
        Assertions.assertEquals(27.5, averageTemperature);
    }

    @Test
    void testCalculateMedianTemperature() {
        // Given
        when(temperaturesMock.getTemperatures()).thenReturn(List.of(20.0, 25.0, 30.0, 35.0));
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        // Then
        Assertions.assertEquals(27.5, medianTemperature);
    }
}
