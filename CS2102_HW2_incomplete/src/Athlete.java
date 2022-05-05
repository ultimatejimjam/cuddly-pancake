public class Athlete {
	FinalResult result;
	String name;
	
	//Constructor
	public Athlete(FinalResult result,String name)
	{
		this.name = name;
		this.result = result;
	}
	
	public boolean betterSkiier(Athlete otherAthlete)
	{
		return this.result.skiScore.pointsEarned() < otherAthlete.result.skiScore.pointsEarned();
	}
	
	public boolean betterShooter(Athlete otherAthlete)
	{
		return this.result.shootScore.pointsEarned() > otherAthlete.result.shootScore.pointsEarned();
	}
	
	public boolean hasBeaten(Athlete otherAthlete)
	{
		if (this.betterSkiier(otherAthlete) || this.betterShooter(otherAthlete))
		{
			return true;
		}
		else 
			return false;
	}
}