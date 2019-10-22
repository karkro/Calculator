package main;

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


	/*
	Create the application
	*/

	public Calculator() {
		initialize();
	}

	/*
	 Initialize the contents of the frame
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setBounds(100, 100, 325, 375);
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);
		frmStandardCalculator.setResizable(false);

		tfDisplay = new JTextField();
		tfDisplay.setBounds(10, 10, 300, 45);
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
				frmStandardCalculator.setBounds(100, 100, 325, 375);
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setResizable(false);
				tfDisplay.setBounds(10, 10, 300, 45);
			}
		});
		mFile.add(miStandard);

		JMenuItem miScientific = new JMenuItem("Scientific");
		miScientific.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setBounds(100, 100, 580, 375);
				frmStandardCalculator.setTitle("Scientific Calculator");
				tfDisplay.setBounds(10, 10, 550, 45);
				frmStandardCalculator.setResizable(false);
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

		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 260, 98, 48);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn0.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn0);

		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 210, 58, 38);
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
		btn2.setBounds(60, 210, 48, 48);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = btn2.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(110, 210, 48, 48);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn3.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 160, 48, 48);
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
		btn5.setBounds(60, 160, 48, 48);
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
		btn6.setBounds(110, 160, 48, 48);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn6.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 110, 48, 48);
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
		btn8.setBounds(60, 110, 48, 48);
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
		btn9.setBounds(110, 110, 48, 48);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn9.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn9);

		JButton btnDot = new JButton(".");
		btnDot.setBounds(110, 260, 48, 48);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btnDot.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btnDot);


		JButton bBackspace = new JButton("\uF0E7");
		bBackspace.setBounds(10, 60, 58, 38);
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
		btnCE.setBounds(70, 60, 58, 38);
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText("");
			}
		});
		frmStandardCalculator.getContentPane().add(btnCE);

		JButton btnC = new JButton("C");
		btnC.setBounds(130, 60, 58, 38);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfDisplay.setText(String.valueOf(0));
			}
		});
		frmStandardCalculator.getContentPane().add(btnC);

		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.setBounds(190, 60, 58, 38);
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPlusMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = ops * (-1);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnPlusMinus);

		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(160, 110, 48, 48);
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
		btnMultiply.setBounds(160, 160, 48, 48);
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
		btnMinus.setBounds(160, 210, 48, 48);
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
		btnPlus.setBounds(160, 260, 48, 48);
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

		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setBounds(250, 60, 58, 38);
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSqrt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.sqrt(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnSqrt);

		JButton btnRMod = new JButton("%");
		btnRMod.setBounds(210, 110, 48, 48);
		btnRMod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRMod.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "%";
			}
		});
		frmStandardCalculator.getContentPane().add(btnRMod);

		JButton btn1x = new JButton("1/x");
		btn1x.setBounds(210, 160, 48, 48);
		btn1x.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn1x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String iNum = tfDisplay.getText() + btn1x.getText();
				tfDisplay.setText(iNum);
			}
		});
		frmStandardCalculator.getContentPane().add(btn1x);


		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(210, 210, 48, 98);
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(tfDisplay.getText());
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					tfDisplay.setText(answer);
				} else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					tfDisplay.setText(answer);
				} else if (operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					tfDisplay.setText(answer);
				} else if (operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					tfDisplay.setText(answer);
				}

			}
		});
		frmStandardCalculator.getContentPane().add(btnEquals);



		// ----------------------- SCIENTIFIC CALCULATOR ------------------------------


		JButton btnLog = new JButton("Log");
		btnLog.setBounds(320, 60, 58, 38);
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.log(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnLog);

		JButton btnSin = new JButton("Sin");
		btnSin.setBounds(380, 60, 58, 38);
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.sin(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnSin);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.setBounds(440, 60, 58, 38);
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.sinh(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnSinh);

		JButton btnMod_1 = new JButton("Mod");
		btnMod_1.setBounds(500, 60, 58, 38);
		btnMod_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMod_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "Mod";
			}
		});
		frmStandardCalculator.getContentPane().add(btnMod_1);

		JButton btnPi = new JButton("Pi");
		btnPi.setBounds(320, 100, 58, 38);
		btnPi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = 3.1415926535897932384626433832795;
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnPi);

		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(380, 100, 58, 38);
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.cos(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnCos);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.setBounds(440, 100, 58, 38);
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCosh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.cosh(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnCosh);

		JButton btnLnx = new JButton("Lnx");
		btnLnx.setBounds(500, 100, 58, 38);
		btnLnx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLnx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.log10(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnLnx);

		JButton btnXY = new JButton("x^y");
		btnXY.setBounds(320, 140, 58, 38);
		btnXY.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.pow(ops, ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnXY);

		JButton btnTan = new JButton("Tan");
		btnTan.setBounds(380, 140, 58, 38);
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.tan(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.setBounds(440, 140, 58, 38);
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTanh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.tanh(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnTanh);

		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(500, 140, 58, 38);
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(tfDisplay.getText());
				tfDisplay.setText("");
				operations = "Exp";
			}
		});
		frmStandardCalculator.getContentPane().add(btnExp);

		JButton btnX2 = new JButton("x^2");
		btnX2.setBounds(320, 180, 58, 38);
		btnX2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnX2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = (ops * ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnX2);

		JButton btnCbr = new JButton("Cbr");
		btnCbr.setBounds(380, 180, 58, 38);
		btnCbr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCbr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.cbrt(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnCbr);

		JButton btnRund = new JButton("Rund");
		btnRund.setBounds(440, 180, 58, 38);
		btnRund.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRund.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = Math.round(ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnRund);

		JButton btn2Pi = new JButton("2*Pi");
		btn2Pi.setBounds(500, 180, 58, 38);
		btn2Pi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2Pi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btn2Pi);

		JButton btnX3 = new JButton("x^3");
		btnX3.setBounds(320, 220, 58, 38);
		btnX3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnX3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
				ops = (ops * ops * ops);
				tfDisplay.setText(String.valueOf(ops));
			}
		});
		frmStandardCalculator.getContentPane().add(btnX3);

		JButton btnBin = new JButton("Bin");
		btnBin.setBounds(380, 220, 58, 38);
		btnBin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfDisplay.getText());
				tfDisplay.setText(Integer.toString(a, 2));
			}
		});
		frmStandardCalculator.getContentPane().add(btnBin);

		JButton btnHex = new JButton("Hex");
		btnHex.setBounds(440, 220, 58, 38);
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfDisplay.getText());
				tfDisplay.setText(Integer.toString(a, 16));
			}
		});
		frmStandardCalculator.getContentPane().add(btnHex);

		JButton btnOctal = new JButton("Octal");
		btnOctal.setBounds(500, 220, 58, 38);
		btnOctal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOctal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfDisplay.getText());
				tfDisplay.setText(Integer.toString(a, 8));
			}
		});
		frmStandardCalculator.getContentPane().add(btnOctal);
	}
}
