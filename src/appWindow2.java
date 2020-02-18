import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.io.File;
import javax.swing.SwingConstants;

public class appWindow2 {

	JFileChooser openFileChooser;
	String chooserTitle;
	private JFrame frmSqlScriptGenerator;
	private JTable table;
	private JTextField tableField;
	private JTextField folderField;
	private JTextField fileTxtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appWindow2 window = new appWindow2();
					window.frmSqlScriptGenerator.setVisible(true);
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
		frmSqlScriptGenerator = new JFrame();
		frmSqlScriptGenerator.setTitle("SQL Script Generator");
		frmSqlScriptGenerator.setBounds(100, 100, 1000, 600);
		frmSqlScriptGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSqlScriptGenerator.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 557, 385);
		frmSqlScriptGenerator.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				   int rowPointer = table.getSelectedRow();
				   int colPointer = table.getSelectedColumn();
				   //System.out.println(table.getValueAt(rowPointer, colPointer));
				   
				   if(table.getValueAt(rowPointer, 1).toString().length() > 0)
				   {
					   table.setValueAt(false, rowPointer, 4);
				   }else if(table.getValueAt(rowPointer, 1).toString().length() == 0)
				   {
					   table.setValueAt(true, rowPointer, 4);
				   }
			}
		});
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, Boolean.TRUE},
			},
			new String[] {
				"Column Name", "Operator", "Update", "is String", "is Null"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Boolean.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setMaxWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setMaxWidth(50);
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(579, 30, 395, 320);
		frmSqlScriptGenerator.getContentPane().add(scrollPane_1);
		
		JTextArea scriptTxtArea = new JTextArea();
		scrollPane_1.setViewportView(scriptTxtArea);
		scriptTxtArea.setEditable(false);
		scriptTxtArea.setForeground(Color.BLACK);
		scriptTxtArea.setBackground(Color.BLACK);
		scriptTxtArea.setForeground(Color.WHITE);
		scriptTxtArea.setMargin(new Insets(10,10,10,10));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(579, 373, 395, 177);
		frmSqlScriptGenerator.getContentPane().add(scrollPane_2);
		
		JTextArea rollTextArea = new JTextArea();
		scrollPane_2.setViewportView(rollTextArea);
		rollTextArea.setEditable(false);
		rollTextArea.setBackground(Color.BLACK);
		rollTextArea.setForeground(Color.WHITE);
		rollTextArea.setMargin(new Insets(10,10,10,10));
		
		JLabel lblNewLabel = new JLabel("Rollback");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(577, 355, 121, 16);
		frmSqlScriptGenerator.getContentPane().add(lblNewLabel);
		
		JLabel lblScript = new JLabel("Script");
		lblScript.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScript.setBounds(577, 11, 121, 16);
		frmSqlScriptGenerator.getContentPane().add(lblScript);
		
		JButton btnAddRow = new JButton("Add Row\r\n");
		btnAddRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).addRow(new Object[] {null, "", null, null, true});
			}
		});
		btnAddRow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddRow.setBounds(344, 131, 98, 23);
		frmSqlScriptGenerator.getContentPane().add(btnAddRow);
		
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
		frmSqlScriptGenerator.getContentPane().add(btnDeleteRow);
		
		JLabel lblTableName = new JLabel("Table Name: ");
		lblTableName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTableName.setBounds(23, 22, 82, 16);
		frmSqlScriptGenerator.getContentPane().add(lblTableName);
		
		tableField = new JTextField();
		tableField.setBounds(107, 16, 167, 30);
		frmSqlScriptGenerator.getContentPane().add(tableField);
		tableField.setColumns(10);
		
		folderField = new JTextField();
		folderField.setColumns(10);
		folderField.setBounds(107, 48, 371, 30);
		frmSqlScriptGenerator.getContentPane().add(folderField);
		
		JLabel lblFolderPath = new JLabel("Folder Path:");
		lblFolderPath.setHorizontalAlignment(SwingConstants.CENTER);
		lblFolderPath.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFolderPath.setBackground(Color.WHITE);
		lblFolderPath.setBounds(20, 49, 85, 26);
		frmSqlScriptGenerator.getContentPane().add(lblFolderPath);
		
		JButton btnOpenFile = new JButton("Open File");
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFileChooser = new JFileChooser();
				openFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				openFileChooser.setCurrentDirectory(new File("C:\\"));
				openFileChooser.setDialogTitle(chooserTitle);
				openFileChooser.setAcceptAllFileFilterUsed(false);
				
				if(openFileChooser.showOpenDialog(btnOpenFile) == JFileChooser.APPROVE_OPTION) {
					folderField.setText(openFileChooser.getSelectedFile().toString());
				}else {
					folderField.setText("No File Path Chosen");
				}
			}
		});
		btnOpenFile.setBounds(488, 52, 79, 23);
		frmSqlScriptGenerator.getContentPane().add(btnOpenFile);
		
		JLabel lblFileName = new JLabel("File Name: ");
		lblFileName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFileName.setBounds(284, 22, 68, 16);
		frmSqlScriptGenerator.getContentPane().add(lblFileName);
		
		fileTxtField = new JTextField();
		fileTxtField.setColumns(10);
		fileTxtField.setBounds(354, 16, 213, 30);
		frmSqlScriptGenerator.getContentPane().add(fileTxtField);
		
		
		//((DefaultTableModel)table.getModel()).removeRow(1);
		//((DefaultTableModel)table.getModel()).addRow(new Object[] {"Aasdasd","asdasd","asdasda"});
		
	}
}
