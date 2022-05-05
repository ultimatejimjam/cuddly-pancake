import java.util.LinkedList;

public class SkiingResult extends SkiingEvent implements IEvent{
	int position;
	int penalties;
	LinkedList<Double> laps = new LinkedList<Double>();
	
	//Constructor
	public SkiingResult(int position, double lap1, double lap2, double lap3, double lap4, int penalties)
	{
		super(position, lap4, lap4, lap4, lap4, penalties);
		this.position = position;
		this.laps.add(lap1);
		this.laps.add(lap2);
		this.laps.add(lap3);
		this.laps.add(lap4);
		this.penalties = penalties;
	}
	
	/**
	 * Totals the lap times in seconds from the SkiingResult
	 * @author Andrew Peyton (abpeyton) , James Mitchell (jemitchell)
	 * 
	 * @return The total lap time as a double
	 */
	
	public double pointsEarned()
	{
		double points = 0.0;
		if (this.laps.size() == 0)
			return points;
		for (int i=0; i<this.laps.size(); i++) 
		{
			points = points + this.laps.get(i);
		}
		return points;
	}
	
	public double getPenalties()
	{
		return this.penalties * 5;
	}
}