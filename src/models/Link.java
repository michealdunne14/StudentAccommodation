package models;
//Author Micheal Dunne
public class Link<Test> {
	public Link<Test> next = null;
	private Test contents;

	public Property mProperty;
	public Link list;

	//Constructor
	public Link(Property mProperty, Link list) {
		this.mProperty = mProperty;
		this.list  = list;
	}
	//ToString
	public String toString() {
		return mProperty.toString();
	}
	//Getter
	public Property getmProperty() {
		return mProperty;
	}
	//Setter
	public void setmProperty(Property mProperty) {
		this.mProperty = mProperty;
	}
	//Getter
	public Link getList() {
		return list;
	}
	//Setter
	public void setList(Link list) {
		this.list = list;
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
	public Link<Test> getNext() {
		return next;
	}
	//Setter
	public void setNext(Link<Test> next) {
		this.next = next;
	}

}
