package Lab01;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Tùy chỉnh các lựa chọn nút
        Object[] options = { "I do", "I don't" };
        // Hiển thị hộp thoại với lựa chọn tùy chỉnh
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?", "Choose options | Do Dinh Trung - 20226128",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        // Hiển thị kết quả người dùng đã chọn
        JOptionPane.showMessageDialog(null,
                "You've chosen: " + (option == JOptionPane.YES_OPTION ? "I do" : "I don't"));
        System.exit(0);
    }
}
