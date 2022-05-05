import java.util.LinkedList;
import java.util.GregorianCalendar;

public class WeatherStation 
{
	private IReport reports;
	
	
	public WeatherStation(IReport reports)
	{
		this.reports = reports;
	}
	
	/**
	 * Adds a report for a given date to the station.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param date The date in GregorianCalendar class type.
	 * @param readings A list of readings to generate a list of temperatures and rainfalls for the date.
	 */
	public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings)
	{
		LinkedList<Double> temps = new LinkedList<Double>();
		LinkedList<Double> rains = new LinkedList<Double>();
		for (int i = 0; i < readings.size(); i++)
		{
			temps.add(readings.get(i).getTemp());
			rains.add(readings.get(i).getRain());
		}
		TodaysWeatherReport today = new TodaysWeatherReport(date, temps, rains);
		this.reports.addReport(today);
	}
	
	/**
	 * Calculates the average temperature of a given month and year at the WeatherStation
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest.
	 * @param year The year of interest.
	 * @return The average temperature of all readings in the month.
	 */
	public double averageMonthTemp(int month, int year)
	{
		return this.reports.avgMonthTemp(month, year);
	}
	
	/**
	 * Calculates the total rainfall over a given month and year at the WeatherStation
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest.
	 * @param year The year of interest.
	 * @return The total rainfall over that month.
	 */
	public double totalMonthRainfall(int month, int year)
	{
		return this.reports.totalRain(month, year);
	}
	
	/*
	/** THIS IS THE OLD IMPLEMENTATION FROM PART 1 ***
	 * Calculates the average temperature of a given month and year at the station.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest.
	 * @param year The year of interest.
	 * @return The average temperature of all the readings collected in that month.
	 */
	/*
	public double averageMonthTempOld(int month, int year)
	{
		double totalTemp = 0.0;
		int countReadings = 0;
		for (TodaysWeatherReport today : this.reports)
		{
			if(today.date.get(GregorianCalendar.MONTH) == month 
					&& today.date.get(GregorianCalendar.YEAR)== year)
			{
				
				for (int i = 0; i < today.temperatures.size(); i++)
				{
					countReadings ++;
					totalTemp += today.temperatures.get(i);
				}
			}
		}
		return totalTemp / countReadings;
	}
	*/
	
	
	
	/*/** THIS IS THE OLD IMPLEMENTATION FROM PART 1 *****
	 * Determines the total amount of rainfall in a given month and year.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest.
	 * @param year The year of interest.
	 * @return The total rainfall of all the readings collected in that month.
	 */
	/*
	public double totalMonthRainfall(int month, int year)
	{
		double totalRainfall = 0.0;
		for(TodaysWeatherReport today : this.reports)
		{
			if(today.date.get(GregorianCalendar.MONTH) == month 
					&& today.date.get(GregorianCalendar.YEAR)== year)
			{
				for (int i = 0; i < today.rainfalls.size(); i++)
				{
					totalRainfall += today.rainfalls.get(i);
				}
			}
		}
		return totalRainfall;
	}
	*/
	
	
}