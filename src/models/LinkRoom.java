package models;
//Author Micheal Dunne
public class LinkRoom<Test> {
	public LinkRoom<Test> next = null;
	private Test contents;

	public Room mRoom;
	public LinkRoom link;

	//Constructor
	public LinkRoom(Room mRoom,LinkRoom link) {
		this.mRoom = mRoom;
		this.link = link;
	}
	//ToString
	public String toString() {
		return mRoom.toString();
	}
	//Getter
	public LinkRoom<Test> getNext() {
		return next;
	}
	//Setter
	public void setNext(LinkRoom<Test> next) {
		this.next = next;
	}
	//Getter
	public Test getContents() {
		return contents;
	}
	//Setter
	public void setContents(Test contents) {
		this.contents = contents;
	}
	//Getter
	public Room getmRoom() {
		return mRoom;
	}
	//Setter
	public void setmRoom(Room mRoom) {
		this.mRoom = mRoom;
	}
	//Getter
	public LinkRoom getLink() {
		return link;
	}
	//Setter
	public void setLink(LinkRoom link) {
		this.link = link;
	}


}
