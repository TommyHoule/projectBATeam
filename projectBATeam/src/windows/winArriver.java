package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

public class winArriver extends winHeritage {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winHeritage frame = new winArriver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public winArriver() {
		
		JPanel panelClient = new JPanel();
		panelClient.setBounds(176, 88, 525, 280);
		getContentPane().add(panelClient);
		panelClient.setLayout(null);
		
		JPanel panelReservation = new JPanel();
		panelReservation.setBounds(733, 88, 381, 280);
		getContentPane().add(panelReservation);
		panelReservation.setLayout(null);
		
		JPanel panelN = new JPanel();
		panelN.setBounds(176, 391, 938, 243);
		getContentPane().add(panelN);
		
		table = new JTable();
		panelN.add(table);
		
		JLabel lblInforClient = new JLabel("Information sur le client");
		lblInforClient.setBounds(176, 60, 152, 16);
		getContentPane().add(lblInforClient);
		
		JLabel lblInformationSurLa = new JLabel("Information sur la réservation");
		lblInformationSurLa.setBounds(733, 60, 192, 16);
		getContentPane().add(lblInformationSurLa);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
	}
}
