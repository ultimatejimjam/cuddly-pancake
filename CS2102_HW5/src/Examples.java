import static org.junit.Assert.*;

import org.junit.Test;
import java.util.LinkedList;
import java.util.GregorianCalendar;

public class Examples 
{
	WeatherStation station = new WeatherStation(new LL());
	GregorianCalendar day1 = new GregorianCalendar(2022, 3, 1);
	GregorianCalendar day2 = new GregorianCalendar(2022, 3, 3);
	GregorianCalendar day3 = new GregorianCalendar(2022, 3, 5);
	GregorianCalendar day4 = new GregorianCalendar(2022, 3, 7);
	GregorianCalendar day5 = new GregorianCalendar(2022, 4, 1);
	GregorianCalendar day6 = new GregorianCalendar(2022, 7, 1);
	
	Time time1 = new Time(0,6);
	Time time2 = new Time(0,9);
	Time time3 = new Time(0,12);
	Time time4 = new Time(0,15);
	Time time5 = new Time(0,18);
	Time time6 = new Time(0,21);
	
	Reading reading1 = new Reading(time1, 40, 1.0);
	Reading reading2 = new Reading(time2, 50, 2.0);
	Reading reading3 = new Reading(time3, 60, 3.0);
	Reading reading4 = new Reading(time4, 60, 4.0);
	Reading reading5 = new Reading(time5, 50, 5.0);
	Reading reading6 = new Reading(time6, 40, 6.0);
	
	LinkedList<Reading> readings1 = new LinkedList<Reading>();
	
	
	
	public Examples()
	{
		readings1.add(reading1);
		readings1.add(reading2);
		readings1.add(reading3);
		readings1.add(reading4);
		readings1.add(reading5);
		readings1.add(reading6);
		
		station.addTodaysReport(day1, readings1);
		station.addTodaysReport(day2, readings1);
		station.addTodaysReport(day3, readings1);
		station.addTodaysReport(day4, readings1);
		station.addTodaysReport(day5, readings1);
		station.addTodaysReport(day6, readings1);
	}
	@Test
	public void testFunctionality()
	{
		// tests basic functionality of the code, essentially a compile check for examples class above
		assertFalse(station.averageMonthTemp(3, 1) == station.totalMonthRainfall(4, 1));
	}
	
	@Test
	public void test_addReport()
	{
		// tests basic functionality of add report
		WeatherStation station2 = new WeatherStation(new LL());
		WeatherStation station3 = new WeatherStation(new LL());
		station2.addTodaysReport(day1, readings1);
		assertFalse(station2.equals(station3));
	}
	
	
	@Test
	public void test_AvgTemp_baseCase()
	{
		// basic test of average temperature function found in LL
		assertEquals(station.averageMonthTemp(3, 2022),50,0.1);
	}
	
	@Test
	public void test_AvgTemp_noAvg()
	{
		// test to see behavior when there is no data, returns absolute zero as this wasn't specified.
		assertEquals(station.averageMonthTemp(4, 1999),-459.67,0.1);
	}
	
	@Test
	public void testTotalRainfall()
	{
		// basic case of total monthly rainfall
		assertEquals(station.totalMonthRainfall(3,2022),84, 0.1);
	}
	
	@Test
	public void testTotalRainfall_2() {
		//  test a different basic case of total monthly rainfall
		assertEquals(station.totalMonthRainfall(4,2022),21, 0.1);
	}

}