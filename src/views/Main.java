package views;
import java.util.Scanner;

import models.Bed;
import models.BedStore;
import models.CSV;
import models.Link;
import models.LinkBed;
import models.LinkStudent;
import models.Property;
import models.PropertyStore;
import models.Room;
import models.RoomStore;
import models.Student;
import models.StudentStore;
//Author Micheal Dunne
public class Main {

	public static Main app;

	public Scanner mInput = new Scanner(System.in);

	Property property;
	Room room;
	Bed mBed;
	Student student = null;
	CSV csv;

	Link link;


	PropertyStore mPropertyStore;
	RoomStore mRoomStore;
	BedStore mBedStore;
	StudentStore mStudentStore;

	public String stringStore;
	public double doubleStore;
	public int integerStore;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app = new Main();
		app.mStartSwitch();
		app.load();
	}

	//Constructor
	public Main() {
		this.mPropertyStore = new PropertyStore();
		this.mRoomStore = new RoomStore();
		this.mBedStore = new BedStore();
		this.mStudentStore = new StudentStore();
	}

	//CSV Load
	private void load() {
		try {
			csv.loadCSV(stringStore);
		} catch (Exception e) {
			System.out.println("Error");
		}
		this.mStartSwitch();
	}


	//Menu
	public int mStart() {
		System.out.println("1) Add a new House");
		System.out.println("2) Add a Room");
		System.out.println("3) Add a bed");
		System.out.println("4) Add a student");
		System.out.println("5) List Properties");
		System.out.println("6) List Rooms");
		System.out.println("7) List Beds");
		System.out.println("8) List Students");
		System.out.println("9) Search");
		System.out.println("10) Assign");
		System.out.println("11) Search Bed");
		System.out.println("12) Clear beds");
		System.out.println("13) Search Property by Addess");
		System.out.println("0) Exit");
		int mHouse = mInput.nextInt();
		return mHouse;
	}

	//Menu Start
	public void mStartSwitch() {
		do {
			int mHouseSwitch = mStart();

			switch(mHouseSwitch) {
			case 1:
				this.mProperty(stringStore,doubleStore, integerStore);
				break;
			case 2:
				this.mRoom(integerStore, stringStore, integerStore);
				break;
			case 3:
				this.mBed(integerStore,stringStore,integerStore);
				break;
			case 4: 
				this.mStudent(stringStore, stringStore, stringStore, integerStore);
				break;
			case 5:
				this.mPropertyList();
				break;
			case 6:
				this.mRoomList();
				break;
			case 7:
				this.mBedList();
				break;
			case 8:
				this.mStudentList();
				break;
			case 9:
				this.mSearch();
				break;
			case 10:
				this.mAssign(mStudentStore, mBedStore);
				break;
			case 11:
				this.mSearchBed();
				break;
			case 12:
				this.mClearBeds();
				break;
			case 13:
				this.SearchByString(mPropertyStore);
				break;
			case 0:
				System.exit(0);
			default:
				System.exit(0);
			}
		}while(true);
	}

	//Search Property By String
	private void SearchByString(PropertyStore propertyString) {
		Link StoreProperty = propertyString.head;
		if (StoreProperty == null) {
			System.out.println("No Properties");
		}
		else {
			System.out.println("Enter the Property Address");
			String name = mInput.next();
			while(StoreProperty != null) {
				if (name.equals(StoreProperty.getmProperty().getmAddressProperty())) {
					System.out.println(StoreProperty);
				}
				else {
					System.out.println("Invalid address");
				}
				StoreProperty = StoreProperty.next;
			}
		}

	}

	//Clears all beds
	private void mClearBeds() {
		mBedStore.listBed(mBed);
		mBedStore.clear();

	}
	//Search By UID
	private void mSearchBed() {
		mBedStore.searchBedByUid();
	}
	//Assigning a bed 
	private void mAssign(StudentStore studentAssign,BedStore bedAssign) {
		LinkStudent StoreStudent = studentAssign.head;
		if (StoreStudent == null) {
			System.out.println("No Beds/Students");
		}
		else {
			System.out.println("Enter the name you would like to assign");
			String name = mInput.next();
			while(StoreStudent != null) {
				if (name.equals(StoreStudent.getmStudent().getmNameStudent())) {
					System.out.println("Your name is " + name);
				} 
				StoreStudent = StoreStudent.next;
			}
			bedAssign.listBed(mBed);
			LinkBed StoreBed = bedAssign.head;
			if(StoreBed != null) {
				System.out.println("Enter the bed you would like to assign to " + name);
				int bed = mInput.nextInt();
				while(StoreBed != null) {
					if (StoreBed.getmBed().getCostOfBed() == bed) {
						System.out.println("The Person's name is " + name + ". They are in " + StoreBed);
					} 
					StoreBed = StoreBed.next;
				}

			}
		}
	}
	//Search Properties By UID
	private void  mSearch() {
		mPropertyStore.searchPropertyByUid();
	}
	//Lists Students
	private String mStudentList() {
		mStudentStore.listStudent(student);
		String mList = mInput.next();
		return mList;
	}
	//Beds Lists
	private String mBedList() {
		mBedStore.listBed(mBed);
		String mList = mInput.next();
		return mList;
	}
	//Room Lists
	private String mRoomList() {
		mRoomStore.listRoom(room);
		String mList = mInput.next();
		return mList;
	}
	//Property Lists
	private String mPropertyList() {
		mPropertyStore.listProperty(property);
		String mList = mInput.next();
		return mList;
	}


	//Input for Properties
	private void mProperty(String mAddressHouse,double mDistance,int mSpace) {
		String addr = mHouseAddress(mAddressHouse);
		double distance = mDistanceToWIT(mDistance);
		int car = mCarSpaces(mSpace);
		int countProperty = mPropertyStore.countProperty();
		mPropertyStore.addProperty(new Property(addr,distance,car,countProperty));
	}
	//Input for Rooms
	private void mRoom(int level,String enSuite,int RoomProperty) {
		int mRoomChose = mRoomProperty(RoomProperty);
		int mLevel = mRoomLevel(level);
		String storeEnSuite = mEnSuite(enSuite);
		int countRoom = mRoomStore.countRoom();
		mRoomStore.addRoom(new Room(mLevel,storeEnSuite,mRoomChose,countRoom));
	}
	//Input for Beds
	private void mBed(int bed,String type,int cost) {
		int bedProp= mBedProperty(bed);
		String bedType = mBedType(type);
		int costOfBed = mBedCost(cost);
		int countBed = mBedStore.countBed();
		mBedStore.addBed(new Bed(bedProp,bedType,countBed,costOfBed));

	}
	//Input for Students
	private void mStudent(String name,String gender,String car,int studentId) {
		String nameSave = mName(name);
		String genderSave = mGender(gender);
		String carSave = mCar(car);
		int id = mStudentUid(studentId);
		int countStudent = mStudentStore.countStudent();
		mStudentStore.addStudent(new Student(nameSave,genderSave,carSave,id,countStudent));
	}



	//House Address
	public String mHouseAddress(String mAddressHouse) {
		System.out.println("What is the address of the house");
		mAddressHouse = mInput.next();
		return mAddressHouse;
	}
	//Distance from the college
	public double mDistanceToWIT(double distance) {
		System.out.println("How far are you away from WIT in Km");
		distance =	mInput.nextDouble();
		return distance;
	}
	//Car spaces available
	public int mCarSpaces(int spaces) {
		System.out.println("how many car parking spaces are available");
		spaces = mInput.nextInt();
		return spaces;
	}
	//Adds Room to Property
	public int mRoomProperty(int mRoomProperty) {
		if (mPropertyStore.countProperty() > 1) {
			mPropertyStore.listProperty(property);
			System.out.println("Enter which Number Property would you you like to add a Room to ");
			mRoomProperty = mInput.nextInt();
			if (mRoomProperty <= mPropertyStore.countProperty()) {
				return mRoomProperty;
			}
		}
		return 0;
	}
	//Room Level
	public int mRoomLevel(int level) {
		System.out.println("Enter what level the room is on");
		level = mInput.nextInt();
		return level;
	}
	//Room EnSuite
	public String mEnSuite(String enSuite) {
		System.out.println("Is this room an En Suite Yes or No");
		enSuite = mInput.next().toUpperCase();
		if((enSuite.equals("YES"))) {
			String r = "This room is an EnSuite";
			return r;
		}
		else if((enSuite.equals("NO"))){
			String r = "This room is not an EnSuite";
			return r;
		}
		return mEnSuite(enSuite);
	}
	//Adds Bed to Property
	public int mBedProperty(int bed) {
		if (mPropertyStore.countProperty() > 1) {
			mPropertyStore.listProperty(property);
			System.out.println("Enter which property you would like a bed to :");
			bed = mInput.nextInt();
			return bed;
		}
		return 0;
	}
	//The bed type
	public String mBedType(String type) {
		System.out.println("Enter what bed Type this is (Single/double or bunk)");
		type = mInput.next().toUpperCase();
		if((type.equals("SINGLE"))) {
			return type;
		}
		else if((type.equals("DOUBLE"))) {
			return type;
		}
		else if((type.equals("BUNK"))) {
			return type;
		}
		return null;
	}
	//Cost of the bed
	public int mBedCost(int cost) {
		System.out.println("Enter the cost of this bed");
		cost = mInput.nextInt();
		return cost;
	}

	//Person Name
	public String mName(String name) {
		System.out.println("Please enter your name");
		name = mInput.next();
		return name;
	}
	//Gender
	public String mGender(String gender) {
		System.out.println("Please enter your gender (Male/Female)");
		gender = mInput.next().toUpperCase();
		if (gender.equals("MALE")) {
			return gender;
		}
		else if(gender.equals("FEMALE")) {
			return gender;
		}
		else
			return null;
	}
	//Own Car
	public String mCar(String car) {
		System.out.println("Do you own a car Yes/No");
		car = mInput.next().toUpperCase();
		if (car.equals("YES")) {
			String r = "This Person owns a car. ";
			return r;
		}
		else 
			return null;

	}
	//StudentId
	public int mStudentUid(int id) {
		System.out.println("Please enter your  8 digit Unique Id");
		id = mInput.nextInt();
		return id;
	}

}