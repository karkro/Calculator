package main;

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

	private JFrame frmStandardCalculator;
	private JTextField tfDisplay;
	private JTextField lConverts;
	private JTextField tfConverts;

	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	* Create the application
	*/

	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setBounds(100, 100, 285, 375);
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);

		tfDisplay = new JTextField();
		tfDisplay.setBounds(10, 10, 250, 45);
		tfDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(tfDisplay);
		tfDisplay.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);

		JMenu mFile = new JMenu("File");
		menuBar.add(mFile);

		JMenuItem miStandard = new JMenuItem("Standard");
		miStandard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setBounds(100, 100, 285, 375);
				frmStandardCalculator.setTitle("Standard Calculator");
				tfDisplay.setBounds(10, 10, 205, 30);
			}
		});
		mFile.add(miStandard);

		JMenuItem miScientific = new JMenuItem("Scientific");
		miScientific.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setBounds(100, 100, 480, 375);
				frmStandardCalculator.setTitle("Scientific Calculator");
				tfDisplay.setBounds(10, 10, 445, 30);
			}
		});
		mFile.add(miScientific);

		JMenuItem miUnitConversion = new JMenuItem("Unit Conversion");
		miUnitConversion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setBounds(100, 100, 720, 375);
				frmStandardCalculator.setTitle("Unit Conversion");
				tfDisplay.setBounds(10, 10, 445, 30);
			}
		});
		mFile.add(miUnitConversion);

		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mFile.add(miExit);


		JButton bBackspace = new JButton("\uF0E7");
		bBackspace.setBounds(10, 60, 45, 45);
		bBackspace.setFont(new Font("Wingdings", Font.PLAIN, 10));
		bBackspace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (tfDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(tfDisplay.getText());
					strB.deleteCharAt(tfDisplay.getText().length() - 1);
					backspace = strB.toString();
					tfDisplay.setText(backspace);
				}
			}
		});
		frmStandardCalculator.getContentPane().add(bBackspace);

		JButton btnCE = new JButton("CE");
		btnCE.setBounds(60, 60, 45, 45);
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnCE.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnCE);

		JButton btnC = new JButton("C");
		btnC.setBounds(110, 60, 45, 45);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnC.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnC);

		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.setBounds(160, 60, 45, 45);
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPlusMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = ops * ops;
				String iNum = tfDisplay.getText() + btnPlusMinus.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnPlusMinus);

		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 110, 45, 45);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn7.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBounds(60, 110, 45, 45);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn8.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBounds(110, 110, 45, 45);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn9.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 160, 45, 45);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn4.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(60, 160, 45, 45);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn5.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(110, 160, 45, 45);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn6.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 210, 45, 45);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn1.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBounds(60, 210, 45, 45);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn2.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(110, 210, 45, 45);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn3.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 260, 95, 45);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn0.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.setBounds(110, 260, 45, 45);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnDot.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnDot);

		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(160, 110, 45, 45);
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "/";
			}
		});
		frmStandardCalculator.getContentPane().add(btnDivision);

		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(160, 160, 45, 45);
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "*";
			}
		});
		frmStandardCalculator.getContentPane().add(btnMultiply);

		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(160, 210, 45, 45);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "-";
			}
		});
		frmStandardCalculator.getContentPane().add(btnMinus);

		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(160, 260, 45, 45);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "+";
			}
		});
		frmStandardCalculator.getContentPane().add(btnPlus);

		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(210, 110, 48, 45);
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPercent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnPercent.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnPercent);

		JButton btnx = new JButton("1/x");
		btnx.setBounds(210, 160, 48, 45);
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnx.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnx);

		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(210, 210, 48, 95);
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnEquals.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnEquals);


	}
}
