package hust.soict.itep.aims.media;
//Do Dinh Trung - 20226128
import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public Media(int id, String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	//Override method equals DoDinhTrung-20226128
	@Override
	public boolean equals(Object obj) {
	    // Kiểm tra nếu cùng tham chiếu
	    if (this == obj) return true;
	    // Kiểm tra nếu obj là null hoặc không cùng kiểu Media
	    if (obj == null || getClass() != obj.getClass()) return false;
	    // Ép kiểu obj về Media
	    Media media = (Media) obj;
	    // So sánh theo tiêu chí tiêu đề (title)
	    return title != null && title.equals(media.title);
	}
	
	//Override method toString DoDinhTrung-20226128
	@Override
    public String toString() {
        return "Media: [ID: " + id + ", Title: " + title + ", Category: " + category + ", Cost: " + cost + "$]";
    }
	
	@Override
    public int compareTo(Media other) {
        int titleComparison = this.title.compareToIgnoreCase(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Float.compare(other.cost, this.cost);
    }

}
