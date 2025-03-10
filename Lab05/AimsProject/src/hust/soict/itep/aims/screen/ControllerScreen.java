package hust.soict.itep.aims.screen;
//DoDinhTrung - 20226128
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.store.Store;

public class ControllerScreen {
	public static JFrame storeSreen;
	public static JFrame cartSceen;
	public static JFrame addDVDScreen;
	public static JFrame addBookScreen;
	public static JFrame addCDScreen;
	private Cart cart;
	private Store store;
	public ControllerScreen(Cart cart, Store store) {
		this.cart = cart;	
		this.store = store;
		addDVDScreen= new AddDigitalVideoDiscToStoreScreen(this.store, this.cart, this);
		addDVDScreen.setTitle("Add DVD");
		addBookScreen= new AddBookToStoreScreen(this.store, this.cart, this);
		addBookScreen.setTitle("Add Book");
		addCDScreen= new AddCompactDiscToStoreScreen(this.store, this.cart, this);
		addCDScreen.setTitle("Add CD");
		storeSreen= new StoreScreen(this.store, this.cart, this);
		cartSceen= new CartScreen(cart,this);
		showStoreScreen();
	}
	public void updateAddItem() {
	}
	public void showStoreScreen() {
		SwingUtilities.updateComponentTreeUI(storeSreen);
		storeSreen.dispose();
		storeSreen= new StoreScreen(store,cart,this);
		storeSreen.setVisible(true);
		cartSceen.setVisible(false);
		addDVDScreen.setVisible(false);
		addCDScreen.setVisible(false);
		addBookScreen.setVisible(false);
		
	}
	public void showCartScreen() {
		storeSreen.setVisible(false);
		cartSceen.setVisible(true);
		addDVDScreen.setVisible(false);
		addCDScreen.setVisible(false);
		addBookScreen.setVisible(false);
	}
	public void showAddDVDScreen() {
		storeSreen.setVisible(false);
		cartSceen.setVisible(false);
		addDVDScreen.setVisible(true);
		addCDScreen.setVisible(false);
		addBookScreen.setVisible(false);
	}
	public void showAddCDScreen() {
		storeSreen.setVisible(false);
		cartSceen.setVisible(false);
		addDVDScreen.setVisible(false);
		addCDScreen.setVisible(true);
		addBookScreen.setVisible(false);
	}
	public void showAddBookScreen() {
		storeSreen.setVisible(false);
		cartSceen.setVisible(false);
		addDVDScreen.setVisible(false);
		addCDScreen.setVisible(false);
		addBookScreen.setVisible(true);
	}
}