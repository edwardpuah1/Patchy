import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;

public class appWindow {

	private JFrame frmPatchy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appWindow window = new appWindow();
					window.frmPatchy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public appWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPatchy = new JFrame();
		frmPatchy.setTitle("Patchy");
		frmPatchy.setBackground(Color.WHITE);
		frmPatchy.setBounds(100, 100, 880, 435);
		frmPatchy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPatchy.getContentPane().setLayout(null);
	}
}
