/* ....Show License.... */
package charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;

 
/**
 * A circular chart divided into segments. The value of each segment represents
 * a proportion of the total.
 */

public class GDPEstimationPieChart2015 extends Application {
 
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Estimated GDP of continents in 2015");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Asia", 27), // GDP in 2015: $455901.979 / $1681368.313 = 0.27
                new PieChart.Data("Europe", 54),// GDP in 2015: $900598.3382 / $1681368.313 = 0.54
                new PieChart.Data("North America", 8),// GDP in 2015: $131111.4539 / $1681368.313 = 0.08
                new PieChart.Data("South America", 4), // GDP in 2015: $73034.81472 / $1681368.313 = 0.04
                new PieChart.Data("Africa", 2), // GDP in 2015: $25510.93601 / $1681368.313 = 0.02
                new PieChart.Data("Oceania", 6));// GDP in 2015: $95210.79088 / $1681368.313 = 0.06
                                                // TOTAL GDP: $1681368.313
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Estimated GDP of continents in 2015");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}