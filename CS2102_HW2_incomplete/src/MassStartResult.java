import java.util.LinkedList;

public class MassStartResult implements IEvent {
	
	int polePosition;
	int finishingPosition;
	int penalties;
	LinkedList<Double> laps = new LinkedList<Double>();

	MassStartResult(int polePosition, int finishingPosition, double lap1, double lap2, double lap3, double lap4, int penalties){
		// has a finishing position, four laps, and the number of penalties like skiing result
		this.polePosition = polePosition;
		this.finishingPosition = finishingPosition;
		this.laps.add(lap1);
		this.laps.add(lap2);
		this.laps.add(lap3);
		this.laps.add(lap4);
		this.penalties = penalties;
	}
	
	public double pointsEarned() {
		double points = 0.0;
		if (this.laps.size() == 0)
			return points;
		for (int i=0; i<this.laps.size(); i++) 
		{
			points = points + this.laps.get(i);
		}
		return points;
	}
	
	public double getPenalties() {
		return this.penalties * 5.0;
	}
	
}
