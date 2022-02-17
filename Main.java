import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int result;
        int mainOpen=0;
        int option=1;
        System.out.println("WELCOME TO FILE CONTROL PROGRAM");
        System.out.println("*******************");
        do{
            do{
                System.out.print("Add=1 or Delete?=2:");
                result= scanner.nextInt();
                if(result!=1 && result!=2) {
                    System.out.println("Invalid Option");
                }
            }while(result!=1 && result!=2);
            
    
            switch(result) {
                case 1:
                Add add = new Add();
                mainOpen=add.add(mainOpen);
                break;
    
                case 2:
                Search search = new Search();
                int foundSearch= search.Search();
                Delete delete = new Delete();
                mainOpen=delete.Delete(foundSearch);
                break;
    
            }
            System.out.print("Continue? press 1:");
            option=scanner.nextInt();
            System.out.println("*************");

        }while(option==1);
        scanner.close();
        new Arrange();
    }
}
