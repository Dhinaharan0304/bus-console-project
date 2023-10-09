package bus;
import java.util.*;
import java.sql.SQLException;
import java.text.*;

public class booking {
	String passenger_name;
	int busno;
	Date date;
booking(){
	Scanner s= new Scanner(System.in);
	System.out.println("enter name:");
	passenger_name=s.next();
	System.out.println("enter busno:");
	busno=s.nextInt();
	System.out.println("enter date dd-MM-YYYY:");
	String dateinput=s.next();
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
	
	try {
		date=df.parse(dateinput);
	}catch(ParseException e) {
		e.printStackTrace();	
		}
}
    public boolean isavailabilty() throws SQLException {
    	 busdb bdb=new busdb();
    	 bookdb book =new bookdb();
    	 int cap=bdb.getcapacity(busno);	
    	 int count=book.getcount(busno,date);
    	 return count<cap ;

          }
}
