import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class WelcomScreen {

	private JFrame welcomeScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomScreen window = new WelcomScreen();
					window.welcomeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		welcomeScreen = new JFrame();
		welcomeScreen.getContentPane().setForeground(new Color(0, 0, 0));
		welcomeScreen.getContentPane().setBackground(SystemColor.desktop);
		welcomeScreen.setBackground(SystemColor.control);
		welcomeScreen.setBounds(100, 100, 960, 590);
		welcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Let's Begin The Game!\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(welcomeScreen.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		welcomeScreen.getContentPane().setLayout(groupLayout);
	}

}