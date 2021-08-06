package corejava;

import oops.AbstractTest;

public class ExtendClass extends AbstractTest{

	public static void main(String[] args) {
		
		ExtendClass ec = new ExtendClass();
		ec.AddCart();
		ec.ApplyCoupon();
		// TODO Auto-generated method stub

	}
// hiding implementation details from user
	@Override
	public void PaymentGteway() {
		System.out.println("Added card details");		
	}

}
