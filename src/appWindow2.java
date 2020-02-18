import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class appWindow2 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appWindow2 window = new appWindow2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public appWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 557, 385);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(((DefaultTableModel)table.getModel()).getValueAt(1, 1));
			}
		});
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Select", "Where", "is String", "is Null", "Update"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Boolean.class, Boolean.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setMaxWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setMaxWidth(50);
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(579, 30, 395, 320);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(579, 373, 395, 177);
		frame.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Rollback");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(577, 355, 121, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblScript = new JLabel("Script");
		lblScript.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScript.setBounds(577, 11, 121, 16);
		frame.getContentPane().add(lblScript);
		
		JButton btnNewButton = new JButton("Add Row\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).addRow(new Object[] {null, null, null, null, null});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(344, 131, 98, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteRow = new JButton("Delete Row\r\n");
		btnDeleteRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				   int[] rows = table.getSelectedRows();
				   for(int i=0;i<rows.length;i++){
				     model.removeRow(rows[i]-i);
				   }
			}
		});
		btnDeleteRow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeleteRow.setBounds(452, 131, 115, 23);
		frame.getContentPane().add(btnDeleteRow);
		//((DefaultTableModel)table.getModel()).removeRow(1);
		//((DefaultTableModel)table.getModel()).addRow(new Object[] {"Aasdasd","asdasd","asdasda"});
		
	}
}
