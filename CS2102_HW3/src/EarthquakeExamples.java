import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  Earthquake2 E2 = new Earthquake2();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();  
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> AprilReports = new LinkedList<MaxHzReport>();
  LinkedList<Double> myDates = new LinkedList<Double>();
  LinkedList<MaxHzReport> emptyReport = new LinkedList<MaxHzReport>();
  
  public EarthquakeExamples() {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    NovReports.add(new MaxHzReport(20151101.0,6.0));
    
    myDates.add(20220405.0);
    myDates.add(-2.0);
    myDates.add(30.0);
    myDates.add(400.0);
    myDates.add(20220406.0);
    myDates.add(20220407.0);
    myDates.add(33.0);
    AprilReports.add(new MaxHzReport(20220405.0,400.0));
    AprilReports.add(new MaxHzReport(20220407.0, 33.0));
   
  }

  @Test
  public void instructorTestEQ() { 
    assertEquals(NovReports, 
                 E1.dailyMaxForMonth(threeDates, 11));
  }
  
  @Test
  public void TestEQ1()
  {
	  assertEquals(AprilReports,E1.dailyMaxForMonth(myDates,4));
  }
  
  @Test
  public void TestEQ1_Empty()
  {
	  assertEquals(emptyReport, E1.dailyMaxForMonth(noData, 5));
  }
  
  @Test
  public void TestEQVersion2() 
  { 
    assertEquals(NovReports, 
                 E2.dailyMaxForMonth(threeDates, 11));
  }
  
  @Test
  public void TestEQ2()
  {
	  assertEquals(AprilReports,E2.dailyMaxForMonth(myDates,4));
  }
  
  @Test
  public void TestEQ2_Empty()
  {
	  assertEquals(emptyReport, E2.dailyMaxForMonth(noData, 5));
  }
  
  @Test
  public void TestEQ2_WrongMonth()
  {
	  assertEquals(emptyReport, E2.dailyMaxForMonth(myDates, 11));
  }
  
  @Test
  public void TestEQ1_WrongMonth()
  {
	  assertEquals(emptyReport, E1.dailyMaxForMonth(myDates, 3));
  }

  
  // PROBLEM 2 SUBTASKS (Earthquake1)
  /*
   * Find each date in the list and match the date with the month
   * Find the data following the date 
   * Find the maximum frequency in the data following the date
   * Find the next date or the end of the data set following the first date found
   * add the date and the maximum frequency to the monthly report
   * Continue with the next set of data given the date
   */
  // PROBLEM 2 SUBTASKS (Earthquake2)
  /*
   * Clean the negatives from the list
   * find each date in the list and remove the data from the wrong month
   * find the maximum frequency in the data following each data
   * find the next date of the data set
   * repeat finding the max. frequency
   * add the date with its max frequency to the report
   * ignore dates with no data
   */
}