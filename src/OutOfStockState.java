
public class OutOfStockState implements State {
	JerseyStore jerseyStore;
	
	public OutOfStockState(JerseyStore jerseyStore) {
		this.jerseyStore = jerseyStore;
	}
	
	public void enterPaymentInformation() {
		System.out.println("Sorry, this jersey is currently out of stock.");
	}
	
	public void removePaymentInformation() {
		System.out.println("No payment information has been entered.");
	}
	
	public void placeOrder() {
		System.out.println("Please wait until this jersey is back in stock to place your order.");
	}
	
	public void shipOrder() {
		System.out.println("There is nothing to ship.");
	}
	
	public void restockJerseys() {
		jerseyStore.setState(jerseyStore.getNoPaymentInformationState());
	}
	
	public String toString() {
		return "This jersey is out of stock.";
	}
}
