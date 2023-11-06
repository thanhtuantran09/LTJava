package controllers.chart;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.data.category.CategoryDataset;

public class ColumnChart {

    private static JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(null, "Ngày", "Thu nhập (100K)", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.addSubtitle((Title) new TextTitle("Thu nhập cửa hàng"));
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setRangePannable(true);
        plot.setRangeGridlinesVisible(false);
        plot.getDomainAxis().setCategoryLabelPositions(
                CategoryLabelPositions.UP_45);
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false); // Không vẽ đường viền cho các cột
        ChartUtils.applyCurrentTheme(chart);
        return chart;
    }

    public static JPanel createChartPanel(CategoryDataset dataset) {
        JFreeChart chart = createChart(dataset);
        chart.getPlot().setBackgroundPaint(new Color(242, 242, 242));
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        panel.setBackground(Color.WHITE);
        return (JPanel) panel;
    }
}
