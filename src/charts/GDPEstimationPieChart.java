/* ....Show License.... */
package charts;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;

 
/**
 * A circular chart divided into segments. The value of each segment represents
 * a proportion of the total.
 */
public class GDPEstimationPieChart extends Application {
 
  private PieChart chart;

  public static ObservableList<PieChart.Data> generateData() {
      return FXCollections.observableArrayList(
              new PieChart.Data("Asia", 35),
              new PieChart.Data("Europe", 20),
              new PieChart.Data("North America", 20),
              new PieChart.Data("South America", 15),
              new PieChart.Data("Africa", 5),
              new PieChart.Data("Oceania", 5));
  }

  public Parent createContent() {
      chart = new PieChart(generateData());
      chart.setClockwise(false);
      return chart;
  }

  @Override public void start(Stage primaryStage) throws Exception {
      primaryStage.setScene(new Scene(createContent()));
      primaryStage.show();
  }

  /**
   * Java main for when running without JavaFX launcher
   */
  public static void main(String[] args) {
      launch(args);
  }
}