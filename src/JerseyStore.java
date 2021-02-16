
public class JerseyStore {
	State outOfStockState;
	State soldState;
	State noPaymentInformationState;
	State hasPaymentInformationState;
	
	State state;
	int count = 0;
	
	public JerseyStore(int numberOfJerseys) {
		outOfStockState = new OutOfStockState(this);
		soldState = new SoldState(this);
		noPaymentInformationState = new NoPaymentInformationState(this);
		hasPaymentInformationState = new HasPaymentInformationState(this);
		
		this.count = numberOfJerseys;
		if (numberOfJerseys > 0) {
			state = noPaymentInformationState;
		}
		else {
			state = outOfStockState;
		}
	}
	
	public void enterPaymentInformation() {
		state.enterPaymentInformation();
	}
	
	public void removePaymentInformation() {
		state.removePaymentInformation();
	}
	
	public void placeOrder() {
		state.placeOrder();
		state.shipOrder();
	}
	
	void releaseJersey() {
		System.out.println("Jersey is being packed in box to ship.");
		if (count > 0) {
			count = count - 1;
		}
	}
	
	int getCount() {
		return count;
	}
	
	void restock(int count) {
		this.count += count;
		System.out.println("This jersey has been restocked. There are now " + this.count + " jersey(s) in stock.");
		state.restockJerseys();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public State getOutOfStockState() {
		return outOfStockState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getNoPaymentInformationState() {
		return noPaymentInformationState;
	}
	
	public State getHasPaymentInformationState() {
		return hasPaymentInformationState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nInventory: " + count + " jersey");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n\n");
		result.append("Current store state is " + state + "\n");
		return result.toString();
	}
}
