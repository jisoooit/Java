package inheritance;

public class GoldCustomer extends Customer{

	public GoldCustomer() {
		bonusRatio=0.05;
	}
	
	//source에서 override구조 쉽게 가져 올 수 있다. 그냥 가져오기만 한 코드다. 
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
}
