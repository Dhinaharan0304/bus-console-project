package bus;

import java.util.*;
import java.sql.*;;


public class main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		busdb bdb= new busdb();
		bdb.display();
		int useroption=1;
	   while(useroption==1) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter 1 to book and 2 to exit ");
	   useroption=sc.nextInt();
	   booking bo = new booking();
	   if(bo.isavailabilty()){
		   bookdb book =new bookdb();
		   book.register(bo);
		   System.out.println("booking is success");
	       }
		   else
			   System.out.println("seat is full choose differ busno are 1date");
		   
	  
	   }
	   
	  
       
	  }
	}
	  

