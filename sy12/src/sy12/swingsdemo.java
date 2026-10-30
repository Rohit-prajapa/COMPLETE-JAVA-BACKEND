package sy12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingsdemo {
	 private JTextField txtPrincipal, txtRate, txtTime, txtInterest;
	    private JButton btnCalculate, btnClear, btnExit;
	    public swingsdemo() {
	        // Set up the frame
	        setTitle("Simple Interest Calculator");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(6, 2, 10, 10));

	        // Add components
	        add(new JLabel("Principal Amount: "));
	        txtPrincipal = new JTextField();
	        add(txtPrincipal);
	        add(new JLabel("Rate of Interest (%): "));
	        txtRate = new JTextField();
	        add(txtRate);

	        add(new JLabel("Time Period (years): "));
	        txtTime = new JTextField();
	        add(txtTime);

	        add(new JLabel("Simple Interest: "));
	        txtInterest = new JTextField();
	        txtInterest.setEditable(false);
	        add(txtInterest);
	        btnCalculate = new JButton("Calculate");
	        btnClear = new JButton("Clear");
	        btnExit = new JButton("Exit");

	        add(btnCalculate);
	        add(btnClear);
	        add(btnExit);

	        // Add action listeners
	        btnCalculate.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                calculateInterest();
	            }
	        });
	        btnClear.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                clearFields();
	            }
	        });

	        btnExit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });

	        setLocationRelativeTo(null); // Center the frame
	        setTitle(true);
	    }
	    private void setLocationRelativeTo(Object object) {
			// TODO Auto-generated method stub
			
		}
		private void add(JButton btnCalculate2) {
			// TODO Auto-generated method stub
			
		}
		private void add(JTextField txtPrincipal2) {
			// TODO Auto-generated method stub
			
		}
		private void add(JLabel jLabel) {
			// TODO Auto-generated method stub
			
		}
		private void setLayout(GridLayout gridLayout) {
			// TODO Auto-generated method stub
			
		}
		private void setDefaultCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}
		private void setSize(int i, int j) {
			// TODO Auto-generated method stub
			
		}
		private void setTitle(boolean b) {
			// TODO Auto-generated method stub
			
		}
		private void calculateInterest() {
	        try {
	            double principal = Double.parseDouble(txtPrincipal.getText());
	            double rate = Double.parseDouble(txtRate.getText());
	            double time = Double.parseDouble(txtTime.getText());

	            double interest = (principal * rate * time) / 100;
	            txtInterest.setText(String.format("%.2f", interest));
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }


	    private void clearFields() {
	        txtPrincipal.setText("");
	        txtRate.setText("");
	        txtTime.setText("");
	        txtInterest.setText("");
	    }

	    public static void main(String[] args) {
	        new swingsdemo();
	    }
	}