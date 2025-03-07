package hust.soict.itep.aims.media;
//Do Dinh Trung - 20226128
public class Disc extends Media {
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Disc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}
	@Override
	public String toString() {
	       return "DVD: " +
	                " [id = "  + getId() +
	                ", title = " + getTitle() +
	                ", category = " + getCategory() +
	                ", director: " + getDirector() +
	                ", length = " + getLength() + " min" + ", cost= " + getCost() + "$]";
	}
}
