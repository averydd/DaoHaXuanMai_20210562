package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media added to the store: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        boolean removed = itemsInStore.remove(media);
        if (removed) {
            System.out.println("Media removed from the store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    public void showItemsInStore() {
        System.out.println("Items in the store:");

        if (itemsInStore.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (Media media : itemsInStore) {
                System.out.println(media.getTitle() + " - $" + media.getCost());
            }
        }
    }
    
    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
}
