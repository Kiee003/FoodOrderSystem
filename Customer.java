package foodOrderSystem;

public abstract class Customer {
protected	String CustName;
protected	String CustNum;
protected   String CustNo;
protected   String PaymentMethod;
double foodPrice,drinkPrice;

	
public Customer(String cName,String cNum,String cNo,String PM) {
		CustName = cName;
		CustNum = cNum;
		CustNo = cNo;
		PaymentMethod = PM;
	}
	public abstract String toString();
	public abstract double calcTotal(double totalPrice);
}

class CustomerMember extends Customer{
	private final boolean cMember;
	private final double mDiscount =0.03;
	private double sCharge = 1.06;
	public CustomerMember(String cName,String cNum,String cNo,String PM,boolean member) {
	super(cName,cNum,cNo,PM);
	cMember = member;
	}
	public double calcTotal(double totalPrice) {
		double calcTotal = (totalPrice*sCharge)-(totalPrice*mDiscount);
	    return calcTotal;
	}
	public String toString() {
		return "VIP Customer"+"\nName: "+CustName+"\nPhone Number: "+CustNum+"\nNumber of guest:"+CustNo+"\nPaying with: "+PaymentMethod+"\nTotal Payment: RM";
	}
	
}
class CustomerRegular extends Customer{
	private final double sCharge = 1.06;
	public CustomerRegular(String cName,String cNum,String cNo,String PM) {
		super(cName,cNum,cNo,PM);
		
		}
	public double calcTotal(double totalPrice) {
		double calcTotal = (totalPrice*sCharge);
	    return calcTotal;
	}
	public String toString() {
		return "Regular Customer"+"\nName: "+CustName+"\nPhone Number: "+CustNum+"\nNumber of guest:"+CustNo+"\nPaying with: "+PaymentMethod+"\nTotal Payment: RM";
	}
}

class CustomerTakeAway extends Customer {
	public CustomerTakeAway(String cName,String cNum,String cNo,String PM) {
		super(cName,cNum,cNo,PM);
		
		}
	public double calcTotal(double totalPrice) {
		double calcTotal =totalPrice;
	    return calcTotal;
	}
	public String toString() {
		return"Take-Away Customer"+ "\nName: "+CustName+"\nPhone Number: "+CustNum+"\nNumber of guest:"+CustNo+"\nPaying with: "+PaymentMethod+"\nTotal Payment: RM";
	}
	}

