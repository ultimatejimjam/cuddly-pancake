
public class ShootingResult implements IEvent{
	
	ShootingRound shootingRound1;
	ShootingRound shootingRound2;
	ShootingRound shootingRound3;
	ShootingRound shootingRound4;

	public ShootingResult(ShootingRound shootingRound1, ShootingRound shootingRound2, ShootingRound shootingRound3,
			ShootingRound shootingRound4) {
		this.shootingRound1 = shootingRound1;
		this.shootingRound2 = shootingRound2;
		this.shootingRound3 = shootingRound3;
		this.shootingRound4 = shootingRound4;
	}
	
	public double pointsEarned(){
		// returns a double representing the number of hits in all rounds
		return shootingRound1.targetsHit + shootingRound2.targetsHit+ shootingRound3.targetsHit + shootingRound4.targetsHit;
	}
	public double getPenalties(){
		// subtracts from the highest possible score to determine the number of missed shots, multiplies those by sixty for penalty time
		double targetsMissed = 25 - pointsEarned();
		return targetsMissed * 60;
	}
}
