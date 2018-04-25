public class Computer1{
	protected String companyName;
	protected String model;
	protected String color;
	protected String processorType;
	protected double price;

	public Computer1(){}
	public Computer1(String companyName , String model , String color , String processorType , double price){
	this.companyName = companyName;
	this.model=model;	
	this.color =color;
	this.processorType = processorType;
	this.price = price;	
}

	public void displayData(){
	System.out.println(companyName+" " + model + " " + color+" "+ processorType+" "+" "+price);
}



}
