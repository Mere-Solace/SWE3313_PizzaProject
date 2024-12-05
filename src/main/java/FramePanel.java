import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class FramePanel {
	private static CardLayout screenLayoutController = null;
	private final JPanel screenContainer;
	private final String panelName;
	
	private JPanel screenPanel;
	
	private final ArrayList<JComponent> components;
	private final ArrayList<JLabel> totalCostFields;

	public FramePanel(JPanel screenContainer, String panelName) {
		this.screenContainer = screenContainer;
		if (screenLayoutController == null) {
			screenLayoutController = (CardLayout) screenContainer.getLayout();
		}
		this.panelName = panelName;
		
		components = new ArrayList<>();
		totalCostFields = new ArrayList<>();
	}
	
	public abstract boolean onAttemptLeaveScreen(Screen destinationScreen);
	
	public abstract Screen onAttemptEnterScreen(Screen thisScreen);
	
	public abstract  void onLeaveScreen();
	
	public abstract void onEnterScreen();
	
	public JPanel getScreenPanel() {
		return screenPanel;
	}
	
	public void setScreenPanel(JPanel panel) {
		screenPanel = panel;
	}
}
