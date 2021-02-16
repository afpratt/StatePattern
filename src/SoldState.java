
public class SoldState implements State {
	JerseyStore jerseyStore;
	
	public SoldState(JerseyStore jerseyStore) {
		this.jerseyStore = jerseyStore;
	}
	
	public void enterPaymentInformation() {
		System.out.println("Payment information has been entered.");
	}
	
	public void removePaymentInformation() {
		System.out.println("You can no longer change or remove your payment information.");
	}
	
	public void placeOrder() {
		System.out.println("Your order is being processed.");
	}
	
	public void shipOrder() {
		jerseyStore.releaseJersey();
		if (jerseyStore.getCount() > 0) {
			jerseyStore.setState(jerseyStore.getNoPaymentInformationState());
		}
		else {
			System.out.println("This jersey is currently out of stock.");
			jerseyStore.setState(jerseyStore.getOutOfStockState());
		}
	}
	
	public void restockJerseys() {	
	}
	
	public String toString() {
		return "Your order will ship in 1-2 business days";
	}
}
