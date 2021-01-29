/* ....Show License.... */
package charts;
 
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public Parent createContent() {
        String[] years = {"2015", "2016"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(years));
        yAxis = new NumberAxis("Food Expenditure (US$)", 0.0d, 70000.0d, 15000.0d);
        ObservableList<BarChart.Series> barChartData =
            FXCollections.observableArrayList(
                new BarChart.Series("Africa",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(years[0], 5935d),
                    new BarChart.Data(years[1], 5610d))),
                new BarChart.Series("South America",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(years[0], 9435d),
                    new BarChart.Data(years[1], 9744d))),
                new BarChart.Series("Oceania",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(years[0], 6103d),
                    new BarChart.Data(years[1], 6076d))),
                new BarChart.Series("North America",
                                    FXCollections.observableArrayList(  
                    new BarChart.Data(years[0], 10028d),
                    new BarChart.Data(years[1], 10844d))),
                new BarChart.Series("Asia",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(years[0], 37940d),
                    new BarChart.Data(years[1], 33990d))),
                new BarChart.Series("Europe",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(years[0], 65294d),
                    new BarChart.Data(years[1], 69419d)))
            );
        chart = new BarChart(xAxis, yAxis, barChartData, 25.0d);
        return chart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setTitle("Food Expenditure in Continents by Year");
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}