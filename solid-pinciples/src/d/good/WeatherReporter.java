package d.good;

public class WeatherReporter {
    private final WeatherDataSource[] dataSources;

    public WeatherReporter(WeatherDataSource... dataSources) {
        this.dataSources = dataSources;
    }

    public String generateReport() {
        StringBuilder data = new StringBuilder();
        for (WeatherDataSource dataSource : dataSources) {
            data.append(dataSource.readData()).append(" ");
        }
        // Process the data and generate the report
        System.out.println(data);
        return "Weather report generated";
    }
}
