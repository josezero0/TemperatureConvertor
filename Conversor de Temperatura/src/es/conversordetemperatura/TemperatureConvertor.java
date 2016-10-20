package es.conversordetemperatura;

/**
 * Class to deal convertions between Celsius, Kelvin and Fahrenheit.
 *
 * @author Kami
 */
public final class TemperatureConvertor {

    /**
     * Can't instance it.
     */
    protected TemperatureConvertor() {

    }

    /**
     * Kelvin = Celsius + 273.15.
     *
     * @param temperature Celsius temperature.
     * @return Kelvin temperature.
     */
    public static final double fromCelsiusToKelvin(double temperature) {
        return temperature + 273.15;
    }

    /**
     * Fahrenheit = ((Celsius*9)/5) + 32.
     *
     * @param temperature Celsius temperature.
     * @return Fahrenheit temperature.
     */
    public static final double fromCelsiusToFahrenheit(double temperature) {
        return ((temperature * 9) / 5) + 32;
    }

    /**
     * Celsius = Kelvin - 273.15.
     *
     * @param temperature Kelvin temperature.
     * @return Celsius temperature.
     */
    public static final double fromKelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }

    /**
     * Fahrenheit = ((Kelvin*9)/5)-459.67.
     *
     * @param temperature Kelvin temperature.
     * @return Fahrenheit temperature.
     */
    public static final double fromKelvinToFahrenheit(double temperature) {
        return ((temperature * 9) / 5) - 459.67;
    }

    /**
     * Celsius = ((Fahrenheit-32)*5)/9.
     *
     * @param temperature Fahrenheit temperature.
     * @return Celsius temperature.
     */
    public static final double fromFahrenheitToCelsius(double temperature) {
        return ((temperature - 32) * 5) / 9;
    }

    /**
     * Kelvin = ((Fahrenheit+459.67)*5)/9.
     *
     * @param temperature Fahrenheit temperature.
     * @return Calsius temperature.
     */
    public static final double fromFahrenheitToKelvin(double temperature) {
        return ((temperature + 459.67) * 5) / 9;
    }

}
