
import java.awt.Color;
import java.io.IOException;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.XChartSeriesColors;

public class SimpleXChart {
	
	/**
	 * A function
	 * @param x
	 * @return function evaluated at x
	 */
	public static double func(double x) {
		return 1.0/3.0 * Math.pow(x,3) - 16 * x;
	}
	
	/**
	 * Derivative of func()
	 * @param x
	 * @return derivative evaluated at x
	 */
	private static double func_prime(double x) {
		return Math.pow(x,2) - 16;
	}
	
	/**
	 * @param start value
	 * @param stop value
	 * @param number of values between start and end
	 * @return created a double array of length number
	 */
	public static double[] linspace(double start, double stop, int number) {
		double[] arr = new double[number];
		double step = (stop - start)/(number-1);
		double x = start;
		for(int i=0; i< arr.length; i++) {
			arr[i] = x;
			x += step;
		}
		
		return arr;
	}

	/**
	 * @param start value for gradient descent
	 * @param lr learning rate for gradient descent
	 * @param steps for gradient descent
	 * @return minimum
	 */
	public static double gradientDescent(double start, double lr, int steps) {
		
		double x = start;
		
		// gradient descent
		for(int i=0; i<steps; i++) {
			x = x - lr * func_prime(x);
//			System.out.println(i+": "+x);
		}
		
		return x;
		
		
	}
	


	/**
	 * 
	 * Testing XChart for plotting in Java.
	 * 
	 * Plotting the function func() (a 3rd degree polynomial)
	 * Find the minimum of func() using gradient descent
	 * Plot starting value of gradient descent search
	 * Plot minimum found by gradient descent
	 * 
	 * @param args
	 */
	public static void main(String[] args){

		
		double[] xData = linspace(-10.0, 10.0, 20);
		
//		System.out.println(xData[xData.length-1]);
		
		double[] yData = new double[xData.length];
		for(int i=0; i< yData.length; i++) {
			yData[i] = func(xData[i]);
		}

		// Create Chart
//		XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

		XYChart chart = new XYChartBuilder().width(600).height(500).theme(ChartTheme.Matlab).title("Polynomial").xAxisTitle("X").yAxisTitle("Y").build();

		chart.getStyler().setXAxisMin(-10.0);
		chart.getStyler().setXAxisMax(10.0);
		
		// Plot the polynomial
		XYSeries series = chart.addSeries("y(x)", xData, yData);
		series.setLineColor(XChartSeriesColors.ORANGE);
		series.setMarkerColor(XChartSeriesColors.ORANGE);
		
		// Find the minimum with gradient descent
		double x0 = 7.0;
		double minX = gradientDescent(x0, 0.1, 10);
		
		// Plot start value as a dot
		series = chart.addSeries("start: "+x0, new double[] {x0}, new double[] {func(x0)});
		series.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
		series.setMarkerColor(XChartSeriesColors.BLUE);
		
		// Plot the minimum as a dot
		series = chart.addSeries("min: "+(Math.round(minX*100.0)/100.0), new double[] {minX}, new double[] {func(minX)});
		series.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
		series.setMarkerColor(XChartSeriesColors.RED);
		
		// Show it
		new SwingWrapper(chart).displayChart();

		// Save it
//		BitmapEncoder.saveBitmap(chart, "./polynomial", BitmapFormat.PNG);
		

		// or save it in high-res
		//BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 300);


	}

}
