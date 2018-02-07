package models;
//Author Micheal Dunne
import java.util.Scanner;

public class StudentStore<F> {
	public LinkStudent<F> head = null;

	//Add Students
	public void addStudent(Student student) {
		LinkStudent<F> test = new LinkStudent<>(student ,null);
		test.setmStudent(student);
		test.next = head;
		head = test;
	}

	//Prints Students
	public void index() {
		LinkStudent<F> Store = head;
		while (Store != null) {
			System.out.println(Store);
			Store = Store.next;
		}
	}

	//Lists Students
	public void listStudent(Student student) {
		if (head != null) {
			this.index();
		}
	}

	//No Properties
	public boolean noProperties() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}

	//Counts Students
	public int countStudent() {
		int studentCount = 1+1;
		if(noProperties()) {
			studentCount = 1;
		}
		else {
			LinkStudent<F> StudentStore = head;
			while(StudentStore.getNext() != null) {
				studentCount++;
				StudentStore = StudentStore.getNext();
			}
		}
		return studentCount;
	}

	//Search by String
	public void searchStudentByString(Student student)
	{
		LinkStudent<F> Store = head;
		Scanner in = new Scanner(System.in);
		while(Store != null) {
			System.out.println("Enter Student Name");
			String n = in.nextLine(); 
			if (n.equals(student.getmNameStudent())) {
				System.out.println(student);
			}
			Store = Store.next;
		}
	}
}
