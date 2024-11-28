import javax.swing.*;
import java.awt.*;

public class FrameSetup {
	private JFrame frame;
	private JPanel screenContainer;
	private CardLayout cardLayout;
	
	public FrameSetup() {
		// Configure UI defaults
		UIManager.put("Button.font", new Font("Arial", Font.BOLD, 18));
		UIManager.put("Label.font", new Font("Arial", Font.PLAIN, 18));
		
		// Create the main frame
		frame = new JFrame("Mom and Pop's Shop");
		frame.setSize(1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		// Create and set up the CardLayout
		cardLayout = new CardLayout();
		screenContainer = new JPanel(cardLayout);
		frame.setContentPane(screenContainer);
		
		// Initialize and add screens to the container
		initializeScreens();
		
		// Show the initial screen (Login)
		cardLayout.show(screenContainer, "Login");
		
		// Set the frame visible after adding components
		frame.setVisible(true);
	}
	
	/**
	 * Initializes the screens and adds them to the CardLayout container.
	 */
	private void initializeScreens() {
		// Assuming all these classes extend JPanel
		Login login = new Login(cardLayout, screenContainer, "Login");
		SignUp signUp = new SignUp(cardLayout, screenContainer, "SignUp");
		SignIn signIn = new SignIn(cardLayout, screenContainer, "SignIn");
		Menu menu = new Menu(cardLayout, screenContainer, "Menu");
		PizzaGUI createPizza = new PizzaGUI(cardLayout, screenContainer, "CreatePizza");
		Deals deals = new Deals(cardLayout, screenContainer, "Deals");
		CheckOut checkout = new CheckOut(cardLayout, screenContainer, "CheckOut");
		PaymentInfo paymentScreen = new PaymentInfo(cardLayout, screenContainer, "PaymentInfo");
		Locations location = new Locations(cardLayout, screenContainer, "Locations");
		ToppingsGUI toppings = new ToppingsGUI(cardLayout, screenContainer, "Toppings");
		MenuForNonUser menuForNonUser = new MenuForNonUser(cardLayout, screenContainer, "MenuForNonUser");
		Payment_Receipt paymentReceipt = new Payment_Receipt(cardLayout, screenContainer, "PaymentReceipt");
		Cart cart = new Cart(cardLayout, screenContainer, "Cart");
		LocationsForUser locationsForUser = new LocationsForUser(cardLayout, screenContainer, "LocationsForUser");
		DealsForUser dealsForUser = new DealsForUser(cardLayout, screenContainer, "DealsForUser");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(FrameSetup::new);
	}
}