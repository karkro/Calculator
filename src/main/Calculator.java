package main;

import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {

	private JFrame frame;
	private JTextField tfDisplay;

	private double firstNum;
	private double secondNum;
	private double result;
	private String operations;


	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Calculator window = new Calculator();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
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
		frame = new JFrame();
		frame.setBounds(100, 100, 325, 315);
		frame.setTitle("Basic Mode");
		frame.getContentPane().setBackground(new Color(232, 232, 231));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		/*try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}*/

		tfDisplay = new JTextField();
		tfDisplay.setBounds(10, 10, 298, 45);
		tfDisplay.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		tfDisplay.setBackground(new Color(255, 255, 240));
		tfDisplay.setForeground(new Color(106, 106, 100));
		tfDisplay.setSelectionColor(new Color(152, 251, 152));
		tfDisplay.setBorder(BorderFactory.createLineBorder(new Color(178, 178,168)));
		tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
		frame.getContentPane().add(tfDisplay);
		tfDisplay.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mFile = new JMenu("File");
		menuBar.add(mFile);

		JMenuItem miStandard = new JMenuItem("Basic Mode");
		miStandard.addActionListener(e -> {
			frame.setBounds(100, 100, 325, 315);
			frame.setTitle("Basic Mode");
			frame.setResizable(false);
			tfDisplay.setBounds(10, 10, 298, 45);
		});
		mFile.add(miStandard);

		JMenuItem miScientific = new JMenuItem("Advanced Mode");
		miScientific.addActionListener(e -> {
			frame.setBounds(100, 100, 615, 315);
			frame.setTitle("Advanced Mode");
			tfDisplay.setBounds(10, 10, 588, 45);
			frame.setResizable(false);
		});
		mFile.add(miScientific);


		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(e -> System.exit(0));
		mFile.add(miExit);


		JButton bBackspace = new JButton("<=");
		bBackspace.setBounds(10, 60, 58, 38);
		bBackspace.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		bBackspace.addActionListener(e12 -> {
			String backspace;
			if (tfDisplay.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(tfDisplay.getText());
				strB.deleteCharAt(tfDisplay.getText().length() - 1);
				backspace = strB.toString();
				tfDisplay.setText(backspace);
			}
		});
		frame.getContentPane().add(bBackspace);


		JButton btnCE = new JButton("CE");
		btnCE.setBounds(70, 60, 58, 38);
		btnCE.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnCE.addActionListener(e144 -> tfDisplay.setText(""));
		frame.getContentPane().add(btnCE);


		JButton btnC = new JButton("C");
		btnC.setBounds(130, 60, 58, 38);
		btnC.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnC.addActionListener(e143 -> tfDisplay.setText(String.valueOf(0)));
		frame.getContentPane().add(btnC);


		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.setBounds(190, 60, 58, 38);
		btnPlusMinus.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnPlusMinus.addActionListener(e142 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = ops * (-1);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnPlusMinus);


		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setBounds(250, 60, 58, 38);
		btnSqrt.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnSqrt.addActionListener(e141 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.sqrt(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnSqrt);


		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 100, 58, 38);
		btn7.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn7.addActionListener(e140 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn7.getText();
			} else {
				iNum = tfDisplay.getText() + btn7.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn7);


		JButton btn8 = new JButton("8");
		btn8.setBounds(70, 100, 58, 38);
		btn8.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn8.addActionListener(e139 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn8.getText();
			} else {
				iNum = tfDisplay.getText() + btn8.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn8);


		JButton btn9 = new JButton("9");
		btn9.setBounds(130, 100, 58, 38);
		btn9.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn9.addActionListener(e138 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn9.getText();
			} else {
				iNum = tfDisplay.getText() + btn9.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn9);


		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(190, 100, 58, 38);
		btnDivision.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnDivision.addActionListener(e137 -> {
			firstNum = Double.parseDouble(tfDisplay.getText());
			tfDisplay.setText("");
			operations = "/";
		});
		frame.getContentPane().add(btnDivision);


		JButton btnRMod = new JButton("%");
		btnRMod.setBounds(250, 100, 58, 38);
		btnRMod.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		btnRMod.addActionListener(e136 -> {
			firstNum = Double.parseDouble(tfDisplay.getText());
			tfDisplay.setText("");
			operations = "%";
		});
		frame.getContentPane().add(btnRMod);


		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 140, 58, 38);
		btn4.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn4.addActionListener(e135 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn4.getText();
			} else {
				iNum = tfDisplay.getText() + btn4.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn4);


		JButton btn5 = new JButton("5");
		btn5.setBounds(70, 140, 58, 38);
		btn5.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn5.addActionListener(e134 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn5.getText();
			} else {
				iNum = tfDisplay.getText() + btn5.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn5);


		JButton btn6 = new JButton("6");
		btn6.setBounds(130, 140, 58, 38);
		btn6.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn6.addActionListener(e133 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn6.getText();
			} else {
				iNum = tfDisplay.getText() + btn6.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn6);


		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(190, 140, 58, 38);
		btnMultiply.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnMultiply.addActionListener(e132 -> {
			firstNum = Double.parseDouble(tfDisplay.getText());
			tfDisplay.setText("");
			operations = "*";
		});
		frame.getContentPane().add(btnMultiply);


		JButton btn1x = new JButton("1/x");
		btn1x.setBounds(250, 140, 58, 38);
		btn1x.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		btn1x.addActionListener(e131 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = 1 / ops;
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btn1x);


		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 180, 58, 38);
		btn1.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn1.addActionListener(e130 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn1.getText();
			} else {
				iNum = tfDisplay.getText() + btn1.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn1);


		JButton btn2 = new JButton("2");
		btn2.setBounds(70, 180, 58, 38);
		btn2.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn2.addActionListener(e129 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn2.getText();
			} else {
				iNum = tfDisplay.getText() + btn2.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn2);


		JButton btn3 = new JButton("3");
		btn3.setBounds(130, 180, 58, 38);
		btn3.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btn3.addActionListener(e128 -> {
			String iNum;
			if (tfDisplay.getText().equals("0")) {
				iNum = btn3.getText();
			} else {
				iNum = tfDisplay.getText() + btn3.getText();
			}
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn3);


		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(190, 180, 58, 38);
		btnMinus.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		btnMinus.addActionListener(e127 -> {
			firstNum = Double.parseDouble(tfDisplay.getText());
			tfDisplay.setText("");
			operations = "-";
		});
		frame.getContentPane().add(btnMinus);


		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(250, 180, 58, 78);
		btnEquals.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		btnEquals.setBackground(new Color(60, 250, 60));
		btnEquals.addActionListener(e126 -> {
			String answer;
			secondNum = Double.parseDouble(tfDisplay.getText());
			switch (operations) {
                case "+":
                    result = firstNum + secondNum;
                    answer = String.format("%.2f", result);
                    tfDisplay.setText(answer);
                    break;
                case "-":
                    result = firstNum - secondNum;
                    answer = String.format("%.2f", result);
                    tfDisplay.setText(answer);
                    break;
                case "*":
                    result = firstNum * secondNum;
                    answer = String.format("%.2f", result);
                    tfDisplay.setText(answer);
                    break;
                case "/":
                    result = firstNum / secondNum;
                    answer = String.format("%.2f", result);
                    tfDisplay.setText(answer);
                    break;
                case "%":
                    result = firstNum % secondNum;
                    answer = String.valueOf(result);
                    tfDisplay.setText(answer);
                    break;
            }
		});
		frame.getContentPane().add(btnEquals);


		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 220, 118, 38);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn0.addActionListener(e125 -> {
			String iNum = tfDisplay.getText() + btn0.getText();
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btn0);


		JButton btnDot = new JButton(".");
		btnDot.setBounds(130, 220, 58, 38);
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDot.addActionListener(e124 -> {
			String iNum = tfDisplay.getText() + btnDot.getText();
			tfDisplay.setText(iNum);
		});
		frame.getContentPane().add(btnDot);


		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(190, 220, 58, 38);
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPlus.addActionListener(e123 -> {
			firstNum = Double.parseDouble(tfDisplay.getText());
			tfDisplay.setText("");
			operations = "+";
		});
		frame.getContentPane().add(btnPlus);


		// -------------------------------------- SCIENTIFIC CALCULATOR ------------------------------


		JButton btnLog = new JButton("Log");
		btnLog.setBounds(320, 60, 68, 38);
		btnLog.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnLog.addActionListener(e122 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.log(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnLog);

		JButton btnSin = new JButton("Sin");
		btnSin.setBounds(390, 60, 68, 38);
		btnSin.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnSin.addActionListener(e121 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.sin(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnSin);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.setBounds(460, 60, 68, 38);
		btnSinh.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnSinh.addActionListener(e120 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.sinh(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnSinh);

		JButton btnMod_1 = new JButton("e");
		btnMod_1.setBounds(530, 60, 68, 38);
		btnMod_1.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnMod_1.addActionListener(e119 -> {
			double euler;
			euler = 2.718281828;
			tfDisplay.setText(String.valueOf(euler));
		});
		frame.getContentPane().add(btnMod_1);

		JButton btnPi = new JButton("Pi");
		btnPi.setBounds(320, 100, 68, 38);
		btnPi.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnPi.addActionListener(e118 -> {
			double pi;
			pi = 3.1415926535897932384626433832795;
			tfDisplay.setText(String.valueOf(pi));
		});
		frame.getContentPane().add(btnPi);

		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(390, 100, 68, 38);
		btnCos.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnCos.addActionListener(e117 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.cos(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnCos);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.setBounds(460, 100, 68, 38);
		btnCosh.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnCosh.addActionListener(e116 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.cosh(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnCosh);

		JButton btnLnx = new JButton("Lnx");
		btnLnx.setBounds(530, 100, 68, 38);
		btnLnx.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnLnx.addActionListener(e115 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.log10(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnLnx);

		JButton btnXY = new JButton("x^x");
		btnXY.setBounds(320, 140, 68, 38);
		btnXY.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnXY.addActionListener(e114 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.pow(ops, ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnXY);

		JButton btnTan = new JButton("Tan");
		btnTan.setBounds(390, 140, 68, 38);
		btnTan.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnTan.addActionListener(e113 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.tan(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.setBounds(460, 140, 68, 38);
		btnTanh.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnTanh.addActionListener(e112 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.tanh(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnTanh);

		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(530, 140, 68, 38);
		btnExp.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnExp.addActionListener(e111 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.exp(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnExp);

		JButton btnX2 = new JButton("x^2");
		btnX2.setBounds(320, 180, 68, 38);
		btnX2.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnX2.addActionListener(e110 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = (ops * ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnX2);

		JButton btnCbr = new JButton("Cbr");
		btnCbr.setBounds(390, 180, 68, 38);
		btnCbr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCbr.addActionListener(e19 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.cbrt(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnCbr);

		JButton btnRund = new JButton("Rund");
		btnRund.setBounds(460, 180, 68, 38);
		btnRund.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnRund.addActionListener(e18 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = Math.round(ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnRund);

		JButton btn2Pi = new JButton("2*Pi");
		btn2Pi.setBounds(530, 180, 68, 38);
		btn2Pi.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btn2Pi.addActionListener(e17 -> {
			double ops;
			ops = (3.1415926535897932384626433832795) * 2;
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btn2Pi);

		JButton btnX3 = new JButton("x^3");
		btnX3.setBounds(320, 220, 68, 38);
		btnX3.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnX3.addActionListener(e16 -> {
			double ops = Double.parseDouble(String.valueOf(tfDisplay.getText()));
			ops = (ops * ops * ops);
			tfDisplay.setText(String.valueOf(ops));
		});
		frame.getContentPane().add(btnX3);

		JButton btnBin = new JButton("Bin");
		btnBin.setBounds(390, 220, 68, 38);
		btnBin.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnBin.addActionListener(e15 -> {
			int a = Integer.parseInt(tfDisplay.getText());
			tfDisplay.setText(Integer.toString(a, 2));
		});
		frame.getContentPane().add(btnBin);

		JButton btnHex = new JButton("Hex");
		btnHex.setBounds(460, 220, 68, 38);
		btnHex.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnHex.addActionListener(e14 -> {
			int a = Integer.parseInt(tfDisplay.getText());
			tfDisplay.setText(Integer.toString(a, 16));
		});
		frame.getContentPane().add(btnHex);

		JButton btnOctal = new JButton("Octal");
		btnOctal.setBounds(530, 220, 68, 38);
		btnOctal.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		btnOctal.addActionListener(e13 -> {
			int a = Integer.parseInt(tfDisplay.getText());
			tfDisplay.setText(Integer.toString(a, 8));
		});
		frame.getContentPane().add(btnOctal);
	}
}
