//Class RBT implemets a red black tree
import java.util.Random;
import java.awt.Color;

public class RBT {
	
	RBPerson nil; 
	RBPerson root;
	//constructor for RBT
	public RBT() {
		RBPerson nilNode =  new RBPerson("", 0); //nil node
		nilNode.color = Color.BLACK;
		this.nil = nilNode;
		this.root = this.nil;
		
		//root.right = nil;
		//root.left = nil;
		//root.parent = nil;
		//root.color = "BLACK";
		
	}
	
	//left rotate method
	public void LeftRotate(RBPerson x) {
		RBPerson y = x.right;
		x.right = y.left;
		//checks for existance of y.left
		if(y.left != this.nil)
			y.left.parent = x;
		y.parent = x.parent;
		//parent is null
		if(x.parent == this.nil)
			this.root = y;
		//x is left child of parent
		else if(x == x.parent.left)
			x.parent.left= y;
		//x is right child of parent
		else 
			x.parent.right = y;
		y.left = x;
		x.parent = y;
	}
	
	//right rotate method
	public void RightRotate(RBPerson x) {
		RBPerson y = x.left;
		x.left = y.right;
		//checks for existance of x.right
		if(y.right != this.nil)
			y.right.parent = x;
		y.parent=x.parent;
		//parent is null
		if(x.parent == this.nil) {
			this.root = y;
		}
		else if(x==x.parent.right) {
			x.parent.right = y;
		}
		else
			x.parent.left = y;
		y.right = x;
		x.parent = y;
			
	}
	
	//inserts a person z into the RBT
	public void RbInsert(RBPerson z) {
		//create a reference to the root and initialize a node to nil
		RBPerson y = this.nil;
		RBPerson x = this.root;
		//While we havent reach the end of the tree, figure out where z should go
		while(x != this.nil) {
			y = x;
			//go left if less than
			if(z.getLicenseNumber() < x.getLicenseNumber()) {
				x = x.left;
			}
			//else go right
			else {
				x = x.right;
			}
		}
		//y = z's parent
		z.parent = y;
		if(y == this.nil) { 
			this.root = z;
		}
		else if(z.getLicenseNumber()<y.getLicenseNumber()) {
			y.left= z;
		}
		else {
			y.right = z;
		}
		z.left = this.nil;
		z.right = this.nil;
		z.color = Color.RED;
		RbInsertFixup(z);
			
	}
	
	//searches iteratively for a person based on the license number
	public RBPerson IterativeTreeSearch(RBPerson root, int k) {
		while( root != nil && k!= root.getLicenseNumber()) {
			if(k < root.getLicenseNumber())
				root=root.left;
			else
				root = root.right;
		}
		return root;
	}
	
	//fixup method for RBInsert
	public void RbInsertFixup(RBPerson z) {
		//while there is a violation of RBT Properties
		while(z.parent.color==Color.RED) {
			//if z's parent is the left child of its parent
			if(z.parent == z.parent.parent.left) {
				//initialize y to z's cousin
				RBPerson y = z.parent.parent.right;
				//Case 1: if y is red
				if(y.color == Color.RED) {
					z.parent.color = Color.BLACK;
			        y.color = Color.BLACK;
			        z.parent.parent.color = Color.RED;
			        z = z.parent.parent;
				}
				//Case 2: if y is black and z is a right child
				else if(z == z.parent.right) {
					z = z.parent;
					LeftRotate(z);
				}
				//Case 3: Y is black and z is a left child
				else {
					z.parent.color = Color.BLACK; 
			        z.parent.parent.color = Color.RED; 
			        RightRotate(z.parent.parent);
				}
				
			}
			//if z's parent is the right child of its parent
			else {
				RBPerson y = z.parent.parent.left;
				//Case 1: if y is red
				if(y.color == Color.RED) {
			        z.parent.color = Color.BLACK;
			        y.color = Color.BLACK;
			        z.parent.parent.color = Color.RED;
			        z = z.parent.parent;
				}
				//Case 2: Y is black and z is a left child
				else if(z == z.parent.left) {
					z =z.parent;
					RightRotate( z);
				}
				//Case 3: if y is black and z is a right child
				else {
					 z.parent.color = Color.BLACK; 
				     z.parent.parent.color = Color.RED; 
				     LeftRotate(z.parent.parent);
				}
			}
				
		}
		this.root.color = Color.BLACK;
	}
	//In-Order-Tree-Walk Method
		public void InOrderTreeWalk(RBPerson x) {
			if(x!=this.nil) {
				InOrderTreeWalk(x.left);
				System.out.println(x.name + " " + x.licenseNumber+ "  " + x.color + "  " +this.test(x));
				
				InOrderTreeWalk(x.right);
			}
		}
	
	//Find outs if NODE is red or black
	public String test(RBPerson x) {
		if(x.color.toString().contains("255")) {
			return "RED";
		}
		else 
			return"BLACK";
	}
	
	//Testing
	public static void main(String[] args) {
		RBT r = new RBT();
		Random rand = new Random();

		RBPerson Mike = new RBPerson("Mike", rand.nextInt(9000000)+1000000);
		RBPerson Jane = new RBPerson("Jane", rand.nextInt(9000000)+1000000);
		RBPerson James = new RBPerson("James", rand.nextInt(9000000)+1000000);
		RBPerson Marry = new RBPerson("Marry", rand.nextInt(9000000)+1000000);
		RBPerson Ben = new RBPerson("Ben", rand.nextInt(9000000)+1000000);
		RBPerson Mason = new RBPerson("Mason", rand.nextInt(9000000)+1000000);
		RBPerson Elijah = new RBPerson("Elijah", rand.nextInt(9000000)+1000000);
		RBPerson Oliver = new RBPerson("Oliver", rand.nextInt(9000000)+1000000);
		RBPerson Jacob = new RBPerson("Jacob", rand.nextInt(9000000)+1000000);
		RBPerson Lucas = new RBPerson("Lucas", rand.nextInt(9000000)+1000000);
		RBPerson Michael = new RBPerson("Michael", rand.nextInt(9000000)+1000000);
		RBPerson Sofia = new RBPerson("Sofia", rand.nextInt(9000000)+1000000);
		RBPerson Ethan = new RBPerson("Ethan", rand.nextInt(9000000)+1000000);
		RBPerson Daniel = new RBPerson("Daniel", rand.nextInt(9000000)+1000000);
		RBPerson Matthew = new RBPerson("Matthew", rand.nextInt(9000000)+1000000);
		RBPerson Ella = new RBPerson("Ella", rand.nextInt(9000000)+1000000);
		RBPerson Henry = new RBPerson("Henry", rand.nextInt(9000000)+1000000);
		RBPerson Victoria = new RBPerson("Victoria", rand.nextInt(9000000)+1000000);
		RBPerson Jackson = new RBPerson("Jackson", rand.nextInt(9000000)+1000000);
		RBPerson Joy = new RBPerson("Joy", rand.nextInt(9000000)+1000000);
		
		//System.out.println(r.root.getLicenseNumber());
		r.RbInsert(Mike);
		r.RbInsert(Jane);
		r.RbInsert( James);
		r.RbInsert( Marry);
		r.RbInsert( Ben);
		r.RbInsert( Mason);
		r.RbInsert(Elijah);
		r.RbInsert(Oliver);
		r.RbInsert(Jacob);
		r.RbInsert( Lucas);
		r.RbInsert( Michael);
		r.RbInsert( Sofia);
		r.RbInsert( Ethan);
		r.RbInsert( Daniel);
		r.RbInsert( Matthew);
		r.RbInsert( Ella);
		r.RbInsert( Henry);
		r.RbInsert( Victoria);
		r.RbInsert( Jackson);
		r.RbInsert( Joy);
		
		r.InOrderTreeWalk(r.root);
		//System.out.println();
		//r.PreOrder(r.root);
		System.out.println("\nJoys license number is: " + r.IterativeTreeSearch( r.root, Joy.getLicenseNumber()).getLicenseNumber());
	}
}
