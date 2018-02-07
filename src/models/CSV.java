package models;
import java.io.*;
//Author Micheal Dunne
public class CSV {

	//This Stores all the data in a csv file
	public void loadCSV(String filename) {

		filename = ("/Users/miche_000/eclipse-workspace/assign1/src/models/Store.csv");
		File f = new File(filename);
		try {
			FileReader fis=new FileReader(f);

			BufferedReader br=new BufferedReader(fis);

			String str=null;

			do{
				try {
					str=br.readLine();

					System.out.println(str);




					String[] tokens=str.split(",");





				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}while(str != null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}










