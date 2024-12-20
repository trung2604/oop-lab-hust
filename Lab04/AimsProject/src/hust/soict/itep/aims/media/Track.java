package hust.soict.itep.aims.media;
//Do Dinh Trung - 20226128
public class Track implements Playable{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Constructor DoDinhTrung-20226128
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	//Method play DoDinhTrung-20226128
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength() + "seconds");
	}
	//Override method equals DoDinhTrung-20226128
	@Override
	public boolean equals(Object obj) {
	    // Kiểm tra nếu cùng tham chiếu
	    if (this == obj) return true;
	    // Kiểm tra nếu obj là null hoặc không cùng kiểu Track
	    if (obj == null || getClass() != obj.getClass()) return false;
	    // Ép kiểu obj về Track
	    Track track = (Track) obj;
	    // So sánh theo tiêu chí tiêu đề (title) và độ dài (length)
	    return title != null && title.equals(track.title) && length == track.length;
	}
}
