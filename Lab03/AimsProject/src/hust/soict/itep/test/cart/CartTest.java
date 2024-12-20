package hust.soict.itep.test.cart;

import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.disc.DigitalVideoDisc;

//DoDinhTrung-20226128
public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Test the print method
		cart.print();
		// Test the search method
		System.out.println("\nSearch By Id:");
		cart.searchById(1);
		cart.searchById(5);
		
		// Test the search by title
		System.out.println("\nSearch By Title");
		cart.searchByTitle("Aladin");
		cart.searchByTitle("Trung");
	}
}
