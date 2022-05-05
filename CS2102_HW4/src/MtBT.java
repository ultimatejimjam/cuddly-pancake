import java.util.LinkedList;

class MtBT implements IBinTree {
	MtBT() {
	}

	// returns false since empty tree has no elements
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since enpty tree has no elements
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	public int height() {
		return 0;
	}
	
	public IBinTree getRight()
	 {
		 return new MtBT();
	 }
	 public IBinTree getLeft()
	 {
		 return new MtBT();
	 }
	 public int getData()
	 {
		 return -999;
	 }

	public boolean isHeap() {
		return true;
	}

	public boolean areChildrenHeap(int root) {
		return true;
	}
	
	public LinkedList<Integer> allMtBtData(){
		return new LinkedList<Integer> ();
	}
	
	public LinkedList<Integer> childMtBtData(IBinTree side){
		return new LinkedList<Integer> ();
	}

}