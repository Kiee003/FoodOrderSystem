package foodOrderSystem;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Are you ready to order?(Y/N)");
		String A = scan.nextLine();
		char answer = A.charAt(0);
		
		if(answer=='N') {
			System.out.println("Come back when you're ready :D");
			System.exit(answer); }
		
		else if(answer=='Y') {
			System.out.println("Welcome to Restaurant XXX Automated Ordering Machine");
		}
		System.out.println("             RESTAURANT XXX MENU          ");
		System.out.println("|Code|      Name      |         Size  & Price");
		System.out.println("| F0 |    Burger      | S:RM2.00|M:RM5.00|L:RM8.00");
		System.out.println("| F1 |    Sandwich    | S:RM2.00|M:RM5.00|L:RM8.00");
		System.out.println("| F2 |     Steak      | S:RM5.00|M:RM6.00|L:RM9.00");
		System.out.println("| F3 |  Chicken Chop  | S:RM5.00|M:RM6.00|L:RM9.00");
		System.out.println("| F4 |   Lamb Chop    | S:RM5.00|M:RM6.00|L:RM9.00");
		System.out.println("| D0 |    Orange      | S:RM2.00|M:RM4.00|L:N/A");
		System.out.println("| D1 |    Sprite      | S:RM1.10|M:RM3.00|L:N/A");
		System.out.println("| D2 |  Coca-Cola     | S:RM1.10|M:RM3.00|L:N/A");
		System.out.println("| D3 |  Clear Water   | S:RM1.00|M:RM1.00|L:N/A");
		System.out.println("| D4 | Coconut Shake  | S:RM2.00|M:RM4.00|L:N/A");
		System.out.println("|******Indication: S=Small/M=Medium/L=Large*******");
		
		System.out.println("\n Hello and a Good Day to you, how much order are you going to make today?");
		int answer1 = scan.nextInt();
		scan.nextLine();
		
		Menu[] Order = new Menu[answer1];
			String FADN="";
		double p=0.0;
		double sD=0.0,wT=0.0;
		char answerF,answerD,s;
		String size;
		int q;
		for(int i=0;i<Order.length;i++) {
		
		System.out.println("Please pick a food code or drink code on the menu");
	    String c = scan.nextLine();
		System.out.println("Please pick the desired size");
		size = scan.nextLine();
		s = size.charAt(0);
		
		if(s!='S'&& s!='M' && s!='L') {
			System.out.println("Invalid Size, Please Restart the machine");
			System.exit(1);
		}
		System.out.println("State the desired quantity");
		q = scan.nextInt();
		scan.nextLine();
		
	
		
		if(c.charAt(0)==('F')) {
			System.out.println("Would you like to add a side dish for RM1.00(Y-Yes,N-No)");
			A = scan.nextLine();
			answerF = A.charAt(0);
			if(answerF=='Y')
			  sD = 1.00;
			if(c.equalsIgnoreCase("F0")) {
				FADN ="Burger";
			if(s=='S')
				p = 2.00;
			if(s=='M')
				p=5.00;
			if(s=='L')
				p=8.00;}
			
			else if(c.equalsIgnoreCase("F1")) {
				FADN ="Sandwich";
			if(s=='S')
				p = 2.00;
			if(s=='M')
				p=5.00;
			if(s=='L')
				p=8.00;}
			
			else if(c.equalsIgnoreCase("F2")) {
				FADN ="Steak";
			if(s=='S') 
				p = 5.00;
			if(s=='M') 
				p=6.00;
			if(s=='L') 
				p=9.00;}
			
			else if(c.equalsIgnoreCase("F3")) {
				FADN ="Chicken Chop";
			if(s=='S')
				p = 5.00;
			if(s=='M')
				p=6.00;
			if(s=='L')
				p=9.00;}
			
			else if(c.equalsIgnoreCase("F4")) {
				FADN ="Lamb Chop";
			if(s=='S')
				p = 5.00;
			if(s=='M')
				p=6.00;
			if(s=='L')
				p=9.00;}
			else {
				System.out.println("Invalid Code Entered, Please restart the machine");
				System.exit(1);
		}
			
			Order[i] = new Food(FADN,c,s,p,q,sD);
			
		}
		
		else if(c.charAt(0)=='D') {
			System.out.println("Would you also like to add ice in your drink(Y-Yes,N-No)");
			A = scan.nextLine();
			answerD = A.charAt(0);
			if(answerD=='Y')
			  wT = 0.50;
			
			 if(c.equalsIgnoreCase("D0")) {
					FADN ="Orange";
				if(s=='S')
					p = 2.00;
				if(s=='M')
					p=4.00;}
				
				else if(c.equalsIgnoreCase("D1")) {
					FADN ="Sprite";
				if(s=='S')
					p = 1.10;
				if(s=='M')
					p=3.00;}
				
				else if(c.equalsIgnoreCase("D2")) {
					FADN ="Coca-Cola";
				if(s=='S')
					p = 1.10;
				if(s=='M')
					p=3.00;}
				
				else if(c.equalsIgnoreCase("D3")) {
					FADN ="Clear Water";
				if(s=='S')
					p = 1.00;
				if(s=='M')
					p=1.00;}
				
				else if(c.equalsIgnoreCase("D4")) {
					FADN ="Coconut Shake";
				if(s=='S')
					p = 2.00;
				if(s=='M')
					p=4.00;}
				else {
					System.out.println("Invalid Code Entered, Please restart the machine");
					System.exit(1);
				}
			Order[i] = new Drink(FADN,c,s,p,q,wT);
		}
		
		
		
		}
		double totalPrice = 0.0;
		for(int i=0;i<Order.length;i++) {
			
			System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
			totalPrice = totalPrice + Order[i].calculatePrice();
		}
		System.out.println("\nTotal Price: RM"+totalPrice);
		
		System.out.println("\n**Would you like to edit or continue with your order?**");
		
		System.out.println("**If you would like to edit your order, input the order number**");
		System.out.println("**If you would like to continue with your order, input (-1)**");
		int i = scan.nextInt();
		scan.nextLine();
		
		while(i!= -1) {	
			
				System.out.println("Enter new code");
				String c = scan.nextLine();
				
				System.out.println("Enter new size");
				size = scan.nextLine();
				s= size.charAt(0);
				
				System.out.println("Enter new quantity");
				q =scan.nextInt();
				scan.nextLine();
				Order[i].setQuantity(q);
				Order[i].setNewOrder(c,s);
				FADN = Order[i].getFADName();
				p = Order[i].getPrice();
				
				//to change object to food construct from drink
				if(Order[i].getCode().charAt(0)=='D') {
					System.out.println("Would you like your drinks to have ice?, for 50 sen(Y-Yes,N-No)");
				A = scan.nextLine();
				answerD = A.charAt(0);
				if(answerD=='Y')
				  wT = 0.50;
				
				if(Order[i]instanceof Food) {
				Order[i] = new Drink(FADN,c,s,p,q,wT);
				}
				}
				
				//to change object to drink construct from food
				else if(Order[i].getCode().charAt(0)=='F') {
					System.out.println("Would you like a side dish with that?, for RM1.00(Y-Yes,N-No)");
				A = scan.nextLine();
				answerF = A.charAt(0);
				if(answerF=='Y')
				  sD = 1.00;
				
				if(Order[i]instanceof Drink) {
				Order[i] = new Food(FADN,c,s,p,q,sD);
				}
				}
				//if the new code is the same type as the original the above if else is unnecessary and not used.
		
				for(i=0;i<Order.length;i++) {
					
					System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
					totalPrice = totalPrice + Order[i].calculatePrice();
				}
				
				System.out.println("**If you would like to edit your order, input the order number**");
				System.out.println("**If you would like to continue with your order, input (-1)**");
				i = scan.nextInt();
				scan.nextLine();
		}
		//class customer time
		System.out.println("Enter your name:");
		String cName = scan.nextLine();
		
		System.out.println("Enter your phone number:");
		String cNum = scan.nextLine();
		
		System.out.println("Enter nombor of guest");
		String cNo= scan.nextLine();
		
		System.out.println("How would you like to pay?(E-Wallet,Cash,CreditCard)");
		String PM=scan.nextLine();
			
		System.out.println("How would you like to take your order?, Input number 1-Take-away or 2-Dine-in");
		int orderStatus =scan.nextInt();
		
		if(orderStatus==2) {
			System.out.println("Are you a member?(true/false)");
			boolean member = scan.nextBoolean();
			scan.nextLine();
			if(member) {

				for(i=0;i<Order.length;i++) {
					
					System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
					
				}
				System.out.println("\nTotal Price: RM"+totalPrice);
				Customer customer = new CustomerMember(cName,cNum,cNo,PM,member);
				
				System.out.println(customer.toString()+df.format(customer.calcTotal(totalPrice)));
			}
			
			else if(!member) {
				System.out.println("Would you like to become a member for RM 3?, and experience 3% discount for all of your next purchases!(Yes/No)");
			    String answerM = scan.nextLine();
			   if(answerM.equalsIgnoreCase("Yes")) {
					member=true;
				double	newMember = 3.00;
				
				Customer customer = new CustomerMember(cName,cNum,cNo,PM,member);
				
				for(i=0;i<Order.length;i++) {
					
					System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
					
				}
				System.out.println("\nTotal Price: RM"+totalPrice);
				System.out.println(customer.toString()+"+New member charge:"+df.format(customer.calcTotal(totalPrice)+newMember));
			
				}
				else if(answerM.equalsIgnoreCase("No")) {
					Customer customer = new CustomerRegular(cName,cNum,cNo,PM);
					
					for(i=0;i<Order.length;i++) {
						
						System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
						
						
					}
					System.out.println("\nTotal Price: RM"+totalPrice);
					System.out.println(customer.toString()+df.format(customer.calcTotal(totalPrice)));
				}
					
				}
		}
			else if(orderStatus==1) {
				Customer customer = new CustomerTakeAway(cName,cNum,cNo,PM);
				for(i=0;i<Order.length;i++) {
					
					System.out.println("Order Number:"+ i +"\n"+Order[i].toString());
					
					
				}
				System.out.println("\nTotal Price: RM"+totalPrice);
				System.out.println(customer.toString()+df.format(customer.calcTotal(totalPrice)));
				
			}
		System.out.println("*****************************RECEIPT******************************");
	}
	
}
