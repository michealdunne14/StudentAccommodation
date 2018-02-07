package models;

//Author Micheal Dunne
public class Property{

	public String mAddressProperty;
	public double mDistanceProperty;
	public int mSpacesProperty;
	public int countProperty;

	//Constructor
	public Property(String mAddressProperty, double mDistanceProperty, int mSpacesProperty, int countProperty) {
		this.mAddressProperty = mAddressProperty;
		this.mDistanceProperty = mDistanceProperty;
		this.mSpacesProperty = mSpacesProperty;
		this.countProperty = countProperty;

	}

	//ToString
	public String toString() {
		return propertyToString();
	}
	//ToString
	public String propertyToString() {
		return "Property " + getCountProperty() + "  The Address of the House is " + getmAddressProperty() + ". The Distance From WIT is "
				+  getmDistanceProperty() + "Km" + ". The amount of car spaces available are " + getmSpacesProperty() + "." + "\n"; 
	}

	//Getter
	public String getmAddressProperty() {
		return mAddressProperty;
	}
	//Setter
	public void setmAddressProperty(String mAddressProperty) {
		if (mAddressProperty.length() <= 50) {
			this.mAddressProperty = mAddressProperty;
		}
		else {
			System.out.println("Error");
		}
	}
	//Getter
	public double getmDistanceProperty() {
		return mDistanceProperty;
	}
	//Setter
	public void setmDistanceProperty(double mDistanceProperty) {
		if(mDistanceProperty >= 50) {
			System.out.println("To Far from college");
		}
		this.mDistanceProperty = mDistanceProperty;
	}
	//Getter
	public int getmSpacesProperty() {
		return mSpacesProperty;
	}
	//Setter
	public void setmSpacesProperty(int mSpacesProperty) {
		if (mSpacesProperty <= 10) {
			this.mSpacesProperty = mSpacesProperty;
		}
	}
	//Getter
	public int getCountProperty() {
		return countProperty;
	}

	//Setter
	public void setCountProperty(int countProperty) {
		this.countProperty = countProperty;
	}

}
