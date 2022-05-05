import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TodaysWeatherReport 
{
	private GregorianCalendar date;
	private LinkedList<Double> temperatures;
	private LinkedList<Double> rainfalls;
	
	public TodaysWeatherReport(GregorianCalendar date, LinkedList<Double> temps, LinkedList<Double> rains)
	{
		this.date = date;
		this.temperatures = temps;
		this.rainfalls = rains;
	}
	
	public GregorianCalendar time(){
		return this.date;
	}
	
	public double ave_temp() {
		int divide = 0;
		double temps = 0;
		for(int i = 0; i < this.temperatures.size(); i++) {
			divide++;
			temps += temperatures.get(i);
		}
		if(divide == 0) return -459.67;
		return temps/divide;
	}
	
	public double tot_rain() {
		double total_rain = 0;
		for(int i = 0; i < this.rainfalls.size(); i++) {
			total_rain += this.rainfalls.get(i);
		}
		return total_rain;
	}
}