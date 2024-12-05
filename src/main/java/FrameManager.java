import javax.swing.*;
import java.awt.*;

/*
Frame Manager contains a JPanel with a CardLayout, allowing
for other JPanels to easily be shown using the show() method

All Frames are initialized here
 */

public class FrameManager extends JFrame {
	private static final CardLayout cardLayout = new CardLayout();
	private static final JPanel frameContainer = new JPanel(cardLayout);
	
	
	int width = 1300;
	int height = 800;
	
	public FrameManager() {
		frameInitialization();
		frameContainer.add(new JButton("Click me"));
	}
	
	public void frameInitialization() {
		setContentPane(frameContainer);
		setTitle("Mom and Pop's Shop");
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 18));
	}
}
