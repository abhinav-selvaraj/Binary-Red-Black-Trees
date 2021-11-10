//BST class the implements insert, delete, and In-Order

import java.util.Random;

public class BST {
	Person root;
	//constructor sets root to null
	public BST() {
		root = null;
	}
	
	//inserts a Person z into BST b
	public void TreeInsert(BST b, Person z) {
		Person y = null; //pointer
		Person x = b.root;
		
		//while root != null goes left or right depending on key
		while(x != null) {
			y = x;
			if(z.getLicenseNumber() < x.getLicenseNumber()) { 
				x = x.left; //if less than
			}
			else {
				x = x.right; // if greater than
			}
		}
		
		//set the pointers that cause z to be inserted
		z.parent =y;
		if(y == null)
			b.root = z;
		else if(z.getLicenseNumber() < y.getLicenseNumber()) 
			y.left = z;
		else 
			y.right = z;
			
	}
	
	//Deletes a Person z from BST b
	public void TreeDelete(BST b, Person z) {
		Person y;
		//if no left child
		if(z.left == null)
			Transplant(b, z, z.right);
		//has left child but no right child
		else if(z.right == null) 
			Transplant(b, z, z.left);
		//remaining two cases where there r 2 children
		else {
			 y = TreeMinimum(z.right); //finds successor
			 if(y.parent != z) {
				 Transplant(b, y, y.right);
				 y.right = z.right;
				 y.right.parent = y;
			 }
			 Transplant(b, z, y);
			 y.left = z.left;
			 y.left.parent =y;
		}
		
	}
	
	//replaces the subtree rooted at node u with the subtree rooted at node v
	public void Transplant(BST b, Person u, Person v) {
		//if u is the root
		if(u.parent ==  null)
			root = v;
		//updates left
		else if(u == u.parent.left)
			u.parent.left=v;
		//updates right
		else
			u.parent.right = v;
		if(v != null) {
			v.parent = u.parent;
		}
	}
	
	//Find the minimunm of a tree by constinuosly going left starting at the roo
	public Person TreeMinimum(Person root) {
		//keeps going left
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	
	//In-Order-Tree-Walk Method (Left, Root, Right)
	public void InOrderTreeWalk(Person x) {
		if(x!=null) {
			InOrderTreeWalk(x.left);
			System.out.println(x.name + " " + x.licenseNumber);
			InOrderTreeWalk(x.right);
		}
	}
	
	//Recursively searches throught the tree with a given license number k
	public Person TreeSearch(Person root, int k) {
		//if found or not in the tree
		if(root == null || k == root.licenseNumber) {
			return root;
		}
		//if less go left subtree
		if(k < root.getLicenseNumber()) {
			return TreeSearch(root.left, k);
		}
		//if greater go rigth subtree
		else
			return TreeSearch(root.right, k);
	}
	
	
	//main class where all the testing is done
	public static void main(String[] args) {
		Random rand = new Random();
		BST b = new BST();
		Person	Mike = new Person("Mike", rand.nextInt(9000000)+1000000);
		Person	Jane = new Person("Jane", rand.nextInt(9000000)+1000000);
		Person	James = new Person("James", rand.nextInt(9000000)+1000000);
		Person Marry = new Person("Marry", rand.nextInt(9000000)+1000000);
		Person Ben = new Person("Ben", rand.nextInt(9000000)+1000000);
		Person Mason = new Person("Mason", rand.nextInt(9000000)+1000000);
		Person Elijah = new Person("Elijah", rand.nextInt(9000000)+1000000);
		Person Oliver = new Person("Oliver", rand.nextInt(9000000)+1000000);
		Person Jacob = new Person("Jacob", rand.nextInt(9000000)+1000000);
		Person Lucas = new Person("Lucas", rand.nextInt(9000000)+1000000);
		Person Michael = new Person("Michael", rand.nextInt(9000000)+1000000);
		Person Sofia = new Person("Sofia", rand.nextInt(9000000)+1000000);
		Person Ethan = new Person("Ethan", rand.nextInt(9000000)+1000000);
		Person Daniel = new Person("Daniel", rand.nextInt(9000000)+1000000);
		Person Matthew = new Person("Matthew", rand.nextInt(9000000)+1000000);
		Person Ella = new Person("Ella", rand.nextInt(9000000)+1000000);
		Person Henry = new Person("Henry", rand.nextInt(9000000)+1000000);
		Person Victoria = new Person("Victoria", rand.nextInt(9000000)+1000000);
		Person Jackson = new Person("Jackson", rand.nextInt(9000000)+1000000);
		Person Joy = new Person("Joy", rand.nextInt(9000000)+1000000);
		
		b = new BST();
		b.TreeInsert(b, Mike);
		b.TreeInsert(b, Jane);
		b.TreeInsert(b, James);
		b.TreeInsert(b, Marry);
		b.TreeInsert(b, Ben);
		b.TreeInsert(b, Mason);
		b.TreeInsert(b, Elijah);
		b.TreeInsert(b, Oliver);
		b.TreeInsert(b, Jacob);
		b.TreeInsert(b, Lucas);
		b.TreeInsert(b, Michael);
		b.TreeInsert(b, Sofia);
		b.TreeInsert(b, Ethan);
		b.TreeInsert(b, Daniel);
		b.TreeInsert(b, Matthew);
		b.TreeInsert(b, Ella);
		b.TreeInsert(b, Henry);
		b.TreeInsert(b, Victoria);
		b.TreeInsert(b, Jackson);
		b.TreeInsert(b, Joy);
		
		b.InOrderTreeWalk(b.root);
		//System.out.println();
		//b.PreOrder( b.root);
		//b.InOrderTreeWalk(b.root);
		//b.TreeDelete(b, Joy);
		//System.out.println();
		//b.InOrderTreeWalk(b.root);
		System.out.println(b.TreeSearch(b.root, Mike.getLicenseNumber()).getLicenseNumber());
		//System.out.println(Joy);
	}
	
	
	
}
