package foodOrderSystem;

public class Menu {
protected String FADName,code;
protected  char size;
protected  double price;
protected  int quantity;

public Menu(String FADN, String c, char s, double p, int q ) {
	FADName = FADN;
	code = c;
	size = s;
	price = p;
	quantity= q;
}
public String getFADName() {
	return FADName;
}
public String getCode() {
	return code;
}
public char getSize() {
	return size;
}
public double getPrice() {
	return price;
}
public int getQuantity() {
	return quantity;
}


public void setNewOrder(String newCode,char newSize) {
	code = newCode;
	size = newSize;
	
	if(code.equalsIgnoreCase("F0")) {
		FADName ="Burger";
	
	if(size=='S') {
		price= 2.00;}
	
	if(size=='M') {
		price=5.00;}
	
	if(size=='L') {
		price=8.00;}
	}
	
	else if(code.equalsIgnoreCase("F1")) {
		FADName ="Sandwich";
	
	if(size=='S') {
		price= 2.00;}
	
	if(size=='M') {
		price=5.00;}
	
	if(size=='L') {
		price=8.00;}
	}
	
	else if(code.equalsIgnoreCase("F2")) {
		FADName ="Steak";
	
	if(size=='S') { 
		price= 5.00;}
	
	if(size=='M') {
		price=6.00;}
	
	if(size=='L') {
		price=9.00;}
	}
	
	else if(code.equalsIgnoreCase("F3")) {
		FADName ="Chicken Chop";
	
	if(size=='S') {
		price = 5.00;}
	
	if(size=='M') {
		price=6.00;}
	
	if(size=='L') {
		price=9.00;}
	}
	
	else if(code.equalsIgnoreCase("F4")) {
		FADName ="Lamb Chop";
	
	if(size=='S') {
		price = 5.00;}
	
	if(size=='M') {
		price=6.00;}
	
	if(size=='L') {
		price=9.00;}
	}
	
	//drink
	else if(code.equalsIgnoreCase("D0")) {
			FADName ="Orange";
		
		if(size=='S') {
			price = 2.00;}
		
		if(size=='M') {
			price=4.00;}
		}
		
		else if(code.equalsIgnoreCase("D1")) {
			FADName ="Sprite";
		
		if(size=='S') {
			price = 1.10;}
		
		if(size=='M') {
			price=3.00;}
		}
		
		else if(code.equalsIgnoreCase("D2")) {
			FADName ="Coca-Cola";
		
		if(size=='S') {
			price = 1.10;}
		
		if(size=='M') {
			price=3.00;}
		}
		
		else if(code.equalsIgnoreCase("D3")) {
			FADName ="Clear Water";
		
		if(size=='S') {
			price = 1.00;}
		
		if(size=='M') {
			price=1.00;}
		}
		
		else if(code.equalsIgnoreCase("D4")) {
			FADName ="Coconut Shake";
		
		if(size=='S') {
			price= 2.00;}
		
		if(size=='M') {
			price=4.00;}
		}
		
	else {
		System.out.println("Invalid Code Entered, Please restart the machine");
		System.exit(1);
}

}


public void setQuantity(int newQuantity) {
	quantity = newQuantity;
}

public double calculatePrice() {
 double calcPrice= quantity*price;
 return calcPrice;
}




public String toString() {
	return " Code:"+code +"| Order Name:"+ FADName + "| Size:"+ size + "|  Quantity:" + quantity+ "| Price each:"+price;
}
}


class Food extends Menu{
	private double sideDish;

	public Food(String FADN, String c, char s, double p, int q, double sD) {
		super(FADN,c,s,p,q);
		sideDish = sD;
	}
	public double calculatePrice(){
		double foodPrice = (super.calculatePrice()) + sideDish;
		return foodPrice;
	}
	public String toString() {
		return super.toString() + "\n  (Price*Quantity)+SideDish:("+price+"*"+quantity+")+"+ sideDish+" = RM"+calculatePrice();
	}
	
}	

class Drink extends Menu{
	private double waterTemperature;
	
	public Drink(String FADN, String c, char s, double p, int q, double wT ) {
		super(FADN,c,s,p,q);
		waterTemperature = wT;
}
	
	public double calculatePrice(){
		double drinkPrice = (super.calculatePrice()) + waterTemperature;
		return drinkPrice;
	}
	public String toString() {
		return super.toString()+"\n  (Price*Quantity)+Ice:("+price+"*"+quantity+")+"+ waterTemperature+" = RM"+calculatePrice();	
		}
		
	
}
