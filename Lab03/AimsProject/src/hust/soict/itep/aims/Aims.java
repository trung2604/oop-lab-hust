package hust.soict.itep.aims;

import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Aims {
	//Do Dinh Trung 20226128
    public static void main(String[] args) {
        //Create a new cart
    	Cart anOrder = new Cart();
    	
    	//Create new dvd objects and add them to the cart
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
    	// add 2 dvd to the cart
    	anOrder.addDigitalVideoDisc(dvd1, dvd2);
    	// print id of dvd and number of dvd
    	System.out.println("DoDinhTrung-20226128 Id of DVD " + dvd1.getTitle() + " is " + dvd1.getId());
    	System.out.println("DoDinhTrung-20226128 Id of DVD " + dvd2.getTitle() + " is " + dvd2.getId());
    	System.out.println("DoDinhTrung-20226128 Number of DVD: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    	//print total cost of the items in the cart
    	System.out.println("DoDinhTrung-20226128-Total Cost is: ");
    	System.out.println(anOrder.totalCost());
    }
}
