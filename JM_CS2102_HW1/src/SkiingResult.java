
public class SkiingResult implements IEvent{
	int FinishingOrder;
	double lap1;
	double lap2;
	double lap3;
	double lap4;
	int Penalties;
	
	public SkiingResult(int FinishingOrder, double lap1, double lap2, double lap3, double lap4, int Penalties){
		this.FinishingOrder = FinishingOrder;
		this.lap1 = lap1;
		this.lap2 = lap2;
		this.lap3 = lap3;
		this.lap4 = lap4;
		this.Penalties = Penalties;
	}
	
	public double pointsEarned(){
		// returns a double that is the sum of lap times
		return lap1 + lap2 + lap3 + lap4;
	}
	public double getPenalties(){
		// adds five seconds for each penalty
		return Penalties * 5;
	}
}
