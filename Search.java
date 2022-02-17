import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search {
    int Search() throws IOException{
        String name = "";
        Scanner scanner = new Scanner(System.in);

        //Take Input String From User
        System.out.print("Enter Name:");
        name=scanner.nextLine();

        File f=new File("ori.txt");
        BufferedReader freader = new BufferedReader(new FileReader(f));
        
        //Intialise variable for scanning phase
        String read;
        int i=1;
        int found=0;

        //Scanning phase line by line
        while(( read = freader.readLine()) != null) 
		{
			
			String[] st = read.split(" ");// Seperate a line of string in original file into a string by checking spaces
			String readName = st[0];
			String readAge= st[1];

			if(readName.equals(name))
			{
                System.out.println("****Founded Name****");
                System.out.println("Name:"+ readName +"\nAge:"+ readAge);
                System.out.println("****Name Deleted****");
				found=i; //The itteraration of scanning phase.
			}
			else
			{
				i++;
			}	
		}
        if(found==0){
            System.out.println("****Name Not Found****\nPlease Check Your Spelling!!");
        }
        return found;
    }
   
}
