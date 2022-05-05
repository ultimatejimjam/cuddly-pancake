import java.util.GregorianCalendar;
import java.util.LinkedList;

public class LL  implements IReport
{
	LinkedList<TodaysWeatherReport> reports;
	
	public LL(LinkedList<TodaysWeatherReport> reports)
	{
		this.reports = reports;
	}
	
	public LL()
	{
		this.reports = new LinkedList<TodaysWeatherReport>();
	}
	
	// add report function, can be different for different data structures (heaps, BSTs, etc)
	public void addReport(TodaysWeatherReport today)
	{
		this.reports.add(today);
	}
	
	/**
	 * avgMonthTemp here is the LinkedList version of the averageMonthTemp fcn. in WeatherStation.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest passed by the WeatherStation
	 * @param year The year of interest passed by the WeatherStation
	 * @return The average temperature found by all readings in that month.
	 */
	public double avgMonthTemp(int month, int year)
	{
		double totalTemp = 0.0;
		int countReadings = 0;
		for (TodaysWeatherReport today : this.reports){
			GregorianCalendar today_cal = today.time();
			if(today_cal.get(GregorianCalendar.MONTH) == month && today_cal.get(GregorianCalendar.YEAR)== year){	
						countReadings++;
						totalTemp += today.ave_temp();
			}
		}
		if (countReadings == 0) return -459.67;
		return totalTemp / countReadings;
	}
	
	/**
	 * totalRain is the LinkedList version for the IReport data type of the totalMonthRainfall in the weatherStation.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param month The month of interest.
	 * @param year The year of interest.
	 * @return The total rainfall over the month.
	 */
	public double totalRain(int month, int year)
	{
		double totalRainfall = 0.0;
		for(TodaysWeatherReport today : this.reports){
			GregorianCalendar today_cal = today.time();
			if(today_cal.get(GregorianCalendar.MONTH) == month && today_cal.get(GregorianCalendar.YEAR)== year){
				totalRainfall += today.tot_rain();
			}
		}
		return totalRainfall;
	}
}