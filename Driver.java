import java.util.*;
public class Driver{
	public static void main(String[] args){
	ArrayList<Computer1> computerList = new ArrayList<Computer1>();
	Scanner scan  = new Scanner(System.in);
	
	String type = scan.nextLine();

	if (type.equals("DesktopComputer")){
	computerList.add(new DesktopComputer("Dell","2k18","black","3GHz",3500.00,2));
}	
	else if(type.equals("LaptopComputer")){
	computerList.add(new LaptopComputer("Dell","2k18","black","3GHz",3500.00,"frony and back",10,1));
}
	else{
	System.out.println("Invalid Type");
	}

	for (int i = 0 ; i < computerList.size() ; i++){	
	Computer1 c = computerList.get(i);
	c.displayData();
}
}
}
