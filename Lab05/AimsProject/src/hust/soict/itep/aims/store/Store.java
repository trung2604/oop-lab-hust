package hust.soict.itep.aims.store;
//Do Dinh Trung - 20226128
import java.util.ArrayList;

import hust.soict.itep.aims.media.Book;
import hust.soict.itep.aims.media.CompactDisc;
import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.media.Media;
import hust.soict.itep.aims.media.Track;

public class Store  {
	//Do Dinh Trung 20226128
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public ArrayList<Media> getItemsInStore() { return itemsInStore; }
	//Method addMedia DoDinhTrung-20226128
	public void addMedia(Media media) {
	    if (media == null) {
	        System.out.println("Cannot add null media to the store.");
	        return;
	    }
	    // Kiểm tra trùng lặp theo title hoặc id của media (CompactDisc)
	    for (Media item : itemsInStore) {
	        if (item.getTitle().equals(media.getTitle()) || item.getId() == media.getId()) {
	            System.out.println(media.getTitle() + " is already in the store.");
	            return;
	        }
	    }
	    itemsInStore.add(media);
	    System.out.println(media.getTitle() + " has been added to the store.");
	}


    // Method removeMedia DoDinhTrung-20226128
    public void removeMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot remove null media from the store.");
            return;
        }
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not in the store.");
        }
    }
    
 // Method findMedia DoDinhTrung-20226128
 	public Media findMedia(String title) {
 	        for (Media item : itemsInStore) {
 	            if (item.getTitle().equals(title)) {
 	                return item;
 	            }
 	        }
 	        return null;
 	    }
    
 // Method to show items in store DoDinhTrung-20226128
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n**********STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no item in store!\n");
        else {
            for (Media item : itemsInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("*********************************\n");
        return string.toString();
    }
    
    public Store() {
    	ArrayList<Track> tracks1 = new ArrayList<>();
        tracks1.add(new Track("Track 1", 4));
        tracks1.add(new Track("Track 2", 5));

        ArrayList<Track> tracks2 = new ArrayList<>();
        tracks2.add(new Track("Track A", 3));
        tracks2.add(new Track("Track B", 6));

        ArrayList<Track> tracks3 = new ArrayList<>();
        tracks3.add(new Track("Song 1", 4));
        tracks3.add(new Track("Song 2", 5));
        tracks3.add(new Track("Song 3", 6));

        // Thêm các phần tử vào danh sách itemsOrdered
        
    	itemsInStore.add(new DigitalVideoDisc(2, "Inception", "Sci-Fi", 19.95f, 148, "Christopher Nolan"));
        itemsInStore.add(new CompactDisc(3, "Hahaa", "Music", 15.95f, "Michael Jackson", tracks1));
        itemsInStore.add(new Book(1, "C Programming", "Education", 29.95f));
        itemsInStore.add(new DigitalVideoDisc(2, "Inono", "Sci-Fi", 19.95f, 148, "Christopher Nolan"));
        itemsInStore.add(new CompactDisc(3, "Huhu3", "Music", 15.95f, "Michael Jackson", tracks2));
        itemsInStore.add(new CompactDisc(3, "Huhu2", "Music", 15.95f, "Michael Jackson", tracks3));
        itemsInStore.add(new Book(1, "Java Programming", "Education", 29.95f));

        // Ví dụ thêm các CompactDisc khác với danh sách tracks khác nhau
        itemsInStore.add(new CompactDisc(3, "Huhu1", "Music", 15.95f, "Michael Jackson", tracks1));
        itemsInStore.add(new CompactDisc(3, "Huhu7", "Music", 15.95f, "Michael Jackson", tracks2));
        itemsInStore.add(new CompactDisc(3, "Huhu9", "Music", 15.95f, "Michael Jackson", tracks3));
    	
    }
}
