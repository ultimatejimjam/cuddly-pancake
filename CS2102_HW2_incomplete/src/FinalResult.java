

public class FinalResult {
	ShootingResult shootScore;
	SkiingResult skiScore;
	
	public FinalResult(ShootingResult shootScore, SkiingResult skiScore)
	{
		this.shootScore = shootScore;
		this.skiScore = skiScore;
	}
	
	public double finalScore()
	{
		double totalScore = this.skiScore.pointsEarned() + this.skiScore.getPenalties() + this.shootScore.getPenalties();
		int finalPosition = this.skiScore.position;
		
		if (finalPosition> 4)
		{
		
			return totalScore;
		}
		else
		{
			if(finalPosition == 1)
				return totalScore - 10;
			else if (finalPosition == 2)
			{
				return totalScore - 7;
			}
			else if  (finalPosition == 3)
			{
				return totalScore-3;
			}
			else
				return totalScore-1;
		}
	}
}
