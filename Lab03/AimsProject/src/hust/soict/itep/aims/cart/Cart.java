package hust.soict.itep.aims.cart;

import hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Cart {
	//Do Dinh Trung 20226128
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() +" has been added.");
        } else {
            System.out.println("DoDinhTrung-20226128-The cart is full! Cannot add more discs.");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    	for(DigitalVideoDisc disc : dvdList) {
    		addDigitalVideoDisc(disc);
    	}
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	addDigitalVideoDisc(dvd1);
    	addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--; 
                System.out.println("DoDinhTrung-20226128-The disc " + disc.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DoDinhTrung-20226128-Disc not found in cart.");
    }

    public float totalCost(){
        float result = 0;
        for(int i = 0; i < qtyOrdered; i++){
            result += itemsOrdered[i].getCost();
        }
        return result;
    }
    
    //DoDinhTrung-20226128
    public void print() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for(int i= 0;i < qtyOrdered;i++) {
    		System.out.println((i+1) + ". " + itemsOrdered[i].toString());
    	}
    	System.out.println("Total cost: " + totalCost());
    	System.out.println("***************************************************");
    }
    
    //DoDinhTrung-20226128
    public void searchById(int Id) {
    	boolean f = false;
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].getId() == Id) {
    			System.out.println("DVD have ID " + Id + ":" + itemsOrdered[i].toString());
    			f = true;
    			break;
    		}
    	}
    	if(!f) {
    		System.out.println("DVD have ID " + Id + " not found");
    	}
    }
    
    //DoDinhTrung-20226128
    public void searchByTitle(String title) {
    	boolean f = false;
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].isMatch(title)) {
    			System.out.println("DVD have title " + title + ":" + itemsOrdered[i].toString());
    			f = true;
    			break;
    		}
    	}
    	if(!f) {
    		System.out.println("DVD have title " + title + " not found");
    	}
    }
}
