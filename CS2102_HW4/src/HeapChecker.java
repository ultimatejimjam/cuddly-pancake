import java.util.LinkedList;

public class HeapChecker {

	HeapChecker() {

	}

	/*
	 * Is it a heap? Does the result contain all the elements from the original heap
	 * (the same number of occurrences)? Has the new element been added (or
	 * removed)? Are there no elements in result that weren't in original?
	 *
	 */

	boolean addEltTester(IHeap heap, int addition, IBinTree tree) {
		// takes a heap, an integer, and a binary tree (in that order) and returns true if
		// the binary tree is a valid result of adding the given integer to the first heap

		// check whether the starting heap and tree are, in fact, heaps
		boolean isValidHeap = heap.isHeap() && tree.isHeap();
		if (isValidHeap == false) {
			System.out.print("failing due to invalid heap");
			return false;
		}

		// result contain all elements from the original heap and new element
		LinkedList<Integer> heapData = heap.allHeapData();
		LinkedList<Integer> treeData = tree.allMtBtData();
		
		heapData.add(addition);
		
    	//System.out.println(heapData);
    	//System.out.println(treeData);


		
		boolean listsExclusive = (slowListCompare(heapData,treeData));
    	// System.out.println(listsExclusive);
		return listsExclusive; 

		// Does the result contain only the heap and addition?
	}

	boolean slowListCompare(LinkedList<Integer> a, LinkedList<Integer> b) {
        if (a.size() != b.size()) {
        	System.out.println("arrays are different sizes");
        	return false;
        }
        for (int i = 0; i < a.size(); i++) {
            int compare = a.get(i);
            if (b.contains(compare)) {
                b.remove((Object) compare);
            } else {
            	System.out.println("about to fail due to b not containing compare");
                return false;
            }
        }
        if (b.size() == 0) return true; // this clause checks that there aren't any more values in b than a
    	System.out.println("about to fail due to b not being empty");
        return false;
    }

	/**
	 * Tests if the heap which has an element removed is still a valid heap.
	 * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	 * @param hOrig The original heap
	 * @param hRemoved The binary tree which may be a valid / invalid heap
	 * @return True iff hRemoved is a heap and has all the elements bar the removed element as the original
	 */
	 public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved)
	  {
		  if (hOrig.size() - hRemoved.size() > 1 || hRemoved.size() > hOrig.size())
			  return false;
		  if (hRemoved.isHeap())
		  {
			  if(hasAllElts(hOrig, hRemoved))
			  {
				  return true;
			  }
			  else return false;
		  }
		  else return false;

	  }
	  
	 /**
	  * Determines if a tree fits the definition of a heap.
	  * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	  * @param hRemoved The binary tree which could be a heap.
	  * @return True iff hRemoved meets the criteria for a heap.
	  */
	  public boolean isHeap(IBinTree hRemoved)
	  {
		  // check to see if this is smaller than both the left and the right and then 
	      // recursive thru until hit empty. False breaks the loop
		  // add getRight or getData to IBinTree to get the correct checks
		  if (hRemoved.getData() == -999 || hRemoved.getLeft().getData() == -999 || hRemoved.getRight().getData() == -999)
			  return true;
		  else
		  {
			  if (hRemoved.getData() <= hRemoved.getLeft().getData()
					&& hRemoved.getData() <= hRemoved.getRight().getData()
					&& this.isHeap(hRemoved.getLeft()) 
					&& this.isHeap(hRemoved.getRight()))
			  {
				  return true;
			  }
			  else 
				  return false;
		  }
	  }
	  
	  /**
	   * Determines if the tree removed has all elements of the original tree, other than the removed min. elt.
	   * @author Andrew Peyton (abpeyton), James Mitchell (jemitchell)
	   * @param hOrig The original tree (a heap)
	   * @param hRemoved The new tree without the min. elt.
	   * @return True iff hRemoved has all elts (other than the root) of hOrig
	   */
	  public boolean hasAllElts(IBinTree hOrig, IBinTree hRemoved)
	  {
		  if (hOrig.getLeft().getData() == -999 || hOrig.getRight().getData() == -999 )
			  return true;
		  if (hRemoved.hasElt(hOrig.getLeft().getData()))
		  {
			  return this.hasAllElts(hOrig.getLeft(), hRemoved) || this.hasAllElts(hOrig.getRight(), hRemoved);
		  }
		  else
			  return false;
	  }
}
