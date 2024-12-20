package hust.soict.itep.aims.cart;
//DoDinhTrung - 20226128
import java.util.ArrayList;
import javax.naming.LimitExceededException;
import java.util.Collections;

import hust.soict.itep.aims.media.Media;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	public void addMedia(Media media) throws LimitExceededException {
		if ((itemsOrdered.size()) >= MAX_ORDERED) {
			throw new LimitExceededException("Full");
		}
		else if (itemsOrdered.contains(media)) {
			System.out.println("Media already exists");
		}

		else {
			itemsOrdered.add(media);
			System.out.println("Added");
			}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Removed");
		}
		else {
			System.out.println("Media does not exist");
		}
	}
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}	
		return totalCost;
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	 public void print() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (Media media : itemsOrdered) {
			 System.out.println(media.toString());
			}		 
		 System.out.println("Total cost: " + totalCost());
	 }
	 
	 public void sortByCostTitle() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	 }
	 public void sortByTitleCost() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	 }
	 
	 public void SearchById(int id) {
		 boolean found = false;
		 for (Media media : itemsOrdered) {
			 if (media == null) {
				 break;
			 }
			 else if (media.getId() == id) {
				 System.out.println("found: " + media.toString());
				 found = true;
				 break;
			 } 
		 }
		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }	
	 
	 public void SearchByTitle(String title) {
		 boolean found = false;
		 String lowercaseTitle = title.toLowerCase();
		 for (Media media : itemsOrdered) {
			 if (media == null) {
				 break;
			 }
			 String[] keywords = lowercaseTitle.split(" ");
			 String lowercaseDVDTitle = media.getTitle().toLowerCase();
			 for (String keyword : keywords) {
			        if (lowercaseDVDTitle.contains(keyword)) {
			            found = true;
			            System.out.println("found: " + media.toString());
			            break;
			        }
			    }
		 }

		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }

	public void emptyCart() {
		itemsOrdered.clear();
	}

	public Media findMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
}