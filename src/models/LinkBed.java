package models;
//Author Micheal Dunne
public class LinkBed<Test> {
	public LinkBed<Test> next = null;
	private Test contents;

	public Bed mBed;
	public LinkBed linkBed;

	//Constructor
	public LinkBed(Bed mBed, LinkBed linkBed) {
		this.mBed = mBed;
		this.linkBed = linkBed;
	}
	//ToString
	public String toString() {
		return mBed.toString();
	}
	//Getter
	public LinkBed<Test> getNext() {
		return next;
	}
	//Setter
	public void setNext(LinkBed<Test> next) {
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
	public Bed getmBed() {
		return mBed;
	}
	//Setter
	public void setmBed(Bed mBed) {
		this.mBed = mBed;
	}
	//Getter
	public LinkBed getLinkBed() {
		return linkBed;
	}
	//Setter
	public void setLinkBed(LinkBed linkBed) {
		this.linkBed = linkBed;
	}
}
