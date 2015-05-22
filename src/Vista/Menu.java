package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Director");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		JLabel lblSecretaria = new JLabel("Secretaria");
		lblSecretaria.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		JLabel lblJefeAdm = new JLabel("Jefe Adm");
		lblJefeAdm.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		JLabel lblProfesor = new JLabel("Profesor");
		lblProfesor.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		JButton btnMorososMatrcula = new JButton("Morosos matr\u00EDcula");
		btnMorososMatrcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MorososMatricula JFrame = new MorososMatricula();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnMorososMensualidad = new JButton("Morosos mensualidad");
		btnMorososMensualidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MorososMensualidad JFrame = new MorososMensualidad();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnIngresarPagoProfesor = new JButton("Pagos profesores");
		btnIngresarPagoProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReporteSueldoPorProfesor JFrame = new ReporteSueldoPorProfesor();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnDesactivarCurso = new JButton("Desactivar curso");
		btnDesactivarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DesactivarCurso JFrame = new DesactivarCurso();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnBalanceDelAo = new JButton("Balance del a\u00F1o");
		btnBalanceDelAo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BalanceIngresoGasto JFrame = new BalanceIngresoGasto();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnRegistrarMatrcula = new JButton("Registrar matr\u00EDcula");
		btnRegistrarMatrcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Morososdos JFrame = new Morososdos();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnRegistrarMensualidad = new JButton("Registrar mensualidad");
		btnRegistrarMensualidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarMensualidad JFrame = new RegistrarMensualidad();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnRegistrarSueldoProfesor = new JButton(
				"Registrar sueldo profesor");
		btnRegistrarSueldoProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarSueldo JFrame = new RegistrarSueldo();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnCrearCurso = new JButton("Crear curso");
		btnCrearCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearCurso JFrame = new CrearCurso();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);

			}
		});

		JButton btnInscribirAlumnoEn = new JButton("Inscribir alumno en curso");
		btnInscribirAlumnoEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InscribirAlumno JFrame = new InscribirAlumno();
				JFrame.pack();
				JFrame.setLocationRelativeTo(null);
				JFrame.setVisible(true);
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addComponent(lblSecretaria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(lblJefeAdm, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(107)
					.addComponent(lblProfesor, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(btnMorososMatrcula, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnRegistrarMatrcula, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnRegistrarSueldoProfesor, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(btnInscribirAlumnoEn, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(btnMorososMensualidad, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnRegistrarMensualidad, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnCrearCurso, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(btnIngresarPagoProfesor, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(btnDesactivarCurso, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(btnBalanceDelAo, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSecretaria, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblJefeAdm, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProfesor, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMorososMatrcula)
						.addComponent(btnRegistrarMatrcula)
						.addComponent(btnRegistrarSueldoProfesor)
						.addComponent(btnInscribirAlumnoEn))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMorososMensualidad)
						.addComponent(btnRegistrarMensualidad)
						.addComponent(btnCrearCurso))
					.addGap(21)
					.addComponent(btnIngresarPagoProfesor)
					.addGap(22)
					.addComponent(btnDesactivarCurso)
					.addGap(21)
					.addComponent(btnBalanceDelAo))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
