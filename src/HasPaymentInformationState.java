
public class HasPaymentInformationState implements State {
JerseyStore jerseyStore;
	
	public HasPaymentInformationState(JerseyStore jerseyStore) {
		this.jerseyStore = jerseyStore;
	}
	
	public void enterPaymentInformation() {
		System.out.println("Payment information has already been entered.");
	}
	
	public void removePaymentInformation() {
		System.out.println("Payment information removed.");
		jerseyStore.setState(jerseyStore.getNoPaymentInformationState());
	}
	
	public void placeOrder() {
		System.out.println("Your order has been placed.");
		jerseyStore.setState(jerseyStore.getSoldState());
	}
	
	public void shipOrder() {
		System.out.println("Your order has not yet shipped.");
	}
	
	public void restockJerseys() {	
	}
	
	public String toString() {
		return "Waiting for you to place your order.";
	}
}
