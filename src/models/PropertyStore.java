package models;
//Author Micheal Dunne
import java.util.Scanner;

public class PropertyStore<F> {
	public Link<F> head  = null;

	private Property property;
	Student student;
	StudentStore mStudentStore;
	//Add Properties
	public void addProperty(Property property) {
		Link<F> test = new Link<>(property, null);
		test.setmProperty(property);
		test.next = head;
		head = test;
	}
	//NoProperties
	public boolean noProperties() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}


	//Prints the Properties
	public void index() {
		Link Store = head;
		while(Store != null) {
			System.out.println(Store);
			Store=Store.next;
		}
	}
	//Prints the Properties
	public void  listProperty(Property property) {
		if(head != null) {
			this.index();
		}
	}
	//Counts each property
	public int countProperty() {
		int propertyCount = 1+1;
		if (noProperties()) {
			propertyCount = 1;
		}
		else {
			Link HouseStore = head;
			while(HouseStore.getNext() != null) {
				propertyCount++;
				HouseStore = HouseStore.getNext();
			}
		}
		return propertyCount;

	}
	//Clears all Properties
	public void clear() {
		head = null;
	}
	//Search Properties by their Uid
	public void searchPropertyByUid()
	{
		int n;

		Link Store = head;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your which property Uid would like to find");
		n = in.nextInt(); 
		while(Store != null) {
			if (Store.getmProperty().getCountProperty() == n) {
				System.out.println(Store);
			} 
			Store = Store.next;
		}
	}

}