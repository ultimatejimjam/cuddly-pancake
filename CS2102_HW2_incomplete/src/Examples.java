import java.util.LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;


public class Examples {
	
	public Examples () {}
	
	SkiingResult firstSki = new SkiingResult (1,30, 30, 30, 30,2);
	ShootingResult firstShoot = new ShootingResult (example1());
	FinalResult firstResult = new FinalResult(firstShoot, firstSki);
	Athlete firstPlace = new Athlete(firstResult, "Corn");
	
	public LinkedList<ShootingRound> example1(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(4, true);
		ShootingRound first2 = new ShootingRound(4, true);
		ShootingRound first3 = new ShootingRound(5, false);
		ShootingRound first4 = new ShootingRound(5, true);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	
	SkiingResult secondSki = new SkiingResult (2,40, 40, 45, 37,0);
	ShootingResult secondShoot = new ShootingResult (example2());
	FinalResult secondResult = new FinalResult(secondShoot, secondSki);
	Athlete secondPlace = new Athlete(secondResult, "Cobb");
	
	public LinkedList<ShootingRound> example2(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(3, true);
		ShootingRound first2 = new ShootingRound(4, false);
		ShootingRound first3 = new ShootingRound(5, true);
		ShootingRound first4 = new ShootingRound(5, false);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	SkiingResult thirdSki = new SkiingResult (3,38, 42, 46, 37,2);
	ShootingResult thirdShoot = new ShootingResult (example3());
	FinalResult thirdResult = new FinalResult(thirdShoot, thirdSki);
	Athlete thirdPlace = new Athlete(thirdResult, "Bean");
	
	public LinkedList<ShootingRound> example3(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(3, true);
		ShootingRound first2 = new ShootingRound(4, false);
		ShootingRound first3 = new ShootingRound(5, true);
		ShootingRound first4 = new ShootingRound(5, false);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	SkiingResult fourthSki = new SkiingResult (4,50, 50, 50, 50,0);
	ShootingResult fourthShoot = new ShootingResult (example4());
	FinalResult fourthResult = new FinalResult(fourthShoot, fourthSki);
	Athlete fourthPlace = new Athlete(fourthResult, "Can");
	
	public LinkedList<ShootingRound> example4(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(4, true);
		ShootingRound first2 = new ShootingRound(4, true);
		ShootingRound first3 = new ShootingRound(4, true);
		ShootingRound first4 = new ShootingRound(4, true);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	SkiingResult fifthSki = new SkiingResult (5,60, 60, 60, 60,2);
	ShootingResult fifthShoot = new ShootingResult (example5());
	FinalResult fifthResult = new FinalResult(fifthShoot, fifthSki);
	Athlete fifthPlace = new Athlete(fifthResult, "Lemon");
	
	public LinkedList<ShootingRound> example5(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(5, true);
		ShootingRound first2 = new ShootingRound(5, true);
		ShootingRound first3 = new ShootingRound(5, false);
		ShootingRound first4 = new ShootingRound(0, true);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	SkiingResult hasBeatenTest1 = new SkiingResult(5,60,60,60,60,2);
	ShootingResult hasBeatenShoot = new ShootingResult (example6());
	FinalResult hasBeatenResult = new FinalResult(fifthShoot, fifthSki);
	Athlete hasBeatenShootingTest = new Athlete(hasBeatenResult, "Battery");
	
	public LinkedList<ShootingRound> example6(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(5,true);
		ShootingRound first2 = new ShootingRound(5,true);
		ShootingRound first3 = new ShootingRound(5,true);
		ShootingRound first4 = new ShootingRound(5,false);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	SkiingResult hasBeatenTest2 = new SkiingResult(5,60,60,60,60,2);
	ShootingResult hasBeatenShoot2 = new ShootingResult (example8());
	FinalResult hasBeatenResult2 = new FinalResult(fifthShoot, fifthSki);
	Athlete hasBeatenShootingTest2 = new Athlete(hasBeatenResult, "Battery");
	
	public LinkedList<ShootingRound> example8(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(5,true);
		ShootingRound first2 = new ShootingRound(5,true);
		ShootingRound first3 = new ShootingRound(5,true);
		ShootingRound first4 = new ShootingRound(3,false);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}
	
	ShootingResult empty = new ShootingResult (example7());
	
	public LinkedList<ShootingRound> example7(){
		// Template List Creation Function aptly titled example 1
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		return example;
	}
	
	public LinkedList<ShootingRound> example9() {
	LinkedList<ShootingRound> rounds = new LinkedList<>();
	ShootingRound b1 = new ShootingRound(0, true);
	ShootingRound b2 = new ShootingRound(4, false);
	ShootingRound b3 = new ShootingRound(5, true);
	ShootingRound b4 = new ShootingRound(2, true);
	
	rounds.add(b1);
	rounds.add(b2);
	rounds.add(b3);
	rounds.add(b4);
	
	return rounds;
	}
	
	public LinkedList<ShootingRound> example10() {
	LinkedList<ShootingRound> rounds2 = new LinkedList<>();
	ShootingRound b6 = new ShootingRound(0, true);
	ShootingRound b7 = new ShootingRound(4, false);
	ShootingRound b8 = new ShootingRound(5, false);
	ShootingRound b9 = new ShootingRound(4, true);
	
	rounds2.add(b6);
	rounds2.add(b7);
	rounds2.add(b8);
	rounds2.add(b9);
	
	return rounds2;
	}
		
	ShootingResult result1 = new ShootingResult(example9());
	ShootingResult result2 = new ShootingResult(example10());
	
	ShootingRound sh1 = result1.bestRoundByType(true);

	SkiingResult dummySkiResult = new SkiingResult(2, 1.0, 2.0, 3.0, 4.0, 3);
	double skiSum = dummySkiResult.pointsEarned();
	
	FinalResult finalResult = new FinalResult(result1, dummySkiResult);
	double x = finalResult.finalScore();
	
	Athlete a1 = new Athlete(finalResult, "Athlete1");
	Athlete a2 = new Athlete(finalResult, "Athlete2");

	public LinkedList<Athlete> example11(){
		LinkedList<Athlete> athletes = new LinkedList<>();
		athletes.add(a1);
		athletes.add(a2);
		return athletes;

	}
	
	public LinkedList<Athlete> example12(){
		SkiingResult dummySkiResult = new SkiingResult(1, 1.0, 2.0, 3.0, 3.0, 3);
		double skiSum = dummySkiResult.pointsEarned();
		
		FinalResult finalResult = new FinalResult(result1, dummySkiResult);
		double x = finalResult.finalScore();
		
		Athlete a1 = new Athlete(finalResult, "Athlete1");
		Athlete a2 = new Athlete(finalResult, "Athlete2");
		
		LinkedList<Athlete> ron = new LinkedList<Athlete>();
		ron.add(a1);
		ron.add(a2);
		return ron;
	}
	
	Competition comp = new Competition(5, example11());
	Competition comp2 = new Competition(5, example12());

	
	// Test cases for HW2:
	
	SkiingResult improvementSki = new SkiingResult(5,60,60,60,60,8);
	ShootingResult improvementShoot = new ShootingResult (example16());
	FinalResult improvementResult = new FinalResult(improvementShoot, fifthSki);
	Athlete improvementGuy = new Athlete(improvementResult, "Lemon");
	
	public LinkedList<ShootingRound> example16(){
		// Template List Creation Function aptly titled example 1
		ShootingRound first1 = new ShootingRound(2,true);
		ShootingRound first2 = new ShootingRound(5,true);
		ShootingRound first3 = new ShootingRound(4,true);
		ShootingRound first4 = new ShootingRound(5,false);
		LinkedList<ShootingRound> example = new LinkedList<ShootingRound>();
		example.add(first1);
		example.add(first2);
		example.add(first3);
		example.add(first4);
		return example;
	}

	Competition competition1 = new Competition(4,example18());
	Competition competition2 = new Competition(6, example28());

	public LinkedList<Athlete> example18()
	{
		LinkedList<Athlete> athlete = new LinkedList<Athlete>();
		athlete.add(fifthPlace);
		athlete.add(firstPlace);
		athlete.add(fourthPlace);
		athlete.add(secondPlace);
		athlete.add(thirdPlace);
		return athlete;
	}
	
	public LinkedList<Athlete> example28()
	{
		LinkedList<Athlete> athlete = new LinkedList<Athlete>();
		athlete.add(thirdPlace);
		athlete.add(firstPlace);
		athlete.add(fourthPlace);
		athlete.add(secondPlace);
		athlete.add(improvementGuy);
		return athlete;
	}

	@Test
	public void allAthletesDNF ()
	{
		LinkedList<String> names = new LinkedList<String>();
		names.add("Bean");
		names.add("Corn");
		names.add("Can");
		names.add("Cobb");
		names.add("Lemon");
		assertEquals(names,competition2.shootingDNF());
	}

	@Test
	public void noAthletesDNF()
	{
		assertTrue(competition1.shootingDNF().isEmpty());
	}
	
	@Test
	public void competetion_FinalScore() {
		// Returns an athletes final score
		assertEquals(558.0, comp.finalScoreForAthlete("Athlete1"),0.1);
	}
	
	@Test
	public void competetion_FinalScore2() {
		// Returns zero if it can't find the athlete
		assertEquals(0, comp.finalScoreForAthlete("Athlete3"),0.1);
	}
	
	@Test
	public void competetion_AnyImprovement() {
		// is there any improvement between the two comps?
		assertTrue(comp.anyImprovement(comp2));
	}
	
	@Test
	public void competetion_AnyImprovementNO() {
		// is there any improvement between the two comps? There shouldn't be
		assertFalse(comp2.anyImprovement(comp));
	}
	
	@Test
	public void nullOutputCheckOnEmpty() {
		// Empty case outputs null
		assertNull(empty.bestRoundByType(false));
	}
	
	public void nullOutputCheck() {
		// full case with no same type elements outputs null
		assertNull(fourthShoot.bestRoundByType(false));
	}
	
	@Test
	public void bestRoundByType_basic() {
		ShootingRound highTrue = new ShootingRound(5, true);
		ShootingRound test = hasBeatenShoot.bestRoundByType(true);
		assertEquals(highTrue.standing, test.standing);
		assertEquals(highTrue.targetsHit,test.targetsHit);
	}
	
	@Test
	public void bestRoundByType_moreDifficult() {
		ShootingRound highTrue = new ShootingRound(5, false);
		ShootingRound test = hasBeatenShoot.bestRoundByType(false);
		assertEquals(highTrue.standing, test.standing);
		assertEquals(highTrue.targetsHit,test.targetsHit);
	}
	
	@Test
	public void bestRoundByType_doesItWorkWhenNot() {
		ShootingRound highTrue = new ShootingRound(3, false);
		ShootingRound test = hasBeatenShoot2.bestRoundByType(false);
		assertEquals(highTrue.standing, test.standing);
		assertEquals(highTrue.targetsHit,test.targetsHit);
	}
	
	
	
	// Test cases for HW1:
	
	@Test
	public void correctSkiResult()
	{
		assertEquals(120, firstSki.pointsEarned(), 0.1);
	}
	
	@Test
	public void correctSkiPenalties()
	{
		assertEquals(10, firstSki.getPenalties(),0.1);
	}
	
	@Test
	public void correctShootResult()
	{
		assertEquals(18,firstShoot.pointsEarned(), 0.1);
	}
	
	@Test
	public void correctShootPenalties()
	{
		assertEquals(120, firstShoot.getPenalties(),0.1);
	}
	
	@Test
	public void correct1stPlaceFinalScore()
	{
		assertEquals(firstResult.finalScore(), 240, 0.1);
	}
	
	@Test
	public void correct2ndPlaceFinalScore()
	{
		assertEquals(secondResult.finalScore(), 335, 0.1);
	}
	
	@Test
	public void correct3rdPlaceFinalScore()
	{
		assertEquals(thirdResult.finalScore(), 350, 0.1);
	}
	
	@Test
	public void correct4thPlaceFinalScore()
	{
		assertEquals(fourthResult.finalScore(), 439, 0.1);
	}
	
	@Test
	public void correct5thPlaceFinalScore()
	{
		assertEquals(fifthResult.finalScore(), 550,0.1);
	}
	
	@Test
	public void firstPlaceBeatsSecondSkiing()
	{
		assertTrue(firstPlace.betterSkiier(secondPlace));
	}
	
	@Test
	public void secondPlaceDoesNotBeatFirstSkiing()
	{
		assertFalse(secondPlace.betterSkiier(firstPlace));
	}
	
	@Test
	public void firstPlaceHasBeatenSecond() //problem wording says tests whether first place had better skiing OR shooting, hence OR operator in method
	{
		assertTrue(firstPlace.hasBeaten(secondPlace));
	}
	
	@Test
	public void fasterSkierWorseShooter_HasBeatenTrue()
	{
		assertTrue(firstPlace.hasBeaten(hasBeatenShootingTest)); //has better skiing but worse shooting, still hasBeaten due to OR wording
	}
	
	@Test
	public void notBeaten()
	{
		assertFalse(secondPlace.hasBeaten(firstPlace)); //neither faster skiing nor better shooting
	}
	
	@Test
	public void firstPlaceBeatsSecondShooting()
	{
		assertTrue(firstPlace.betterShooter(secondPlace));
	}
	@Test
	public void secondPlaceDoesntBeatFirstShooting()
	{
		assertFalse(secondPlace.betterShooter(firstPlace));
	}
	
}