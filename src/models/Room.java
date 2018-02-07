package models;
//Author Micheal Dunne
public class Room {

	public int mLevelRoom;
	public String mEnSuiteRoom;
	public int mRoomChose;
	public int countRoom;
	//public beds

	//Constructor
	public Room(int mLevelRoom, String storeEnSuite, int mRoomChose, int countRoom) {
		this.mLevelRoom = mLevelRoom;
		this.mEnSuiteRoom = storeEnSuite;
		this.mRoomChose = mRoomChose;
		this.countRoom = countRoom;
	}
	//ToString
	public String toString() {
		return "The Level of the room is " + getmLevelRoom()+ " " + getmEnSuiteRoom() + ". It is in Property " + getmRoomChose();
	}
	//Getter
	public int getmLevelRoom() {
		return mLevelRoom;
	}
	//Setter
	public void setmLevelRoom(int mLevelRoom) {
		this.mLevelRoom = mLevelRoom;
	}
	//Getter
	public String ismEnSuiteRoom() {
		return mEnSuiteRoom;
	}
	//Setter
	public void setmEnSuiteRoom(String mEnSuiteRoom) {
		this.mEnSuiteRoom = mEnSuiteRoom;
	}
	//Getter
	public String getmEnSuiteRoom() {
		return mEnSuiteRoom;
	}
	//Getter
	public int getmRoomChose() {
		return mRoomChose;
	}
	//Setter
	public void setmRoomChose(int mRoomChose) {
		this.mRoomChose = mRoomChose;
	}
	//Getter
	public int getCountRoom() {
		return countRoom;
	}
	//Setter
	public void setCountRoom(int countRoom) {
		this.countRoom = countRoom;
	}


}
