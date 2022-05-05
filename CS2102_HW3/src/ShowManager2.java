import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	public ShowSummary organizeShows(LinkedList<Show> shows) {
		ShowSummary output = new ShowSummary();
		for(int i = 0; i < shows.size(); i++) {
    		Show show = shows.get(i);
    		if((!show.isSpecial) & (show.broadcastTime < 1700.0) & (show.broadcastTime >= 600.0)) output.daytime.add(show);
    		else if((!show.isSpecial) & (show.broadcastTime >= 1700.0) & (show.broadcastTime < 2200.0)) output.primetime.add(show);
    		else if((!show.isSpecial) & ((show.broadcastTime < 100.0) || (show.broadcastTime > 2200.0))) output.latenight.add(show);
    		}
		return output;
	}
}