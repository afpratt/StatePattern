
public class NoPaymentInformationState implements State {
	JerseyStore jerseyStore;
	
	public NoPaymentInformationState(JerseyStore jerseyStore) {
		this.jerseyStore = jerseyStore;
	}
	
	public void enterPaymentInformation() {
		System.out.println("Payment information has been entered.");
		jerseyStore.setState(jerseyStore.getHasPaymentInformationState());
	}
	
	public void removePaymentInformation() {
		System.out.println("No payment information has been entered.");
	}
	
	public void placeOrder() {
		System.out.println("You must enter payment information to place this order.");
	}
	
	public void shipOrder() {
		System.out.println("We cannot ship order until you have paid.");
	}
	
	public void restockJerseys() {	
	}
	
	public String toString() {
		return "Payment information needed.";
	}
}
