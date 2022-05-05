import java.util.LinkedList;

public class ShootingResult implements IEvent {
	LinkedList<ShootingRound> rounds = new LinkedList<ShootingRound>();
	
	//Constructor:
	public ShootingResult(LinkedList<ShootingRound> rounds)
	{
		this.rounds.addAll(rounds);
	}
	
	// Modified points earned function returns total points earned, works with linkedlist
	
	public double pointsEarned(){
		int points = 0;
		if (this.rounds.size() == 0)
			return points;
		for (int i=0; i<this.rounds.size(); i++) 
		{
			ShootingRound round = this.rounds.get(i);
			points = points + round.targetsHit;
		}
		return points;
	}
	
	
	public double getPenalties()
	{
		return 60 * (20-this.pointsEarned());
	}
	
	/**
	 * bestRoundByType returns the best round whether the athlete is standing or prone for the shoot
	 * 
	 * @param standing Boolean value if looking for the best standing or prone round
	 * @return best    Returns the best shooting round of the type specified, or null if empty
	 */
	
	public ShootingRound bestRoundByType(boolean standing) {
		ShootingRound best = new ShootingRound(0,standing);
		if (this.rounds.size() == 0)
			return null;
		for (int i=0; i<this.rounds.size(); i++) 
		{
			ShootingRound round = this.rounds.get(i);
			if(round.standing == standing) {
				if(round.targetsHit >= best.targetsHit) {
					best = round;
				}
			}
		}
		if(best.targetsHit >= 1) return best;
		else return null;
	}
}
