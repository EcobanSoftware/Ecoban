package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Domain.Manager;
import Domain.RadarManager;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class SystemGUI {

	private JFrame frame;
	private boolean working = false;
	private JLabel lblStateRadar;
	private JTextField txtSanctionId;
	private JTextField txtLicense;
	private JTextField txtDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemGUI window = new SystemGUI();
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
	public SystemGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 122, 84, 86, 67, 69, 0};
		gbl_panel.rowHeights = new int[]{40, 0, 56, 28, 0, 28, 24, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblDgtSystemGui = new JLabel("DGT System GUI");
		GridBagConstraints gbc_lblDgtSystemGui = new GridBagConstraints();
		gbc_lblDgtSystemGui.insets = new Insets(0, 0, 5, 5);
		gbc_lblDgtSystemGui.fill = GridBagConstraints.VERTICAL;
		gbc_lblDgtSystemGui.gridx = 3;
		gbc_lblDgtSystemGui.gridy = 0;
		panel.add(lblDgtSystemGui, gbc_lblDgtSystemGui);
		
		JLabel lblStartstopTheRadar = new JLabel("Start/Stop the Radar:");
		GridBagConstraints gbc_lblStartstopTheRadar = new GridBagConstraints();
		gbc_lblStartstopTheRadar.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartstopTheRadar.gridx = 1;
		gbc_lblStartstopTheRadar.gridy = 1;
		panel.add(lblStartstopTheRadar, gbc_lblStartstopTheRadar);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				working = true;
				lblStateRadar.setText("Working...");
				RadarManager radar = RadarManager.getRadarmanager();
				radar.setWorking(true);
			}
		});
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.gridx = 2;
		gbc_btnStart.gridy = 1;
		panel.add(btnStart, gbc_btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				working = false;
				lblStateRadar.setText("Stoped");
				RadarManager radar = RadarManager.getRadarmanager();
				radar.setWorking(false);
			}
		});
		GridBagConstraints gbc_btnStop = new GridBagConstraints();
		gbc_btnStop.insets = new Insets(0, 0, 5, 5);
		gbc_btnStop.gridx = 3;
		gbc_btnStop.gridy = 1;
		panel.add(btnStop, gbc_btnStop);
		
		JLabel lblState = new JLabel("State:");
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.gridx = 4;
		gbc_lblState.gridy = 1;
		panel.add(lblState, gbc_lblState);
		
		lblStateRadar = new JLabel("Stoped");
		GridBagConstraints gbc_lblStateRadar = new GridBagConstraints();
		gbc_lblStateRadar.insets = new Insets(0, 0, 5, 0);
		gbc_lblStateRadar.gridx = 5;
		gbc_lblStateRadar.gridy = 1;
		panel.add(lblStateRadar, gbc_lblStateRadar);
		
		JLabel lblNewLabel = new JLabel("Register the payment of the penalty");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sanction Id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtSanctionId = new JTextField();
		GridBagConstraints gbc_txtSanctionId = new GridBagConstraints();
		gbc_txtSanctionId.insets = new Insets(0, 0, 5, 5);
		gbc_txtSanctionId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSanctionId.gridx = 4;
		gbc_txtSanctionId.gridy = 3;
		panel.add(txtSanctionId, gbc_txtSanctionId);
		txtSanctionId.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager manager = Manager.ManagerHolder();
				try {
					manager.pay(Integer.parseInt(txtSanctionId.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnPay = new GridBagConstraints();
		gbc_btnPay.insets = new Insets(0, 0, 5, 0);
		gbc_btnPay.gridx = 5;
		gbc_btnPay.gridy = 3;
		panel.add(btnPay, gbc_btnPay);
		
		JLabel lblVehicleOwnershipChange = new JLabel("Vehicle ownership change ");
		GridBagConstraints gbc_lblVehicleOwnershipChange = new GridBagConstraints();
		gbc_lblVehicleOwnershipChange.gridwidth = 2;
		gbc_lblVehicleOwnershipChange.insets = new Insets(0, 0, 5, 5);
		gbc_lblVehicleOwnershipChange.gridx = 1;
		gbc_lblVehicleOwnershipChange.gridy = 5;
		panel.add(lblVehicleOwnershipChange, gbc_lblVehicleOwnershipChange);
		
		JLabel lblLicense = new JLabel("license:");
		GridBagConstraints gbc_lblLicense = new GridBagConstraints();
		gbc_lblLicense.anchor = GridBagConstraints.EAST;
		gbc_lblLicense.insets = new Insets(0, 0, 5, 5);
		gbc_lblLicense.gridx = 3;
		gbc_lblLicense.gridy = 5;
		panel.add(lblLicense, gbc_lblLicense);
		
		txtLicense = new JTextField();
		GridBagConstraints gbc_txtLicense = new GridBagConstraints();
		gbc_txtLicense.insets = new Insets(0, 0, 5, 5);
		gbc_txtLicense.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLicense.gridx = 4;
		gbc_txtLicense.gridy = 5;
		panel.add(txtLicense, gbc_txtLicense);
		txtLicense.setColumns(10);
		
		JLabel lblNewDni = new JLabel("new DNI:");
		GridBagConstraints gbc_lblNewDni = new GridBagConstraints();
		gbc_lblNewDni.anchor = GridBagConstraints.EAST;
		gbc_lblNewDni.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewDni.gridx = 3;
		gbc_lblNewDni.gridy = 6;
		panel.add(lblNewDni, gbc_lblNewDni);
		
		txtDNI = new JTextField();
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 0, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 4;
		gbc_txtDNI.gridy = 6;
		panel.add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager manager = Manager.ManagerHolder();
				try {
					manager.changeOwner(txtLicense.getText(), txtDNI.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnChange = new GridBagConstraints();
		gbc_btnChange.gridx = 5;
		gbc_btnChange.gridy = 6;
		panel.add(btnChange, gbc_btnChange);
	}

}
