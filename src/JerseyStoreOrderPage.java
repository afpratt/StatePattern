
public class JerseyStoreOrderPage {

	public static void main(String[] args) {
		JerseyStore jerseyStore = new JerseyStore(3);
		
		System.out.println(jerseyStore);
		
		jerseyStore.enterPaymentInformation();
		jerseyStore.placeOrder();
		
		System.out.println(jerseyStore);
		
		jerseyStore.enterPaymentInformation();
		jerseyStore.placeOrder();
		
		System.out.println(jerseyStore);
		
		jerseyStore.restock(15);
		
		jerseyStore.enterPaymentInformation();
		jerseyStore.removePaymentInformation();
		
		System.out.println(jerseyStore);
	}

}
