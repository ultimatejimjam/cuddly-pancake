//import java.util.LinkedList;
public interface IReport 
{
	public void addReport(TodaysWeatherReport today);
	
	public double avgMonthTemp(int month, int year);
	
	public double totalRain(int month, int year);
	
	//public LinkedList<TodaysWeatherReport> getReports(int month, int year);
	
	//NOTES ON IMPLEMENTATIONS:
	/*
	 * a "getReports" function is not necessary!
	 * the WeatherStation can ask the functions for the data type to do the calculations for it, and pass back the result
	 * I can ask LL to do all the calculations and just call to the correct IReport type to pass back
	 * results for each of the reports
	 * 
	 * Prof. Cuneo said "which class already has access to the linked list so the WeatherStation doesn't need to use it?"
	 * 
	 * From weather station, must call to function to calculate the average temps and total rainfalls in the report class itself
	 * return their results from the weather station.
	 */
}