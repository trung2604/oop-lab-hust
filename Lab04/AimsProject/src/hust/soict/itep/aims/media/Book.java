package hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;
//Do Dinh Trung - 20226128
public class Book extends Media {
	@Override
	public int compareTo(Media otherMedia) {
		if(otherMedia instanceof Book) {
			Book otherBook = (Book) otherMedia;
			int titleComparison = getTitle().compareTo(otherBook.getTitle());
			return (titleComparison == 0) ? Float.compare(getCost(), otherBook.getCost()) : titleComparison;
		} else {
			return super.compareTo(otherMedia);
		}
	}
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}
	//Method addAuthor DoDinhTrung-20226128
	public void addAuthor(String authorName) {
	    if (authorName == null || authorName.trim().isEmpty()) {
	        System.out.println("Invalid author name!");
	        return;
	    }
	    if (authors.contains(authorName)) {
	        System.out.println(authorName + " is already in the list of authors!");
	    } else {
	        authors.add(authorName);
	        System.out.println(authorName + " has been added to the list of authors.");
	    }
	}
	//Method removeAuthor DoDinhTrung-20226128
	public void removeAuthor(String authorName) {
	    if (authorName == null || authorName.trim().isEmpty()) {
	        System.out.println("Invalid author name!");
	        return;
	    }
	    if (authors.contains(authorName)) {
	        authors.remove(authorName);
	        System.out.println(authorName + " has been removed from the list of authors.");
	    } else {
	        System.out.println(authorName + " is not in the list of authors!");
	    }
	}
	
	//Override method toString DoDinhTrung-20226128
	@Override
	public String toString() {
	    StringBuilder print = new StringBuilder("Book: " +
	            " [id = " + getId() +
	            ", title = " + getTitle() +
	            ", category = " + getCategory() +
	            ", authors: ");
	    if (authors.isEmpty()) {
	        print.append("No authors");
	    } else {
	        for (int i = 0; i < authors.size(); i++) {
	            print.append(authors.get(i));
	            if (i < authors.size() - 1) { 
	                print.append(" + ");
	            }
	        }
	    }
	    print.append(", cost: ");
	    print.append(getCost());
	    print.append("$]");
	    return print.toString();
	}

}
