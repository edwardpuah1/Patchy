import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class appWindow {

	private JFrame frmPatchy;
	private JTable table;
	private JTable table_1;

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
	@SuppressWarnings("serial")
	private void initialize() {
		frmPatchy = new JFrame();
		frmPatchy.setTitle("Patchy");
		frmPatchy.setBackground(Color.WHITE);
		frmPatchy.setBounds(100, 100, 880, 435);
		frmPatchy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPatchy.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 125, 458, 260);
		frmPatchy.getContentPane().add(scrollPane);
		
		Object[][] object = new Object[][] {{null, null, null, null, null}};
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Column Name", "Where", "Is NULL", "Update", "Is String"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Boolean.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table_1);

	}
}
