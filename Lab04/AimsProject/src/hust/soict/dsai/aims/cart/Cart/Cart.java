package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private ArrayList<Media> itemsOrdered = new ArrayList<>();
	
	private int qtyOrdered = 0;
	
	public void addMedia(Media media) {
		if (getQtyOrdered() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		getItemsOrdered().add(media);
		System.out.println("The media has been added");
	}
	
	public void addMedia(ArrayList<Media> itemsOrdered) {
		for (Media media : itemsOrdered) {
			addMedia(media);
		}
	}

	public void addMedia(Media media1, Media media2) {
		addMedia(media1);
		addMedia(media2);
	}
	
	
	public void removeMedia(Media media) {
        boolean removed = getItemsOrdered().remove(media);
        if (removed) {
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media was not found in the cart");
        }
    }
	
	public float totalCost() {
	    float totalCost = 0;
	    for (Media media : getItemsOrdered()) {
	        totalCost += media.getCost();
	    }
	    return totalCost;
	}



	public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (Media media : getItemsOrdered()) {
            System.out.println(count + ". " + media.toString() + ": " + media.getCost() + " $");
            count++;
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

	public void searchByID(int id) {
        boolean found = false;
        for (Media media : getItemsOrdered()) {
            if (media.getId() == id) {
                System.out.println("Found media with ID " + id + ": " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with ID " + id);
        }
    }

	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media : getItemsOrdered()) {
            if (media.isMatch(title)) {
                System.out.println("Found media with title '" + title + "': " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title '" + title + "'");
        }
	}

	public Media search(String title) {
	    for (Media media : getItemsOrdered()) {
	        if (media.getTitle().equalsIgnoreCase(title)) {
	            return media;
	        }
	    }
	    return null; // Media not found
	}

	public boolean isEmpty() {
	    return getItemsOrdered().isEmpty();
	}

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
}
