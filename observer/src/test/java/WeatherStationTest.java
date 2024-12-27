import com.zlatenov.Display;
import com.zlatenov.PhoneDisplay;
import com.zlatenov.Station;
import com.zlatenov.WeatherData;
import com.zlatenov.WindowDisplay;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Angel Zlatenov
 */

public class WeatherStationTest {
    private Station weatherStation;
    private Display phoneDisplay;
    private Display windowDisplay;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        weatherStation = new WeatherData();
        phoneDisplay = new PhoneDisplay("Phone");
        windowDisplay = new WindowDisplay("Window");
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    @DisplayName("Should notify all observers when temperature changes")
    void shouldNotifyAllObservers() {
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);
        weatherStation.setTemperature(25.0f);

        String output = outputStream.toString();
        assertTrue(output.contains("Phone display: Temperature is 25.0°C"));
        assertTrue(output.contains("Window display: Temperature is 25.0°C"));
    }

    @Test
    @DisplayName("Should not notify removed observers")
    void shouldNotNotifyRemovedObservers() {
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);
        weatherStation.removeObserver(windowDisplay);

        outputStream.reset();
        weatherStation.setTemperature(30.0f);

        String output = outputStream.toString();
        assertTrue(output.contains("Phone display: Temperature is 30.0°C"));
        assertFalse(output.contains("Window display: Temperature is 30.0°C"));
    }

    @Test
    @DisplayName("Should handle multiple temperature updates")
    void shouldHandleMultipleUpdates() {
        weatherStation.addObserver(phoneDisplay);
        weatherStation.setTemperature(25.0f);
        outputStream.reset();

        weatherStation.setTemperature(30.0f);
        String output = outputStream.toString();
        assertTrue(output.contains("Temperature is 30.0°C"));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}