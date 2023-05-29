package hust.soict.dsai.aims.media.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;

public class MediaSorter {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
        CompactDisc cd1 = new CompactDisc("Born Pink", "Music", "Director 1", 60, 19.99f, "Artist 1");
        CompactDisc cd2 = new CompactDisc("Royals", "Music", "Director 2", 80, 24.99f, "Artist 2");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Material", "Movie", "Director 3", 120, 9.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Girl", "Movie", "Director 4", 90, 14.99f);
        List<String> bookAuthors = new ArrayList<String>();
        bookAuthors.add("Andersen1");
        bookAuthors.add("Andersen2");
        Book book = new Book(1, "Andersen", "Children", 19.99f, bookAuthors);

        mediaList.add(cd1);
        mediaList.add(cd2);
        mediaList.add(dvd1);
        mediaList.add(dvd2);
        mediaList.add(book);


        // Sort by title then cost
        Collections.sort(mediaList, new MediaComparatorByTitleCost());

        // Print the sorted list
        System.out.println("Sorted by Title then Cost:");
        for (Media media : mediaList) {
            System.out.println(media);
        }

        // Sort by cost then title
        Collections.sort(mediaList, new MediaComparatorByCostTitle());

        // Print the sorted list
        System.out.println("Sorted by Cost then Title:");
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}

