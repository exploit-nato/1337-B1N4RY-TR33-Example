package Binary_Tree;
///
public class BinaryTree {
	////////
	static N0D3 r00t;
	////////
	BinaryTree(){ r00t = null; }
	////////
	public static void main(String[] args){
		BinaryTree tr33 = new BinaryTree();       
		tr33.r00t = new N0D3(30);                                   //30
		tr33.r00t.left = new N0D3(25);                          //25    \\50
		tr33.r00t.right = new N0D3(50);                     //20           \\72
		tr33.r00t.left.left = new N0D3(20);              //7   \\21           \\ 1337
		tr33.r00t.right.right = new N0D3(72);
		tr33.r00t.left.left.left = new N0D3(7);
		tr33.r00t.right.right.right = new N0D3(1337);
		tr33.r00t.left.left.right = new N0D3(21);
		tr33.traverseInOrder(r00t); // should return "7 20 21 25 30 50 72 1337"
	}
	////////
	public void traverseInOrder(N0D3 node){
		if(node == null) /* then */ return;
		traverseInOrder(node.left);
		System.out.print(node.key + " ");
		traverseInOrder(node.right);
	}
}
