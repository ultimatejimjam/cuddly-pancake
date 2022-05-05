import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {
	DataHeap checkHeap1 = new DataHeap(3);
	DataHeap checkHeap2 = new DataHeap(3);
	DataHeap checkHeap3 = new DataHeap(3);
	DataHeap checkHeap1Different = new DataHeap(3);
	DataHeap checkHeap1TooManyElts = new DataHeap(3);
	DataBT checkNotHeap = new DataBT(3);
	DataBT checkHeapBTStyle = new DataBT(3);
	DataBT checkTree = new DataBT(1);

	public Examples() {
		checkHeap1= (DataHeap) checkHeap1.addElt(10);
		checkHeap1= (DataHeap) checkHeap1.addElt(8);
		checkHeap1= (DataHeap) checkHeap1.addElt(9);
		checkHeap1= (DataHeap) checkHeap1.addElt(7);
		checkHeap1= (DataHeap) checkHeap1.addElt(4);
		checkHeap1= (DataHeap) checkHeap1.addElt(6);
		checkHeap1= (DataHeap) checkHeap1.addElt(2);
		checkHeap1= (DataHeap) checkHeap1.addElt(1);

		checkHeap2 = (DataHeap) checkHeap2.addElt(5);
		checkHeap2 = (DataHeap) checkHeap2.addElt(4);
		checkHeap2 = (DataHeap) checkHeap2.addElt(3);
		checkHeap2 = (DataHeap) checkHeap2.addElt(2);
		checkHeap2 = (DataHeap) checkHeap2.addElt(1);
		
		checkHeap3 = (DataHeap) checkHeap3.addElt(4);
		checkHeap3 = (DataHeap) checkHeap3.addElt(3);
		checkHeap3 = (DataHeap) checkHeap3.addElt(2);
		checkHeap3 = (DataHeap) checkHeap3.addElt(1);
		
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(10);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(8);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(9);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(7);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(4);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(6);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(2);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(1);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(1);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(1);
		checkHeap1TooManyElts = (DataHeap) checkHeap1TooManyElts.addElt(1);

		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(8);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(10);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(4);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(7);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(6);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(2);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(1);
		checkHeap1Different = (DataHeap) checkHeap1Different.addElt(9);

		checkNotHeap.left = new DataBT(2);
		checkNotHeap.right = new DataBT(1);

		checkHeapBTStyle.left = new DataBT(4);
		checkHeapBTStyle.right = new DataBT(5);

	}

	HeapChecker HT = new HeapChecker();

	@Test
	public void test_different_Length_Heaps() {
		assertFalse(HT.addEltTester(checkHeap1, 1, checkHeap2));
	}

	@Test
	public void basic_addElt_compare() {
		assertTrue(HT.addEltTester(checkHeap2, 4, checkHeap2.addElt(4)));
	}
	
	@Test
	public void basic_addElt_compare_duplicates() {
		assertTrue(HT.addEltTester(checkHeap2, 1, checkHeap2.addElt(1)));
	}
	
	@Test
	public void basic_addElt_compare_negatives() {
		assertTrue(HT.addEltTester(checkHeap2, -1, checkHeap2.addElt(-1)));
	}
	
	@Test
    public void basic_addElt_compare_same_heap_diff_memory() {
        System.out.println("checkHeap3 is " + checkHeap3.allHeapData());
        System.out.println("checkHeap2 is " + checkHeap2.allHeapData());
        assertTrue(HT.addEltTester(checkHeap3, 5, checkHeap2));
    }

	@Test
	public void check_isHeap() {
		// check if a normal heap is a heap
		assertTrue(HT.isHeap(checkHeap1));
	}

	@Test
	public void check_isHeap_BTStyle() {
		// check if a DataBT is a heap
		assertTrue(HT.isHeap(checkHeapBTStyle));
	}

	@Test
	public void check_isHeap_false() {
		// check if a binary tree is not a heap
		assertFalse(HT.isHeap(checkNotHeap));
	}

	@Test
	public void check_isHeap_empty() {
		// check if an empty heap is a heap
		assertTrue(HT.isHeap(new MtHeap()));
	}

	@Test
	public void check_isHeap_multSameElts() {
		// check if multiple equal elements added still meets heap requirement
		assertTrue(HT.isHeap(checkHeap1TooManyElts));
	}

	@Test
	public void check_hasAllElts_sameThing() {
		// checks to see if the same object in memory has all of its own elts
		assertTrue(HT.hasAllElts(checkHeap1, checkHeap1));
	}

	@Test
	public void check_hasAllElts_sameEltsDifferentHeap() {
		// checks to see if two heaps with the same elements added different order have
		// all elts
		assertTrue(HT.hasAllElts(checkHeap1, checkHeap1Different));
	}

	@Test
	public void check_hasAllElts_withMinEltRemoved() {
		// check to see if the remMinElt tester helper will return true given a heap and
		// its removed counterpart
		assertTrue(HT.hasAllElts(checkHeap1, checkHeap1.remMinElt()));
	}

	@Test
	public void check_hasAllElts_false() {
		// check to see if the helper function works with two heaps that are different
		assertFalse(HT.hasAllElts(checkNotHeap, checkHeap1));
	}

	@Test
	public void check_hasAllElts_empty() {
		// checks to see if empty heaps have all the same (empty) elements
		assertTrue(HT.hasAllElts(new MtHeap(), new MtHeap()));
	}

	@Test
	public void check_hasAllElts_multipleSameElts() {
		// checks to see if the same elts added many times still generates the same elts
		// in a heap
		assertTrue(HT.hasAllElts(checkHeap1, checkHeap1TooManyElts));
	}

	@Test
	public void check_remMinEltTest() {
		// checks to see if simple case of remMinEltTester functions
		assertTrue(HT.remMinEltTester(checkHeap1, checkHeap1.remMinElt()));
	}

	@Test
	public void check_remMinEltTest_false() {
		// checks case in which the hRemoved is given an invalid "heap"
		assertFalse(HT.remMinEltTester(checkHeap1, checkNotHeap));
	}

	@Test
	public void check_remMinEltTest_multipleRemoved() {
		// checks to see whether multiple removals will still work passed to the tester
		IHeap checkHeap2 = checkHeap1.remMinElt();
		assertTrue(HT.remMinEltTester(checkHeap1.remMinElt(), checkHeap2.remMinElt()));
	}

	@Test
	public void check_remMinEltTest_emptyHeaps() {
		// checks empty heaps
		MtHeap MT1 = new MtHeap();
		assertTrue(HT.remMinEltTester(MT1, MT1.remMinElt()));
	}

	@Test
	public void check_remMinEltTest_addElt() {
		// checks if a heap with an added element returns false
		assertFalse(HT.remMinEltTester(checkHeap1, checkHeap1.addElt(4)));
	}

	@Test
	public void check_remMinEltTest_wrongNumOfElts()
	{
		// checks to see if the wrong number of elts appear in the removed tree (too many 5s)
		DataHeap checkHeapSmall = new DataHeap(3);
		DataBT checkNotHeap2 = new DataBT(3);
		
		checkHeapSmall.addElt(4);
		checkHeapSmall.addElt(5);
		
		checkNotHeap2.left = new DataBT(4, new MtBT(), new MtBT());
		checkNotHeap2.right = new DataBT(5, new DataHeap(4), new MtBT());
		
		assertFalse(HT.remMinEltTester(checkHeapSmall, checkNotHeap2));
	}

	@Test
	public void check_remMinEltTest_sameHeapDifferentMemory() {
		// checks to see if the same heap, yet different memory, will return true
		IHeap checkHeap2 = checkHeap1.remMinElt();
		assertTrue(HT.remMinEltTester(checkHeap1, checkHeap2));
	}

	@Test
	public void check_remMinEltTest_sameHeapMultipleSameElts() {
		// checks to see if the same heap with multiple added same elements will still
		// work
		assertTrue(HT.remMinEltTester(checkHeap1, checkHeap1TooManyElts.remMinElt()));
	}
}