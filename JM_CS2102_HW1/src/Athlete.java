
public class Athlete {
	// holds a final result object
	FinalResult Performance;
	
	Athlete (FinalResult Performance){
		this.Performance = Performance;
	}
	
	public boolean betterSkiier(Athlete Athlete2) {
		return this.Performance.Skiing.pointsEarned() < Athlete2.Performance.Skiing.pointsEarned();
	}
	
	public boolean betterShooter(Athlete Athlete2) {
		return this.Performance.Shooting.pointsEarned() > Athlete2.Performance.Shooting.pointsEarned();
	}
	
	public boolean hasBeaten(Athlete Athlete2) {
		return this.betterShooter(Athlete2) ^ this.betterSkiier(Athlete2);
	}
}
