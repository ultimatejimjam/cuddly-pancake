import java.util.LinkedList;

class ShowSummary {
	
	LinkedList<Show> daytime;
	LinkedList<Show> primetime;
	LinkedList<Show> latenight;
	
	ShowSummary() 
	{
		this.daytime = new LinkedList<Show>();
		this.primetime = new LinkedList<Show>();
		this.latenight = new LinkedList<Show>();
	}
	
	ShowSummary(LinkedList<Show> daytime, LinkedList<Show> primetime, LinkedList<Show> latenight)
	{
		this.daytime = daytime;
		this.primetime = primetime;
		this.latenight = latenight;
	}
	
	
	
	// Equals override method that returns equals when another ShowSummary:
	// - has lists of equal length
	// - the shows in the lists are the in same order
	// - shows must have the same name and broadcast time
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ShowSummary)) {
			return false;
		}
		ShowSummary other_item = (ShowSummary) other;
        if ((this.daytime.size() == other_item.daytime.size()) & (this.primetime.size() == other_item.primetime.size()) & (this.latenight.size() == other_item.latenight.size()) ) { // And gates ensure each list is the same length
        	for(int i = 0; i < this.daytime.size(); i++) { // checks each member of the list against the same member of the other
        		Show day1 = this.daytime.get(i); 
        		Show day2 = other_item.daytime.get(i);
        		if(day1.equals(day2) == false) return false; // set an over-ride of the equals method within "show" to return equal if both shows have the sime title and start time
        	}
        	for(int j = 0; j < this.primetime.size(); j++) {
        		Show prime1 = this.primetime.get(j);
        		Show prime2= other_item.primetime.get(j);
        		if(prime1.equals(prime2) == false) return false;
        	}
        	for(int k = 0; k < this.latenight.size(); k++) {
        		Show late1 = this.latenight.get(k);
        		Show late2= other_item.latenight.get(k);
        		if(late1.equals(late2) == false) return false;
        	}
        	return true;
        	}
        else {
        	return false;
        }
	}


}