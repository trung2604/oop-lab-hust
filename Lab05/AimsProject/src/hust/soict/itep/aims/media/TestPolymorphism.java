package hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        List<String> authors = new ArrayList<String>();
        authors.add("To Hoai");
        authors.add("Nguyen Huy Tuong");
        Book book = new Book(2, "Tuoi tre du doi", "Ki su", 6.5f, authors);
        
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("End of the world", 3));
        tracks.add(new Track("Eternal sunshine", 4));
        CompactDisc cd = new CompactDisc(3, "Eternal sunshine", "Pop", 5.5f, "Ariana Grande", tracks);
        
        media.add(dvd);
        media.add(cd);
        media.add(book);
        
        for (Media item : media) {
            System.out.println(item.toString());
        }
    }
}