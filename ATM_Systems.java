package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;



import javax.swing.JLabel;


import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import javax.swing.JOptionPane;



public class ATM_Systems {

	private JFrame frame;
	private JTextField textField;
	
	private JTextField jtxtInterestRate;
	private JTextField jtxtNumberOfYears;
	private JTextField jtxtAmountOfLoan;
	private JTextField jtxtMonthlyPayment;
	private JTextField jtxtTotalPayment;
	private JTextArea jtxtReceipt;
	private JPanel loanpanel;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Systems window = new ATM_Systems();
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
	public ATM_Systems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.setBounds(0, 0, 1020, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 83, 317);
		panel.setBackground(new Color(119, 136, 153));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton jbtnBalance = new JButton("");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jbtnBalance.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636091919 (2).png")));
		jbtnBalance.setBounds(10, 11, 59, 47);
		panel.add(jbtnBalance);

		JButton jbtnWithdrawal = new JButton("");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636091919 (2).png")));
		jbtnWithdrawal.setBounds(10, 218, 59, 47);
		panel.add(jbtnWithdrawal);

		 JPanel panel_1 = new JPanel();
		panel_1.setBounds(103, 11, 335, 317);
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel jlblBalance = new JLabel("Balance");
		jlblBalance.setBounds(10, 31, 89, 14);
		jlblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(jlblBalance);

		JLabel jlblLoan = new JLabel("Loan");
		jlblLoan.setBounds(243, 31, 58, 14);
		jlblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(jlblLoan);

		JLabel jlblWithdrawal = new JLabel("Withdrawal");
		jlblWithdrawal.setBounds(10, 244, 89, 14);
		jlblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(jlblWithdrawal);

		JLabel jlblDeposit = new JLabel("Deposit");
		jlblDeposit.setBounds(243, 244, 58, 14);
		jlblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(jlblDeposit);

		textField = new JTextField();
		textField.setBounds(53, 56, 226, 171);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBackground(new Color(127, 255, 212));
		panel_1.add(textField);
		textField.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(448, 11, 78, 317);
		panel_2.setBackground(new Color(119, 136, 153));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	

		JButton jbtnLoan=new JButton("");
		jbtnLoan.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
		
				
				
			}
		});
		jbtnLoan.setEnabled(false);
		jbtnLoan.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636091932.png")));
		jbtnLoan.setBounds(10, 11, 55, 47);
		panel_2.add(jbtnLoan);
		

		JButton jbtnDeposit = new JButton("");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636091932.png")));
		jbtnDeposit.setBounds(10, 221, 58, 47);
		panel_2.add(jbtnDeposit);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(69, 339, 416, 350);
		panel_3.setBackground(new Color(119, 136, 153));
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_3);

		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"2";
				textField.setText(Enternumber);
		
			}
		});
		jbtn2.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594635963024.png")));
		jbtn2.setBounds(126, 63, 54, 41);
		panel_3.add(jbtn2);

		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"3";
				textField.setText(Enternumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594635974805.png")));
		jbtn3.setBounds(207, 63, 60, 41);
		panel_3.add(jbtn3);

		JButton jbtnCancel = new JButton("");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jbtnCancel.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636146318.png")));
		jbtnCancel.setBounds(290, 63, 68, 41);
		panel_3.add(jbtnCancel);

		JButton jbtn4 = new JButton("");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"4";
				textField.setText(Enternumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594635992583.png")));
		jbtn4.setBounds(42, 131, 60, 41);
		panel_3.add(jbtn4);

		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"5";
				textField.setText(Enternumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636015788.png")));
		jbtn5.setBounds(126, 131, 59, 41);
		panel_3.add(jbtn5);

		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"6";
				textField.setText(Enternumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636027103.png")));
		jbtn6.setBounds(207, 131, 60, 41);
		panel_3.add(jbtn6);

		JButton jbtnClear = new JButton("");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		jbtnClear.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636128358.png")));
		jbtnClear.setBounds(290, 125, 68, 47);
		panel_3.add(jbtnClear);

		JButton jbtnEnter = new JButton("");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pin1=Integer.parseInt(textField.getText());
				int pin2=Integer.parseInt(textField.getText());
				int pin3=Integer.parseInt(textField.getText());
				int pin4=Integer.parseInt(textField.getText());
				
				if(pin1==1234)
				{
				jbtnBalance.setEnabled(true);
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);
			    jlblBalance.setVisible(true);
				jlblLoan.setVisible(true);
				jlblDeposit.setVisible(true);	
				jlblWithdrawal.setVisible(true);
				textField.setText("welcome");
				}
				else	if(pin2==2345)
				{
				jbtnBalance.setEnabled(true);
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);
			    jlblBalance.setVisible(true);
				jlblLoan.setVisible(true);
				jlblDeposit.setVisible(true);	
				jlblWithdrawal.setVisible(true);
				textField.setText("welcome");
				}
				else	if(pin3==3456)
				{
				jbtnBalance.setEnabled(true);
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);
			    jlblBalance.setVisible(true);
				jlblLoan.setVisible(true);
				jlblDeposit.setVisible(true);	
				jlblWithdrawal.setVisible(true);
				textField.setText("welcome");
				}
				else	if(pin4==4567)
				{
				jbtnBalance.setEnabled(true);
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);
			    jlblBalance.setVisible(true);
				jlblLoan.setVisible(true);
				jlblDeposit.setVisible(true);	
				jlblWithdrawal.setVisible(true);
				textField.setText("welcome");
				}
				else
				{
					textField.setText("INVALID");
				}
			}
		});
		jbtnEnter.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636109890.png")));
		jbtnEnter.setBounds(290, 196, 68, 47);
		panel_3.add(jbtnEnter);

		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"9";
				textField.setText(Enternumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636064800.png")));
		jbtn9.setBounds(207, 196, 60, 47);
		panel_3.add(jbtn9);

		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"8";
				textField.setText(Enternumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636051687.png")));
		jbtn8.setBounds(126, 196, 60, 47);
		panel_3.add(jbtn8);

		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"7";
				textField.setText(Enternumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594658149746.png")));
		jbtn7.setBounds(42, 196, 60, 47);
		panel_3.add(jbtn7);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636078618.png")));
		btnNewButton_6.setBounds(42, 258, 60, 47);
		panel_3.add(btnNewButton_6);

		JButton jbtn0 = new JButton("");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"0";
				textField.setText(Enternumber);
			}
		});
		jbtn0.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/zeeero.png")));
		jbtn0.setBounds(126, 258, 60, 47);
		panel_3.add(jbtn0);

		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_3.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636078618.png")));
		btnNewButton_2_3.setBounds(207, 258, 60, 47);
		panel_3.add(btnNewButton_2_3);

		JButton btnNewButton_3_3 = new JButton("");
		btnNewButton_3_3.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594636091919.png")));
		btnNewButton_3_3.setBounds(290, 258, 68, 47);
		panel_3.add(btnNewButton_3_3);
		
		JButton jbtn1 = new JButton("");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber=textField.getText()+"1";
				textField.setText(Enternumber);
			
			}
		});
		jbtn1.setIcon(new ImageIcon(ATM_Systems.class.getResource("/ATM/1594626136467.png")));
		jbtn1.setBounds(42, 63, 60, 41);
		panel_3.add(jbtn1);
		
		JLabel lblWelcomeToAshrafatm = new JLabel("WELCOME TO ASHRAF'S ATM");
		lblWelcomeToAshrafatm.setForeground(new Color(0, 0, 255));
		lblWelcomeToAshrafatm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWelcomeToAshrafatm.setBounds(90, 24, 234, 14);
		panel_3.add(lblWelcomeToAshrafatm);
		
		loanpanel = new JPanel();
		loanpanel.setBounds(536, 11, 454, 678);
		frame.getContentPane().add(loanpanel);
		loanpanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		loanpanel.setBackground(new Color(135, 206, 235));
		loanpanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(132, 348, 46, 14);
		loanpanel.add(label);
		
		JLabel jlblInterestrate = new JLabel("Interest rate");
		jlblInterestrate.setBounds(38, 35, 140, 25);
		jlblInterestrate.setFont(new Font("Tahoma", Font.BOLD, 20));
		loanpanel.add(jlblInterestrate);
		
		jtxtInterestRate = new JTextField();
		jtxtInterestRate.setBounds(242, 39, 155, 20);
		jtxtInterestRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtInterestRate.setColumns(10);
		loanpanel.add(jtxtInterestRate);
		
		JLabel jlblnofyear = new JLabel("Number of years");
		jlblnofyear.setBounds(38, 84, 177, 25);
		jlblnofyear.setFont(new Font("Tahoma", Font.BOLD, 20));
		loanpanel.add(jlblnofyear);
		
		jtxtNumberOfYears = new JTextField();
		jtxtNumberOfYears.setBounds(242, 88, 155, 20);
		jtxtNumberOfYears.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtNumberOfYears.setColumns(10);
		loanpanel.add(jtxtNumberOfYears);
		
		JLabel jlblAmountloan = new JLabel("Amount of loan");
		jlblAmountloan.setBounds(38, 131, 168, 25);
		jlblAmountloan.setFont(new Font("Tahoma", Font.BOLD, 20));
		loanpanel.add(jlblAmountloan);
		
		jtxtAmountOfLoan = new JTextField();
		jtxtAmountOfLoan.setBounds(242, 135, 155, 20);
		jtxtAmountOfLoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtAmountOfLoan.setColumns(10);
		loanpanel.add(jtxtAmountOfLoan);
		
		JLabel jlblMonthlypay = new JLabel("Monthly payment");
		jlblMonthlypay.setBounds(38, 178, 177, 25);
		jlblMonthlypay.setFont(new Font("Tahoma", Font.BOLD, 20));
		loanpanel.add(jlblMonthlypay);
		
		jtxtMonthlyPayment = new JTextField();
		jtxtMonthlyPayment.setBounds(242, 182, 155, 20);
		jtxtMonthlyPayment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtMonthlyPayment.setColumns(10);
		loanpanel.add(jtxtMonthlyPayment);
		
		JLabel jlblTotalpay = new JLabel("Total payment");
		jlblTotalpay.setBounds(38, 228, 177, 25);
		jlblTotalpay.setFont(new Font("Tahoma", Font.BOLD, 20));
		loanpanel.add(jlblTotalpay);
		
		jtxtTotalPayment = new JTextField();
		jtxtTotalPayment.setBounds(242, 232, 155, 20);
		jtxtTotalPayment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtTotalPayment.setColumns(10);
		loanpanel.add(jtxtTotalPayment);
		
		JButton btnLoan_1 = new JButton("Loan");
		btnLoan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double annualInterestRate=Double.parseDouble(jtxtInterestRate.getText());
			double monthlyInterestRate=annualInterestRate/1200;
			int numberOfYears=Integer.parseInt(jtxtNumberOfYears.getText());
			double loanAmount=Double.parseDouble(jtxtAmountOfLoan.getText());
			//====================================================================
			double monthlyPayment =loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
			String imonthlyPayment;
			imonthlyPayment=Double.toString(monthlyPayment);
			imonthlyPayment=String.format("$%.2f", monthlyPayment);
			jtxtMonthlyPayment.setText(imonthlyPayment);
		   //---------------------------------------------------------------------------------------------------------------------------
			
			double totalPayment = monthlyPayment*numberOfYears* 12;
			String itotalPayment;
			itotalPayment=String.format("$%.2f", totalPayment);
			jtxtTotalPayment.setText(itotalPayment);
			
       		}
		});
		btnLoan_1.setBounds(10, 278, 89, 23);
		btnLoan_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		loanpanel.add(btnLoan_1);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(10, 328, 431, 341);
		loanpanel.add(jtxtReceipt);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String annualInterestRate=String.format(jtxtInterestRate.getText());
				String numberOfYears=String.format(jtxtNumberOfYears.getText());
				String loanAmount=String.format(jtxtAmountOfLoan.getText());
				String monthlyPayment=String.format(jtxtMonthlyPayment.getText());
                 String totalPayment=String.format(jtxtTotalPayment.getText());
                 //=========================================================
                 int refs=1325+(int)(Math.random()*4238);
                 //=========================================================
                 Calendar timer=Calendar.getInstance();
                 timer.getTime();
                 SimpleDateFormat tTime=new SimpleDateFormat("HH:mm::ss");
                 tTime.format(timer.getTime());
                 SimpleDateFormat Tdate=new SimpleDateFormat("dd-MMM-yyyy");
                 Tdate.format(timer.getTime());
                 
                 //=============================================================
                 
                    
		jtxtReceipt.append("\t                        Loan Management System\n\t\t By ASHRAF\n"  +
                    "Reference : \t\t\t"+ refs+
                    "\n============================================================"+
                    "\nInterest rate : \t\t\t "+ annualInterestRate+
                    "\nRepayment years : \t\t"+numberOfYears+
                    "\nAmount of Loan : \t\t"+"$"+loanAmount+
                    "\nMonthly payment : \t\t "+ monthlyPayment+
                    "\nTotal payment : \t\t\t "+ totalPayment+
                    "\n============================================================="+
                    "\nDate : "+Tdate.format(timer.getTime())+
                    "\t\tTime: "+tTime.format(timer.getTime())+
                    "\n\n\t\tThank you\n");
               
                   	
				
				
				
			}
		});
		btnReceipt.setBounds(119, 278, 96, 23);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		loanpanel.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtInterestRate.setText(null);
				jtxtNumberOfYears.setText(null);
				jtxtAmountOfLoan.setText(null);
				jtxtMonthlyPayment.setText(null);
				jtxtTotalPayment.setText(null);
				jtxtReceipt.setText(null);
				
			}
		});
		btnReset.setBounds(229, 278, 89, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		loanpanel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","ATM Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(341, 278, 89, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		loanpanel.add(btnExit);
		
	
	
	
	}
}
