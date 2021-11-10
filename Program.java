//The class where the program is implemented

import java.util.Random;
import java.util.Scanner;

public class Program {
	//create necessary objects
	static BST b = new BST();
	static RBT r = new RBT();
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	
	//initialize and add all the names of the people
	public static void main(String[] args) {
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
		
		RBPerson Mike1 = new RBPerson("Mike", rand.nextInt(9000000)+1000000);
		RBPerson Jane1 = new RBPerson("Jane", rand.nextInt(9000000)+1000000);
		RBPerson James1 = new RBPerson("James", rand.nextInt(9000000)+1000000);
		RBPerson Marry1 = new RBPerson("Marry", rand.nextInt(9000000)+1000000);
		RBPerson Ben1 = new RBPerson("Ben", rand.nextInt(9000000)+1000000);
		RBPerson Mason1 = new RBPerson("Mason", rand.nextInt(9000000)+1000000);
		RBPerson Elijah1 = new RBPerson("Elijah", rand.nextInt(9000000)+1000000);
		RBPerson Oliver1 = new RBPerson("Oliver", rand.nextInt(9000000)+1000000);
		RBPerson Jacob1 = new RBPerson("Jacob", rand.nextInt(9000000)+1000000);
		RBPerson Lucas1 = new RBPerson("Lucas", rand.nextInt(9000000)+1000000);
		RBPerson Michael1 = new RBPerson("Michael", rand.nextInt(9000000)+1000000);
		RBPerson Sofia1 = new RBPerson("Sofia", rand.nextInt(9000000)+1000000);
		RBPerson Ethan1 = new RBPerson("Ethan", rand.nextInt(9000000)+1000000);
		RBPerson Daniel1 = new RBPerson("Daniel", rand.nextInt(9000000)+1000000);
		RBPerson Matthew1 = new RBPerson("Matthew", rand.nextInt(9000000)+1000000);
		RBPerson Ella1 = new RBPerson("Ella", rand.nextInt(9000000)+1000000);
		RBPerson Henry1 = new RBPerson("Henry", rand.nextInt(9000000)+1000000);
		RBPerson Victoria1 = new RBPerson("Victoria", rand.nextInt(9000000)+1000000);
		RBPerson Jackson1 = new RBPerson("Jackson", rand.nextInt(9000000)+1000000);
		RBPerson Joy1 = new RBPerson("Joy", rand.nextInt(9000000)+1000000);
		
		r.RbInsert( Mike1);
		r.RbInsert( Jane1);
		r.RbInsert( James1);
		r.RbInsert( Marry1);
		r.RbInsert( Ben1);
		r.RbInsert( Mason1);
		r.RbInsert( Elijah1);
		r.RbInsert( Oliver1);
		r.RbInsert( Jacob1);
		r.RbInsert( Lucas1);
		r.RbInsert( Michael1);
		r.RbInsert( Sofia1);
		r.RbInsert( Ethan1);
		r.RbInsert( Daniel1);
		r.RbInsert( Matthew1);
		r.RbInsert( Ella1);
		r.RbInsert( Henry1);
		r.RbInsert( Victoria1);
		r.RbInsert( Jackson1);
		r.RbInsert( Joy1);
		
		displayOptions();

	}
	//displays what the user should be able to do
		public static void displayOptions() {
			System.out.println("Choose Program to Run: \n"
					+ "1) BST \n"
					+ "2) RBT \n"
					+ "3) Exit Program \n");
			
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				bst(); //go to bst operations
			}
			else if(choice == 2) {
				rbt(); //go to rbt operations
			}
			else if(choice == 3) {
				System.exit(0); //exit program
			}
			
			else{
				System.out.println("Not a valid option");
				displayOptions(); //dipslay the options again
			}
	
		}
		//all the rbt functions
		private static void rbt() {
			// TODO Auto-generated method stub
			System.out.println("This is the current RBT in order");
			r.InOrderTreeWalk(r.root); //print what it is currently
			//ask and get user input
			System.out.print("\nWhat would you like to do: \n"
					+ "1)Insert a name based on a 7-digit number \n"
					+ "2)Search a name \n"
					+ "3) Go back");
			int choice = sc.nextInt();
			//insert a name based on user input
			if(choice == 1) {
				System.out.println("insert number: ");
				int num = sc.nextInt();
				System.out.println("insert name: ");
				String name = sc.next();

				RBPerson temp = new RBPerson(name,num);
				r.RbInsert(temp);
				System.out.println("The updated list is:\n");
				//r.InOrderTreeWalk(r.root);
				rbt();
			}
			//search a name based on user input
			else if(choice == 2) {
				System.out.println("Choose name to search by entering 7 digit number: ");
				int num = sc.nextInt();
				RBPerson temp = r.IterativeTreeSearch(r.root, num);
				System.out.println("The persons info is: NAME: " + temp.name + " " + "LICENSE NUMBER: " + temp.licenseNumber+ "  " + temp.color + "  " +r.test(temp)+ "\n");
				rbt();
			}
			//go back
			else
				displayOptions();
			
		}
		//bst functions
		private static void bst() {
			// TODO Auto-generated method stub
			System.out.println("This is the current BST in order\n");
			b.InOrderTreeWalk(b.root); //show current tree
			//ask and get user input
			System.out.println("\nWhat would you like to do: \n"
					+ "1)Insert a name based on 7-digit number \n"
					+ "2)Delete a name based on 7-digit number \n"
					+ "3)Display inOrder walk \n"
					+ "4) Go back");
			int choice = sc.nextInt();
			//insert a name
			if(choice == 1) {
				System.out.println("insert number: ");
				int num = sc.nextInt();
				System.out.println("insert name: ");
				String name = sc.next();

				Person temp = new Person(name,num);
				b.TreeInsert(b, temp);
				System.out.println("The updated list is:\n");
				//b.InOrderTreeWalk(b.root);
				bst();
			}
			//delete a name
			else if(choice == 2) {
				System.out.println("choose name to delete by typinh in DL number: ");
				int name = sc.nextInt();
				Person p = b.TreeSearch(b.root, name);
				b.TreeDelete(b, p);
				//b.InOrderTreeWalk(b.root);
				bst();
			}
			//display in order tree walk
			else if(choice == 3) {
				b.InOrderTreeWalk(b.root);
				bst();
			}
			//go back
			else if(choice == 4) {
				displayOptions();
			}
			else {
				System.out.println("Invalid");
				System.exit(0);
			}
		}
}
