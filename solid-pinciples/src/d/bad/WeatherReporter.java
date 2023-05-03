package d.bad;

public class WeatherReporter {
    private final WeatherSensor weatherSensor;
    private final WeatherStation weatherStation;
    private final WeatherAPI weatherAPI;

    public WeatherReporter() {
        weatherSensor = new WeatherSensor();
        weatherStation = new WeatherStation();
        weatherAPI = new WeatherAPI();
    }

    public String generateReport() {
        String sensorData = weatherSensor.readData();
        String stationData = weatherStation.readData();
        String apiData = weatherAPI.readData();
        // Process the data and generate the report
        return "Weather report generated";
    }
}
