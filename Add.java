import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Add {
    int add(int open) throws Exception{
        File file = new File("ori.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(System.in);

        String addName;
        String addAge;
        System.out.println("*DATA INPUT*");
        System.out.print("Enter Name:");
        addName = scanner.nextLine();
        System.out.print("Enter Age:");
        addAge = scanner.nextLine();

        //THIS CODE IS TO CONTROL CREATING NEW LINE
        if(open==1){
            
        }
        else{
            br.write("\n");
        }

        //STACKING A LINE WITH SPACES
		for(int x=1;x<=3;x++)
		{
			if((x%2)==0)
			{
				br.write(" ");	
			}
			else if(x==1)
			{
				br.write(addName);
			}
			else if(x==3)
			{
				br.write(addAge);
			}
        }
    
		br.close();
		fr.close();

        //NEWLINE CONTROL
        open=0;
        return open; 
    }
}
