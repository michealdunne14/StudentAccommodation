package models;
//Author Micheal Dunne
public class LinkStudent<Test> {
	public LinkStudent<Test> next = null;
	private Test contents;

	public Student mStudent;
	public LinkStudent link;

	//Constructor
	public LinkStudent(Student mStudent, LinkStudent link) {
		this.mStudent = mStudent;
		this.link = link;
	}
	//ToString
	public String toString() {
		return mStudent.toString();
	}
	//Getter
	public LinkStudent<Test> getNext() {
		return next;
	}
	//Setter
	public void setNext(LinkStudent<Test> next) {
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
	public Student getmStudent() {
		return mStudent;
	}
	//Setter
	public void setmStudent(Student mStudent) {
		this.mStudent = mStudent;
	}
	//Getter
	public LinkStudent getLink() {
		return link;
	}
	//Setter
	public void setLink(LinkStudent link) {
		this.link = link;
	}

}
