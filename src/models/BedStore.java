package models;
//Author Micheal Dunne
import java.util.Scanner;

import views.Main;

public class BedStore<A> {
	public LinkBed<Bed> head = null;

	public Scanner mInput = new Scanner(System.in);

	Bed mBed;

	//Adds a bed.
	public void addBed(Bed bed) {
		LinkBed<Bed> test = new LinkBed<>(bed,null);
		test.setmBed(bed);
		test.next = head;
		head = test;
	}
	//Checks to see if there is beds. 
	public boolean noBeds() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	//Prints the beds
	public void index() {
		LinkBed Store = head;
		while(Store != null) {
			System.out.println(Store);
			Store=Store.next;
		}
	}
	//Lists the beds
	public void listBed(Bed bed) {
		if(head != null) {
			this.index();
		}
	}
	//Counts each bed.
	public int countBed() {
		int bedCount = 1+1;
		if (noBeds()) {
			bedCount = 1;
		}
		else {
			LinkBed BedStore = head;
			while(BedStore.getNext() != null) {
				bedCount++;
				BedStore = BedStore.getNext();
			}
		}
		return bedCount;
	}
	//clears the beds. 
	public void clear() {
		head = null;
	}

	//Search for beds by there universal identification. 
	public void searchBedByUid()
	{
		LinkBed<Bed> Store = head;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your which Bed Uid would like to find");
		int n = in.nextInt(); 
		while(Store != null) {
			if (Store.getmBed().getCostOfBed() == n) {
				System.out.println(Store);
			} 
			Store = Store.next;
		}
	}
}
