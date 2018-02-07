package models;
//Author Micheal Dunne
public class Bed {

	public int mBedProperty,costOfBed,countBed;
	public String bedType;
	String student;

	//Constructor
	public Bed(int mBedProperty, String bedType, int costOfBed, int countBed) {
		this.mBedProperty = mBedProperty;
		this.bedType = bedType;
		this.costOfBed = costOfBed;
		this.countBed = countBed;

	}

	//Prints out all the information for bed.
	public String toString() {
		return "Bed " + getCostOfBed() + " The type of bed is " + getBedType() + " The cost of the bed is €" + getCountBed() + " This bed is in Property " + getmBedProperty();
	}

	//Gets the property you would like to add a bed to 
	public int getmBedProperty() {
		return mBedProperty;
	}

	//Gets the counts of beds
	public int getCountBed() {
		return countBed;
	}
	//Sets the counts of beds
	public void setCountBed(int countBed) {
		this.countBed = countBed;
	}
	//Sets the property you would like to add a bed to 
	public void setmBedProperty(int mBedProperty) {
		this.mBedProperty = mBedProperty;
	}
	//Gets the cost of each bed
	public int getCostOfBed() {
		return costOfBed;
	}
	//Sets the cost of each bed
	public void setCostOfBed(int costOfBed) {
		this.costOfBed = costOfBed;
	}
	//Gets the bed type
	public String getBedType() {
		return bedType;
	}
	//Sets the bed type
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	//Gets the Student
	public String getStudent() {
		return student;
	}
	//Sets the Student
	public void setStudent(String name) {
		this.student = name;
	}

}
