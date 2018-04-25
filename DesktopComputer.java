public class DesktopComputer extends Computer1{

/*	protected String companyName;
	protected String model;
	protected String color;
	protected String processorType;
	protected double price;*/

	protected double dimensions;

	public DesktopComputer(){}
	public DesktopComputer(String companyName , String model , String color , String processorType , double price , double dimensions){
	super(companyName,model,color,processorType,price);	
	this.companyName = companyName;
	this.model=model;	
	this.color =color;
	this.processorType = processorType;
	this.price = price;	
	this.dimensions = dimensions;
}
	//overriding
	public void displayData(){
	System.out.println(companyName+" " + model + " " + color+" "+ processorType+" "+" "+price+ " " +dimensions);
}
	


}
