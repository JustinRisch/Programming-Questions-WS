import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class DataReaderWithWriter {

	public static void main(String[] args) {

		try{
			File x = new File("Data.txt");
			FileWriter writer = new FileWriter("DataOut.txt");
			Scanner reader = new Scanner(x);
			int ages=0, num=0;
		
			while(reader.hasNextLine()){
				
				String Line=reader.nextLine();
				String[] lineArray=Line.split(":");
				//for the age average.
				ages+=Integer.parseInt(lineArray[2]); num++;
				writer.write("Name: "+lineArray[0]+ " " + lineArray[1]
						+"\nAge: "+ lineArray[2]+" years"
						+"\nState: "+lineArray[3]+"\n\n");

			}
			if (num>0)
				writer.write("Average age: "+ages/num);
			writer.close();
			reader.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
