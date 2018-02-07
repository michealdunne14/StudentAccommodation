package models;
//Author Micheal Dunne
public class Student {

	public String mNameStudent;
	String mGenderStudent;
	public String mCarStudent;
	public int mUidStudent;
	public int countStudent;
	BedStore bed;

	//Constructor
	public Student(String mNameStudent, String mGenderStudent, String mCarStudent, int mUidStudent, int countStudent) {
		this.mNameStudent = mNameStudent;
		this.mGenderStudent = mGenderStudent;
		this.mCarStudent = mCarStudent;
		this.mUidStudent = mUidStudent;
		this.countStudent = countStudent;
	}
	//ToString
	public String toString() {
		return "The name is " + getmNameStudent() + ". The gender of this person is " + getmGenderStudent() + "." + getmCarStudent()
		+ "The Uid of this person is " + getmUidStudent();
	}

	//Getter
	public String getmNameStudent() {
		return mNameStudent;
	}

	//Setter
	public void setmNameStudent(String mNameStudent) {
		this.mNameStudent = mNameStudent;
	}
	//Getter
	public String getmGenderStudent() {
		return mGenderStudent;
	}
	//Setter
	public void setmGenderStudent(String mGenderStudent) {
		this.mGenderStudent = mGenderStudent;
	}
	//Getter
	public String getmCarStudent() {
		return mCarStudent;
	}
	//Setter
	public void setmCarStudent(String mCarStudent) {
		this.mCarStudent = mCarStudent;
	}
	//Getter
	public int getmUidStudent() {
		return mUidStudent;
	}
	//Setter
	public void setmUidStudent(int mUidStudent) {
		this.mUidStudent = mUidStudent;
	}
	//Getter
	public int getCountStudent() {
		return countStudent;
	}
	//Setter
	public void setCountStudent(int countStudent) {
		this.countStudent = countStudent;
	}
	//Getter
	public BedStore getBed() {
		return bed;
	}
	//Setter
	public void setBed(BedStore bedAssign) {
		this.bed = bedAssign;
	}

}
