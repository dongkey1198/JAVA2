package inheritenceQuestion;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	VIPCustomer(String customerName, int agentID) {
		super(customerName);
		this.agentID = agentID;
		customerID = serialNumber++;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = price -(int)(price*salesRatio);
	}



	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
