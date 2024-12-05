import javax.swing.*;
import java.awt.*;

/**
 * The FrameSetup class represents the main frame for the application,
 * which contains various panels (screens) using a CardLayout for navigation.
 * This version does not rely on a GUI form for `screenContainer`.
 */
public class FrameSetup extends JFrame {
	private final JPanel screenContainer;
	
	/**
	 * Constructs a new FrameSetup object, setting up the main window
	 * and initializing screens with a CardLayout for navigation.
	 */
	public FrameSetup() {
		// Initialize the screen container and set its layout to CardLayout
		screenContainer = new JPanel();
		setContentPane(screenContainer); // Use the screen container as the content pane
		screenContainer.setLayout(new CardLayout());
		
		// Set up frame properties
		setTitle("Mom and Pop's Shop");
		setSize(1300, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Customize UI styles
		UIManager.put("Button.font", new Font("Arial", Font.BOLD, 18));
		
		// Initialize and add screens to the screen container
		initializeScreens();
		
		// Initially show the login screen
		((CardLayout) screenContainer.getLayout()).show(screenContainer, "Login");
	}
	
	/**
	 * Initializes all screens (panels) and adds them to the screen container.
	 */
	private void initializeScreens() {
		Login login = new Login((CardLayout) screenContainer.getLayout(), screenContainer, "Login");
		SignUp signUp = new SignUp((CardLayout) screenContainer.getLayout(), screenContainer, "SignUp");
		SignIn signIn = new SignIn((CardLayout) screenContainer.getLayout(), screenContainer, "SignIn");
		Menu menu = new Menu((CardLayout) screenContainer.getLayout(), screenContainer, "Menu");
		PizzaGUI createPizza = new PizzaGUI((CardLayout) screenContainer.getLayout(), screenContainer, "CreatePizza");
		Deals deals = new Deals((CardLayout) screenContainer.getLayout(), screenContainer, "Deals");
		CheckOut checkout = new CheckOut((CardLayout) screenContainer.getLayout(), screenContainer, "CheckOut");
		PaymentInfo paymentScreen = new PaymentInfo((CardLayout) screenContainer.getLayout(), screenContainer, "PaymentInfo");
		Locations location = new Locations((CardLayout) screenContainer.getLayout(), screenContainer, "Locations");
		ToppingsGUI toppings = new ToppingsGUI((CardLayout) screenContainer.getLayout(), screenContainer, "Toppings");
		MenuForNonUser menuForNonUser = new MenuForNonUser((CardLayout) screenContainer.getLayout(), screenContainer, "MenuForNonUser");
		Payment_Receipt paymentReceipt = new Payment_Receipt((CardLayout) screenContainer.getLayout(), screenContainer, "PaymentReceipt");
		Cart cart = new Cart((CardLayout) screenContainer.getLayout(), screenContainer, "Cart");
		LocationsForUser locationsForUser = new LocationsForUser((CardLayout) screenContainer.getLayout(), screenContainer, "LocationsForUser");
		DealsForUser dealsForUser = new DealsForUser((CardLayout) screenContainer.getLayout(), screenContainer, "DealsForUser");
	}
}
