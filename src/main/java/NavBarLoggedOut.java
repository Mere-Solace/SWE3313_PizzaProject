import javax.swing.*;

public class NavBarLoggedOut extends FramePanel{
	private JPanel pnlBg;
	
	private JPanel pnlLogo;
	private JButton button1;
	
	public NavBarLoggedOut(JPanel screenContainer, String panelName) {
		super(screenContainer, panelName);
		setScreenPanel(pnlBg);
	}
	
	@Override
	public boolean onAttemptLeaveScreen(Screen destinationScreen) {
		return false;
	}
	
	@Override
	public Screen onAttemptEnterScreen(Screen thisScreen) {
		return thisScreen;
	}
	
	@Override
	public void onLeaveScreen() {
	
	}
	
	@Override
	public void onEnterScreen() {
	
	}
	
	private void createUIComponents() {
		pnlLogo = new ImagePanel("PizzaLogo.jpg");
		pnlBg = new JPanel();
	}
}
