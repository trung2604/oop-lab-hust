package hust.soict.itep.aims.store;

import hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Store  {
	//Do Dinh Trung 20226128
    public static final int MAX_NUMBERS_Items = 20;
    private DigitalVideoDisc items[] = new DigitalVideoDisc[MAX_NUMBERS_Items];
    private int qtyStore = 0; 
    //Do Dinh Trung - 20226128 additem
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyStore < MAX_NUMBERS_Items) {
            items[qtyStore] = disc;
            qtyStore++;
            System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() +" has been added.");
        } else {
            System.out.println("DoDinhTrung-20226128-The cart is full! Cannot add more discs.");
        }
    }
    // Do Dinh Trung - 20226128 removeitem
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyStore; i++) {
            if (items[i].equals(disc)) { 
                for (int j = i; j < qtyStore - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[qtyStore - 1] = null; 
                qtyStore--; 
                System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DoDinhTrung-20226128-Disc not found in cart.");
    }
}
