package hust.soict.itep.aims.store;
//Do Dinh Trung - 20226128
import java.util.ArrayList;
import hust.soict.itep.aims.media.Media;

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
        if (itemsInStore.contains(media)) {
            System.out.println(media.getTitle() + " is already in the store.");
        } else {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        }
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
}
