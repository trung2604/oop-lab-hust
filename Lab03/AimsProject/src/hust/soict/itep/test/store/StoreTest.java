package hust.soict.itep.test.store;

import hust.soict.itep.aims.disc.DigitalVideoDisc;
import hust.soict.itep.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		//Create new dvd
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		//method add
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		
		//method remove
		store.removeDigitalVideoDisc(dvd3);
		store.removeDigitalVideoDisc(dvd2);
	}
}
