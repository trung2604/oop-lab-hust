package hust.soict.itep.aims.media;
//Do Dinh Trung - 20226128
import java.util.ArrayList;

import hust.soict.itep.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.artist = artist;
        this.tracks = (tracks != null) ? tracks : new ArrayList<>(); // Tránh null
        this.setLength(getLength());
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.tracks = new ArrayList<>(); // Khởi tạo mặc định
    }

    // Method addTrack DoDinhTrung-20226128
    public void addTrack(Track track) {
        if (track == null) {
            System.out.println("Invalid track! Cannot add a null track.");
            return;
        }
        if (tracks.contains(track)) {
            System.out.println(track.getTitle() + " is already in the list of tracks.");
        } else {
            tracks.add(track);
            System.out.println(track.getTitle() + " has been added to the list of tracks.");
        }
    }

    // Method removeTrack DoDinhTrung-20226128
    public void removeTrack(Track track) {
        if (track == null) {
            System.out.println("Invalid track! Cannot remove a null track.");
            return;
        }
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " has been removed from the list of tracks.");
        } else {
            System.out.println(track.getTitle() + " is not in the list of tracks.");
        }
    }

    // Method getLength DoDinhTrung-20226128
    @Override
    public int getLength() {
        if (tracks == null || tracks.isEmpty()) {
            return 0; // Trả về 0 nếu danh sách track rỗng hoặc null
        }
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Method play DoDinhTrung-20226128
    public void play() throws PlayerException{
		if (this.getLength() > 0) {
			System.out.println("Compactdisc: " + getTitle());
			System.out.println("Artist: " + getArtist());
			System.out.println("Length: " + getLength());
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				nextTrack.play();
			}
		}
		else {
			throw new PlayerException("Error: DVD length is non-positive!");
		}
		
		
		for (Track track : tracks) {
			track.play();
		}
	}

    // Override method toString DoDinhTrung-20226128
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("CD: " +
                " [id = " + getId() +
                ", artist: " + artist +
                ", title = " + getTitle() +
                ", category = " + getCategory() +
                ", length: " + (getLength() > 0 ? getLength() + " min" : "Unknown length") +
                ", cost = " + getCost() + "$]" + '\n');
        print.append("Tracks:\n===================\n");
        if (tracks == null || tracks.isEmpty()) {
            print.append("No tracks available\n");
        } else {
            for (Track track : tracks) {
                print.append(track.getTitle());
                print.append('\t');
                print.append(track.getLength() > 0 ? track.getLength() + " min" : "Unknown length");
                print.append('\n');
            }
        }
        return print.toString();
    }
}
