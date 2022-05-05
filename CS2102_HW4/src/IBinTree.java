import java.util.LinkedList;

interface IBinTree {
	// determines whether element is in the tree
	boolean hasElt(int e);

	// returns number of nodes in the tree; counts duplicate elements as separate
	// items
	int size();

	// returns depth of longest branch in the tree
	int height();

	boolean isHeap();

	boolean areChildrenHeap(int root);
	
	LinkedList<Integer> allMtBtData();
	
	int getData(); // returns root of tree
	 
	IBinTree getRight(); //returns right side of tree
	 
	IBinTree getLeft(); // returns left side of tree
}