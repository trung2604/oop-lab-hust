package hust.soict.itep.aims.cart;
//Do Dinh Trung - 20226128
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.itep.aims.media.Media;
public class Cart {
	//Do Dinh Trung 20226128
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    //Method addMedia DoDinhTrung-20226128
	public void addMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot add null media to the cart.");
            return;
        }
        if (itemsOrdered.contains(media)) {
            System.out.println(media.getTitle() + " is already in the cart.");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        }
    }
    // Method removeMedia DoDinhTrung-20226128
    public void removeMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot remove null media from the cart.");
            return;
        }
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }
    //Method totalCost DoDinhTrung-20226128
    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
 // Method print cart DoDinhTrung-20226128
    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("================================================\n");
        System.out.println(output);
    }
    // Method searchById DoDinhTrung-20226128
    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }
    // Method searchByTitle DoDinhTrung-20226128
    public void searchByTitle(String title) {
        // Duyệt qua các item trong giỏ hàng và so sánh với tiêu đề đã nhập
        for (Media item : itemsOrdered) {
            if (item.getTitle().equalsIgnoreCase(title.trim())) {  // Loại bỏ khoảng trắng thừa trước khi so sánh
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] - " + item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }

    // Method findMedia DoDinhTrung-20226128
    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }
    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }
    // Method sortByTitleCost DoDinhTrung-20226128
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }
    // Method sortByCostTitle DoDinhTrung-20226128
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }
}
