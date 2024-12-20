package hust.soict.itep.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//DoDinhTrung-20226128
public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		// path file text
        String filename = "C:\\Users\\Admin\\OneDrive - Hanoi University of Science and Technology\\JavaBasics\\OtherProjects\\src\\hust\\soict\\itep\\garbage\\text.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (NullPointerException e) {
            System.out.println("File not found: " + filename);
            return;
        }
        startTime = System.currentTimeMillis();
        String outputString = "";
        for(byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
