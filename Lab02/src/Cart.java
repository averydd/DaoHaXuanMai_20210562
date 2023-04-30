package aimsproject;
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsOrdered[qtyOrdered++] = disc;
		System.out.println("The disc has been added");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int removedIndex = -1;
		for (int i = 0; i < qtyOrdered; ++i) {
			if (itemsOrdered[i] == disc) {
				removedIndex = i;
			}
		}
		if (removedIndex == -1) {
			return;
		}
		System.out.println("The disc " + (removedIndex + 1) + " has been removed");
		for (int i = removedIndex; i < qtyOrdered; ++i) {
			itemsOrdered[i]= itemsOrdered[i + 1]; 
		}
	}
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
}