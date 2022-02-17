import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arrange {
    Arrange() throws IOException{

            //Read the whole file into an array
            String[] list = new String[100];
            BufferedReader bufReader = new BufferedReader(new FileReader("ori.txt")); 
            int i=0;
            String line = bufReader.readLine(); 
		    while (line != null) 
		    { 
			    list[i]=line;
                i++;// count the increament
			    line = bufReader.readLine();
		    } 
            bufReader.close(); 

            //CLEAR ORIGINAL FILE
			File file1 = new File("ori.txt");
			FileWriter fr1 = new FileWriter(file1, false);
			fr1.flush();
			fr1.close();

            File file2 = new File("ori.txt");
			FileWriter fr2 = new FileWriter(file2, true);
            

            i=i-1;//To access last array #p1
            
            //WRITE THE PROGRAM TO THE ORIGINAL FILE. 
            for(int increament=0;increament<list.length;increament++){
                if(increament<i){
                    fr2.write(list[increament]);
                    fr2.write("\n");
                }
                
            }
            fr2.write(list[i]);//To be use here #p1
            fr2.close();
    }
}
