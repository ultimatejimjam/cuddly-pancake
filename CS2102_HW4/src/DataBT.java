import java.util.LinkedList;

class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// an alternate constructor for when both subtrees are empty
	DataBT(int data) {
		this.data = data;
		this.left = new MtBT();
		this.right = new MtBT();
	}
	
	public IBinTree getRight()
	 {
		 return this.right;
	 }
	 
	 public IBinTree getLeft()
	 {
		 return this.left;
	 }
	 
	 public int getData()
	 {
		 return this.data;
	 }

	// determines whether this node or node in subtree has given element
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}

	public boolean isHeap() {
		return this.left.areChildrenHeap(this.data) && this.right.areChildrenHeap(this.data);
	}

	public boolean areChildrenHeap(int root) {
		// recursive call to compare given integer to data in a child and then send the
		// data in the child to
		if (root <= this.data) {
			return this.isHeap();
		}
		return false;
	}
	
    public LinkedList<Integer> allMtBtData(){
        LinkedList<Integer> allData = new LinkedList<Integer>(); 
        allData.add(this.data);
        //System.out.println(data);
        allData.addAll(left.allMtBtData());
        allData.addAll(right.allMtBtData());
        return allData;
    };

}