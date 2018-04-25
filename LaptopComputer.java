public class LaptopComputer extends Computer1{
	/*protected String companyName;
	protected String model;
	protected String color;
	protected String processorType;
	protected double price;
*/

	protected String camera;
	protected double size;	
	protected double weight;	

	public LaptopComputer(){}
	public LaptopComputer(String companyName , String model , String color , String processorType , double price , String camera , double size , double weight){
	super(companyName,model,color,processorType,price);
	this.companyName = companyName;
	this.model=model;	
	this.color =color;
	this.processorType = processorType;
	this.price = price;	
	this.camera = camera;
	this.size = size;	
	this.weight = weight;	
}
	//overriding
	public void displayData(){
	System.out.println(companyName+" " + model + " " + color+" "+ processorType+" "+" "+price+ " " + camera+" " +" "+size + " "+weight);
}



}
