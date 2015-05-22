package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Morososdos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Morososdos frame = new Morososdos();
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
	public Morososdos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSecretaria = new JLabel("Secretaria");
		lblSecretaria.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registrar pago de matr\u00EDcula", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu b = new Menu();
				b.pack();
		        b.setLocationRelativeTo(null);
		        b.setVisible(true);
		        setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(135)
							.addComponent(lblSecretaria, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(101)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAtras, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblSecretaria, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAtras)
					.addGap(31))
		);
		panel.setLayout(null);
		
		JLabel lblRutEstudiante = new JLabel("Rut estudiante:");
		lblRutEstudiante.setBounds(15, 25, 92, 14);
		panel.add(lblRutEstudiante);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 31, 2, 2);
		panel.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(107, 22, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(203, 21, 102, 23);
		panel.add(btnIngresar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 50, 59, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(15, 75, 59, 14);
		panel.add(lblApellido);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setBounds(15, 100, 46, 14);
		panel.add(lblRut);
		
		JLabel lblEstadoMatrcula = new JLabel("Estado matr\u00EDcula:");
		lblEstadoMatrcula.setBounds(15, 126, 105, 14);
		panel.add(lblEstadoMatrcula);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(177, 139, 118, 23);
		panel.add(btnRegistrar);
		contentPane.setLayout(gl_contentPane);
	}
}
