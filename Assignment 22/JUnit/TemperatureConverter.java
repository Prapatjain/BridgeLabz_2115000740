import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100));
    }
    
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212));
    }
}
