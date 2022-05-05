import java.util.LinkedList;

class ShowManager1 {
	
	ShowManager1() {}

	/**
	 * This method organizes a list of shows into a ShowSummary without including specials or overnight shows.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param shows The list of Shows to organize
	 * @return organizedShows a ShowSummary of the shows with fields daytime, primetime, and latenight shows
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		ShowSummary organizedShows = new ShowSummary();
		shows = this.noSpecials(shows); //cleans the data
		LinkedList<Show> dayShows = new LinkedList<Show>();
		LinkedList<Show> primeShows = new LinkedList<Show>();
		LinkedList<Show> lateShows = new LinkedList<Show>();
		for (int i=0; i < shows.size(); i++) 
		{
			Show thisShow = shows.get(i);
			if (thisShow.broadcastTime < 1700 && thisShow.broadcastTime >= 600)
				dayShows.add(thisShow); 
			else if (thisShow.broadcastTime < 2200 && thisShow.broadcastTime >= 1700)
				primeShows.add(thisShow);
			else 
				lateShows.add(thisShow);
		}	
	
		organizedShows.daytime = dayShows;
		organizedShows.primetime = primeShows;
		organizedShows.latenight = lateShows;
		return organizedShows;
	}
	
	/**
	 * This method cleans the show data **specifically for organizeShows()** and gets rid of overnight and special shows
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param shows The list of Shows to clean
	 * @return shows The new list of Shows without overnight / specials
	 */
	public LinkedList<Show> noSpecials(LinkedList<Show> shows)
	{
		for (int i=0; i < shows.size(); i++) 
		{
			if (shows.get(i).isSpecial || (shows.get(i).broadcastTime > 100 && shows.get(i).broadcastTime < 600))
				shows.remove(i); //cleaning
		}
		return shows;
	}
}