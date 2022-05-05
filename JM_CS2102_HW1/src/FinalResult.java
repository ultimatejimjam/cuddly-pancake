
public class FinalResult {
// holds a shooting result and a skiing result
	ShootingResult Shooting;
	SkiingResult Skiing;
	
	public FinalResult (ShootingResult Shooting, SkiingResult Skiing){
		this.Shooting = Shooting;
		this.Skiing = Skiing;
	}
	
	public double finalScore() {
		double pointsEarned = Skiing.pointsEarned() + Skiing.getPenalties() + Shooting.getPenalties();
		if (Skiing.FinishingOrder == 1) pointsEarned = pointsEarned - 10;
		if (Skiing.FinishingOrder == 2) pointsEarned = pointsEarned - 7;
		if (Skiing.FinishingOrder == 3) pointsEarned = pointsEarned - 3;
		if (Skiing.FinishingOrder == 4) pointsEarned = pointsEarned - 1;
		return pointsEarned;
	}
}
