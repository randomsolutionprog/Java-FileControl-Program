import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Delete{
	int Delete(int foundDelete) throws Exception{
		//CLEAR TEMP FILE
		File file = new File("temp.txt");
		FileWriter fr = new FileWriter(file, false);
		fr.flush();
		fr.close();
        
        int num = foundDelete;
        int loop=1;

		//FILTER NAME INTO TEMP FILE
		File file1 = new File("ori.txt");
		PrintWriter out = new PrintWriter("temp.txt");
		try (Scanner sc = new Scanner(file1)) {
			int i=1;
			String line="";
			
			while (sc.hasNextLine())
			{
				if(i!=num){
					line = sc.nextLine();
					out.println(line);
				}
				else{
					line = sc.nextLine();
				}
				i++;
                loop++;
			}
			out.close();
		}
		try{
			//CLEAR ORIGINAL FILE
			File file3 = new File("ori.txt");
			FileWriter fr3 = new FileWriter(file3, false);
			fr3.flush();
			fr3.close();
		}
		finally{
            //WRITE ORIGINAL FILE
			File file4 = new File("temp.txt");
			PrintWriter out2 = new PrintWriter("ori.txt");
			try (Scanner sc4 = new Scanner(file4)) {
				String line="";
				while (sc4.hasNextLine())
				{
                    
                        line = sc4.nextLine();
						out2.println(line);
                    
						
				}
			}
			out2.close();
		}

		//NEWLINE CONTROL
		int open=1;
        return open;
	}
}
