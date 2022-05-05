import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();

	Show startrek = new Show("Star Trek", 1800, 45.0, false);
	Show futurama = new Show("Futurama", 1900, 23.0, false);
	Show animaniacs = new Show("Animaniacs", 1630, 7.0, false);
	Show sesamestreet = new Show("Sesame Street", 900, 60.0, false);
	Show theDailyShow = new Show("The Daily Show", 2200, 23.0, false);
	Show SNL = new Show("Saturday Night Live", 2300, 90, false);


	public ShowExamples()
	{
		shows.add(startrek);
		report1.primetime.add(startrek);

		shows.add(futurama);
		report1.primetime.add(futurama);

		shows.add(animaniacs);
		report1.daytime.add(animaniacs);

		shows.add(sesamestreet);
		report1.daytime.add(sesamestreet);
	}
	
	@Test
	public void instructorTestShowSummary_EmptyReport() {
		ShowSummary report2 = new ShowSummary();
		assertFalse(report1.equals(report2));
	}

    @Test
	public void testShowSummary_equalsBothEmptyTrue()
	{
		ShowSummary report3 = new ShowSummary();
		ShowSummary report4 = new ShowSummary();
		assertTrue(report4.equals(report3));
	}

	@Test
	public void instructorTestShowSummary_WrongOrder() {
		ShowSummary report2 = new ShowSummary();

		report2.primetime.add(futurama);
		report2.primetime.add(startrek);
		report2.daytime.add(animaniacs);
		report2.daytime.add(sesamestreet);

		assertFalse(report1.equals(report2));
	}

	@Test
	public void instructorTestShowSummary_DifferentInstances() {
		ShowSummary report2 = new ShowSummary();

		Show startrek2 = new Show("Star Trek", 1800, 60.0, true);
		Show futurama2 = new Show("Futurama", 1900, 20.0, false);
		Show animaniacs2 = new Show("Animaniacs", 1630, 9.0, true);
		Show sesamestreet2 = new Show("Sesame Street", 900, 55.0, false);

		report2.primetime.add(startrek2);
		report2.primetime.add(futurama2);
		report2.daytime.add(animaniacs2);
		report2.daytime.add(sesamestreet2);

		assertTrue(report1.equals(report2));
	}

	@Test
	public void TestShowEquals_Basic() { // made to test equals method within shows
		Show animaniacs2 = animaniacs;
		assertTrue(animaniacs.equals(animaniacs2));
	}
	
	@Test
	public void TestShowEquals_False() {
		assertFalse(animaniacs.equals(futurama));
	}
	
	@Test
	public void TestShowEquals_True_Diff_length() { // make sure that shows are still equal with different broadcast lengths
		Show startrek2 = new Show("Star Trek", 1800, 60.1, true);
		assertTrue(startrek.equals(startrek2));
	
	}
	
	@Test
	public void testShowSummary_testLateNightShows_WrongOrder()
	{
		ShowSummary report2 = new ShowSummary();
		report2.daytime = report1.daytime;
		report2.primetime = report1.primetime;
		
		report1.latenight.add(theDailyShow);
		report1.latenight.add(SNL);
		
		report2.latenight.add(SNL);
		report2.latenight.add(theDailyShow);
		
		assertFalse(report1.equals(report2));
	}
	
	@Test
	public void testShowSummary_testLateNightShows_CorrectOrder()
	{
		ShowSummary report2 = new ShowSummary();
		report2.daytime = report1.daytime;
		report2.primetime = report1.primetime;
		
		report1.latenight.add(theDailyShow);
		report1.latenight.add(SNL);
		
		report2.latenight.add(theDailyShow);
		report2.latenight.add(SNL);
		
		assertTrue(report1.equals(report2));
	}
	
	@Test
	public void instructorTestShowSummary_SameInstances() {
		ShowSummary report2 = report1;
		assertTrue(report1.equals(report2));
	}
	
	@Test
	public void TestShowSummary_MismatchLateNight() {
		ShowSummary report2 = new ShowSummary();

		Show startrek2 = new Show("Star Trek", 1800, 60.0, true);
		Show futurama2 = new Show("Futurama", 1900, 20.0, false);
		Show animaniacs2 = new Show("Animaniacs", 1630, 9.0, true);
		Show sesamestreet2 = new Show("Sesame Street", 900, 55.0, false);

		report2.primetime.add(startrek2);
		report2.primetime.add(futurama2);
		report2.latenight.add(animaniacs2);
		report2.latenight.add(sesamestreet2);

		assertFalse(report1.equals(report2));
	}
	
	@Test
	public void TestShowSummary_MismatchStartTime() {
		ShowSummary report2 = new ShowSummary();

		Show startrek2 = new Show("Star Trek", 1800, 60.0, true);
		Show futurama2 = new Show("Futurama", 1900, 20.0, false);
		Show animaniacs2 = new Show("Animaniacs", 1630, 9.0, true);
		Show sesamestreet2 = new Show("Sesame Street", 901, 55.0, false);

		report2.primetime.add(startrek2);
		report2.primetime.add(futurama2);
		report2.latenight.add(animaniacs2);
		report2.latenight.add(sesamestreet2);

		assertFalse(report1.equals(report2));
	}

	@Test
		public void instructorTestOrganizeShows() 
		{
			ShowSummary report2 = sm2.organizeShows(shows);
			assertEquals(report1, report2);
		}
	
	@Test
	public void TestOrganizeShowsVersion2() 
	{
		ShowSummary report2 = sm2.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
// PROBLEM 1 SUBTASKS (ShowManager1)
	/*
	 * Initialize 3 lists to hold dayShows, primetime shows, and latenight shows
	 * Check to see if the show is a special
	 * Ignore special shows
	 * For each of the non-special shows, check to see when the broadcast time is and add to the appropriate list
	 * Set the ShowSummary daytime, primetime, and latenight fields to the lists of the shows collected
	 */

// PROBLEM 1 SUBTASKS (ShowManager2)
	/*
	 * Clean the list free of special shows and overnight shows using a helper function
	 * Iterate over the cleaned data in a for-loop
	 * Check to see when the show is broadcast and add the show to the appropriate ShowSummary field
	 */
}