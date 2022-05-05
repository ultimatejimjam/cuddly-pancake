import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}
      
  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  
  /**
   * This method finds the daily maximum frequency for a given month in the data set.
   * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
   * @param data the list of data gathered.
   * @param month The month of interest.
   * @return monthReport The list of MaxHzReports for the month.
   */
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) 
  {
	LinkedList<MaxHzReport> monthReport = new LinkedList<MaxHzReport>();
    data = removeNegatives(data);
    data = removeWrongMonth(data, month);
    
    for(int i = 0; i < data.size(); i++)
    {
    	if (this.isDate(data.get(i)))
    	{
    		double maxHz = 0.0;
    		double today = data.get(i);
    		for (int j = i+1; j <= data.size(); j++) 
    		{
    			if(j == data.size())
    			{
    				MaxHzReport todaysReport = new MaxHzReport(today,maxHz);
    				monthReport.add(todaysReport);
    			}
    			else if (this.isDate(data.get(j)))
    			{
    				if (maxHz == 0.0) break;
    				MaxHzReport todaysReport = new MaxHzReport(today, maxHz);
    				monthReport.add(todaysReport);
    				break;
    			}
    			else if (data.get(j)>maxHz)
    				maxHz = data.get(j);
    		}
    	}
    }
    return monthReport;
  }
  
  /**
   * This method removes all negative numbers from the data
   * @param data List of doubles with potentially faulty data.
   * @return data The same list of doubles without the negative values
   */
  public LinkedList<Double> removeNegatives(LinkedList<Double> data)
  {
	  LinkedList<Double> data2 = data;
	  for (int i = 0; i < data.size(); i++) 
	  {
		if (data.get(i)< 0.0)
			data2.remove(i);
	  }
	  return data2;
  }
  
  /**
   * This method removes all data from the wrong month from the data set.
   * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
   * @param data The dataset given.
   * @param month The month the user is interested in.
   * @return data2 The data with only the correct month's info.
   */
  public LinkedList<Double> removeWrongMonth(LinkedList<Double> data, int month)
  {
	  LinkedList<Double> data2 = new LinkedList<Double>();
	  for (int i = 0; i<data.size(); i++) 
	  {
		  if(this.isDate(data.get(i)))
		  {
			  if(this.extractMonth(data.get(i)) == month)
			  {
				  data2.add(data.get(i));
				  for (int j = i+1; j<=data.size(); j++)
				  {
					  if(j==data.size())
						  break;
					  else if (this.isDate(data.get(j)))
						  break;
					  else
						  data2.add(data.get(j));
				  }
			  }
		  }
	  }
	  return data2;
  }
}