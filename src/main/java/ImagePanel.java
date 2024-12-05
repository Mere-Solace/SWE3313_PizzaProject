import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImagePanel extends JPanel {
	private Image image;
	
	public ImagePanel(String imageFileName) {
		try (InputStream stream = getClass().getClassLoader().getResourceAsStream("images/" + imageFileName)) {
			if (stream != null) {
				image = ImageIO.read(stream);
			} else {
				System.err.println("Image not found: " + imageFileName);
			}
		} catch (IOException e) {
			e.fillInStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
}
