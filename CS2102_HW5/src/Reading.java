public class Reading
{
	private Time time;
	private double temperature;
	private double rainfall;
	
	public Reading(Time time, double temp, double rain)
	{
		this.time = time;
		this.temperature = temp;
		this.rainfall = rain;
	}
	
	public double getTemp()
	{
		return this.temperature;
	}
	
	public double getRain()
	{
		return this.rainfall;
	}
}