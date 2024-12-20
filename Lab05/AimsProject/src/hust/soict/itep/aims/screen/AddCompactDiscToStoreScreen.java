package hust.soict.itep.aims.screen;
//DoDinhTrung - 20226128
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.media.CompactDisc;
import hust.soict.itep.aims.media.Track;
import hust.soict.itep.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField artist;
    private JTextField listTrack;

    public AddCompactDiscToStoreScreen(Store store, Cart cart, ControllerScreen c) {
        super(store, cart, c);
    }

    @Override
    void updateAdd(JPanel panel) {
        this.numberInput = 6; // ID của CD, hoặc có thể lấy từ store nếu cần

        JLabel artistLabel = new JLabel("Artist", JLabel.TRAILING);
        panel.add(artistLabel);
        artist = new JTextField(2);
        artist.setPreferredSize(new Dimension(150, 20));
        artistLabel.setLabelFor(artist);
        panel.add(artist);

        JLabel listTrackLabel = new JLabel("List track (each track separated by a comma Ex: track-title-length)", JLabel.TRAILING);
        panel.add(listTrackLabel);

        listTrack = new JTextField(2);
        listTrackLabel.setLabelFor(listTrack);
        panel.add(listTrack);

        JButton tes = new JButton("add");
        tes.setVisible(false);
        panel.add(tes);

        panel.setPreferredSize(new Dimension(100, 300));
        addBtn = new JButton("add");
        addBtn.addActionListener(e -> {
            addMedia();
        });
        panel.add(addBtn);
    }

    public void addMedia() {
        String title = this.title.getText();
        String listTrack = this.listTrack.getText();
        String category = this.category.getText();
        float cost = Float.parseFloat(this.cost.getText());
        String artist = this.artist.getText();

        if (title.isEmpty() || listTrack.isEmpty() || category.isEmpty() || cost <= 0 || artist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields correctly.");
            return;
        }

        String[] arrayTrack = listTrack.trim().split(",");
        if (arrayTrack.length == 0) {
            JOptionPane.showMessageDialog(null, "Please add at least one track.");
            return;
        }

        CompactDisc cd = new CompactDisc(numberInput, title, category, cost, artist, null);
        
        for (String track : arrayTrack) {
            String[] trackParts = track.split("-");
            if (trackParts.length != 2) {
                JOptionPane.showMessageDialog(null, "Invalid track format! Use 'track-title-length'.");
                return;
            }

            String titleTrack = trackParts[0].trim();
            int lengthTrack;
            try {
                lengthTrack = Integer.parseInt(trackParts[1].trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Track length must be a valid number.");
                return;
            }
            Track newTrack = new Track(titleTrack, lengthTrack);
            cd.addTrack(newTrack);
        }

        this.store.addMedia(cd);
        JOptionPane.showMessageDialog(null, "CD added successfully!");
        clearTextField();
    }

    public void clearTextField() {
        this.title.setText("");
        this.listTrack.setText("");
        this.cost.setText("");
        this.artist.setText("");
        this.category.setText("");
    }
}
