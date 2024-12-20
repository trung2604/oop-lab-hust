package hust.soict.itep.aims.media;

import hust.soict.itep.aims.exception.PlayerException;

//Do Dinh Trung - 20226128
public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
	}
	
	
	
	//Method play DoDinhTrung-20226128
	public void play() throws PlayerException{
		if (this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		else {throw new PlayerException("Error: DVD length is non-positive!");}
	}
}

    
