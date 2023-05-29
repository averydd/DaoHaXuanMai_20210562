package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list of tracks.");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track does not exist in the list of tracks.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Total Length: " + getLength() + " minutes");

        for (Track track : tracks) {
            System.out.println("Track: " + track.getTitle());
            track.play();
        }
    }
    
    @Override
    public String toString() {
        return "CompactDisc - Title: " + getTitle() +
                " - Category: " + getCategory() +
                " - Director: " + getDirector() +
                " - Length: " + getLength() +
                " - Cost: " + getCost() +
                " - Artist: " + getArtist();
    }

}
