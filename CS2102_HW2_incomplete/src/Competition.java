import java.util.LinkedList;

public class Competition 
{
	int numberOfShootings ;
	LinkedList<Athlete> listOfAthletes;
	
	public Competition(int shoot,LinkedList<Athlete> athletes )
	{
		this.numberOfShootings = shoot;
		this.listOfAthletes = athletes;
	}
	
	
	/**
	 * Produces a list of names of athletes who do not complete as many shootingRounds as the competition's # of shooting
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * 
	 * @return names The list of names of athletes
	 */
	
	public LinkedList<String> shootingDNF()
	{
		LinkedList<String> names = new LinkedList<String>();
		for(int i=0; i<this.listOfAthletes.size(); i++)
		{
			if (this.listOfAthletes.get(i).result.shootScore.rounds.size() < this.numberOfShootings)
				names.add(this.listOfAthletes.get(i).name);
		}
		return names;
	}
	
	/**
	 * Returns the finalScore of the Athlete who's name is in this competition
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * 
	 * @param name The name of the athlete as a string
	 * @return The finalScore of the athlete
	 */
	public double finalScoreForAthlete(String name)
	{
		for(int i=0; i < this.listOfAthletes.size(); i++)
		{
			if (this.listOfAthletes.get(i).name.equals(name))
				return this.listOfAthletes.get(i).result.finalScore();
		}
		return 0.0;
	}
	
	/**
	 * Returns true iff an athlete in this competition has improved his score over the last competition
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param other The other competition with the same athletes
	 * @return Boolean true or false 
	 */
	public boolean anyImprovement(Competition other)
	{
		for (int i=0; i < this.listOfAthletes.size(); i++)
		{
			for (int j=0; j<other.listOfAthletes.size(); j++)
			{
				if (this.listOfAthletes.get(i).name.equals(other.listOfAthletes.get(j).name))
				{
					if(this.listOfAthletes.get(i).result.finalScore() > other.listOfAthletes.get(j).result.finalScore())
						return true;
				}
			}
		}
		return false;
	}
	
	/*
	 * In retrospect, I believe that the finalScoreForAthlete is implemented in an efficient way.
	 * However, I believe that the anyImprovement function could call to the finalScoreForAthlete function to
	 * find the athlete's scores in other competitions. That would be faster and would not require two for loops to run.
	 * 
	 * It would allow the first competition to file through the first list of athletes and then pass their names to the 
	 * finalScoreForAthlete function being called with the "other" competition to find their scores in that competition.
	 */

}