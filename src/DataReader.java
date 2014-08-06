import java.util.Scanner;
import java.io.File;

public class DataReader {

	public static void main(String[] args) {

		try{
			File x = new File("Data.txt");
			
			Scanner reader = new Scanner(x);
			int ages=0, num=0;
		
			while(reader.hasNextLine()){
				
				String Line=reader.nextLine();
				String[] lineArray=Line.split(":");
				//for the age average.
				ages+=Integer.parseInt(lineArray[2]); num++;
				System.out.println("Name: "+lineArray[0]+ " " + lineArray[1]
						+"\nAge: "+ lineArray[2]+" years"
						+"\nState: "+lineArray[3]+"\n");

			}
			if (num>0)
				System.out.println("Average age: "+ages/num);
		
			reader.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
