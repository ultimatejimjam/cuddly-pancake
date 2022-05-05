import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }
 
  
  /**
   * This method takes a list of doubles and returns the max frequency on each day of a given month
   * @param data The list of doubles which represent days and frequencies
   * @param month The month which the report is generated for
   * @return monthReport A list of MaxHzReports with the greatest frequency for each day in that month
   */
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) 
  {
	  LinkedList<MaxHzReport> monthReport = new LinkedList<MaxHzReport>();
	  
	  for(int i=0; i < data.size(); i ++) 
	  {
		  if(this.isDate(data.get(i)) && (this.extractMonth(data.get(i)) == month))
		  {
			  double today = data.get(i);
			  double maxReading = 0.0;
			  for (int j=i+1; j <= data.size(); j++)
			  {
				  if (j == data.size())
				  {
					  MaxHzReport todaysReport = new MaxHzReport(today, maxReading);
					  monthReport.add(todaysReport);
				  }
				  else if (this.isDate(data.get(j)))
				  {
					  if(maxReading==0.0)
						  break;
					  else
					  {
						  MaxHzReport todaysReport = new MaxHzReport(today, maxReading);
						  monthReport.add(todaysReport);
						  break;
					  }
				  }
				  
				  else if (data.get(j) > maxReading)
					  maxReading = data.get(j);
			  }
		  }
	  }
	  return monthReport;
  }
}  