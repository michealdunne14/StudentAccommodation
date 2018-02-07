package models;
//Author Micheal Dunne
import views.Main;

public class RoomStore<F> {
	public LinkRoom<F> head = null;

	private Main main;
	private Room room;

	//Add Room
	public void addRoom(Room room) {
		LinkRoom<F> test = new LinkRoom<>(room, null);
		test.setmRoom(room);
		test.next = head;
		head = test;

	}
	//No Properties
	private boolean noProperties() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}

	//Prints Rooms
	public void index() {
		LinkRoom Store = head;
		while(Store != null) {
			System.out.println(Store);
			Store=Store.next;

		}
	}

	//Prints Rooms
	public void  listRoom(Room room) {
		if(head != null) {
			this.index();
		}
	}
	//Counts Rooms
	public int countRoom() {
		int roomCount = 0;
		if(noProperties()) {
			roomCount = 0;
		}
		else {
			LinkRoom RoomStore = head;
			while(RoomStore.getNext()!= null) {
				roomCount++;
				RoomStore = RoomStore.getNext();
			}
		}
		return roomCount;
	}

}
