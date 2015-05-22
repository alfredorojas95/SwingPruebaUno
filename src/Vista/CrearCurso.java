package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import Diagramarefinado.Academico.StaffAcademico.Curso;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.orm.PersistentException;

public class CrearCurso extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCod;
	private JTextField TextNom;
	private JTextField textRut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCurso frame = new CrearCurso();
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
	public CrearCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNombreCurso = new JLabel("Crear curso");
		lblNombreCurso.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		JLabel lblRutProfesor = new JLabel("Asignar profesor");
		lblRutProfesor.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));

		textNombre = new JTextField();
		textNombre.setColumns(10);

		textCod = new JTextField();
		textCod.setColumns(10);

		JLabel lblNombreCurso_1 = new JLabel("Nombre curso:");

		JLabel lblCdigoCurso = new JLabel("C\u00F3digo curso:");

		JLabel lblNombreCurso_2 = new JLabel("Nombre curso:");

		TextNom = new JTextField();
		TextNom.setColumns(10);

		textRut = new JTextField();
		textRut.setColumns(10);

		JLabel lblRutProfesor_1 = new JLabel("Rut profesor:");

		JLabel labelCrear = new JLabel("");

		JLabel labelAsignar = new JLabel("");

		JLabel codigoYnombre = new JLabel("");

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * se obtiene el valor del nombre ingresado en el texfield de la
				 * ventana
				 */
				String noCur = textNombre.getText();
				/*
				 * si el texfiel tiene algun contenido entra al if
				 */
				if (textNombre.getText().trim().length() != 0) {
					/*
					 * se crea un string y se iguala a al método para crear un
					 * curso y se le pasa el valor obtenido en el texfiel y el
					 * rut de un jefe de administración ingresado en la base de
					 * datos
					 */
					String resultado = Curso.crearCurso(new Curso(noCur),
							"115749802");
					try {
						/*
						 * con el nombre del curso creado se busca su id y
						 * nombre para mostrarlos en la un label dentro de la
						 * ventana
						 */
						String condicionCurso = "nombreCurso='" + noCur + "'";
						orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(
								condicionCurso, null);
						// se obtienen los datos y se guardan en variables
						// locales
						int codCur = lormCurso.getId();
						String nomCur = lormCurso.getNombreCurso();
						/**
						 * se setea el valor del label para mostrar el código
						 * del curso y nombre del mismo para poder asignarlo a
						 * un profesor
						 */

						codigoYnombre.setText("" + codCur + "    " + nomCur);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					labelCrear.setText(resultado);
				} else {
					labelCrear.setText("no se puedo crear el curso");
				}
			}
		});

		JButton btnIngresar = new JButton("Asignar profesor");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * se obtiene los valores de los texfiel y se le asignan a variables
				 * locales
				 */
				int codigo = Integer.parseInt(textCod.getText());
				String nombreCurso = TextNom.getText();
				String rutProf = textRut.getText();
				/**
				 * si los tres no se encuentran vacios
				 */
				if ((textCod.getText().trim().length() != 0)
						&& (TextNom.getText().trim().length() != 0)
						&& (textRut.getText().trim().length() != 0)) {
					//se llama al método asignarProfesor
					String resultado2 = Curso.asignarProfesor(codigo,
							nombreCurso, rutProf, "115749802");
					// se setea el valor del laber para que indique si se creó el curso o no
					labelAsignar.setText(resultado2);
				} else {
					//si algun texfiel está vacio no se asigna el profesor
					labelAsignar.setText("No se pudo asignar");
				}
			}
		});

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu b = new Menu();
				b.pack();
				b.setLocationRelativeTo(null);
				b.setVisible(true);
				setVisible(false);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(47)
																		.addComponent(
																				lblNombreCurso,
																				GroupLayout.PREFERRED_SIZE,
																				136,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(47)
																		.addComponent(
																				lblRutProfesor,
																				GroupLayout.PREFERRED_SIZE,
																				152,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(47)
																		.addComponent(
																				lblNombreCurso_1,
																				GroupLayout.PREFERRED_SIZE,
																				95,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(49)
																		.addComponent(
																				lblCdigoCurso,
																				GroupLayout.PREFERRED_SIZE,
																				101,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				textCod,
																				GroupLayout.PREFERRED_SIZE,
																				108,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(47)
																		.addComponent(
																				textNombre,
																				GroupLayout.PREFERRED_SIZE,
																				101,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(43)
																		.addComponent(
																				lblNombreCurso_2,
																				GroupLayout.PREFERRED_SIZE,
																				101,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				TextNom,
																				GroupLayout.PREFERRED_SIZE,
																				108,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(47)
																		.addComponent(
																				btnCrear,
																				GroupLayout.PREFERRED_SIZE,
																				101,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(43)
																		.addComponent(
																				lblRutProfesor_1,
																				GroupLayout.PREFERRED_SIZE,
																				101,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				textRut,
																				GroupLayout.PREFERRED_SIZE,
																				108,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(216)
																		.addComponent(
																				btnIngresar,
																				GroupLayout.PREFERRED_SIZE,
																				151,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				codigoYnombre,
																				GroupLayout.PREFERRED_SIZE,
																				183,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				labelAsignar,
																				GroupLayout.PREFERRED_SIZE,
																				228,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(42)
																		.addComponent(
																				btnAtras,
																				GroupLayout.PREFERRED_SIZE,
																				76,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				labelCrear,
																				GroupLayout.PREFERRED_SIZE,
																				193,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(5, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(34)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNombreCurso,
																GroupLayout.PREFERRED_SIZE,
																28,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblRutProfesor,
																GroupLayout.PREFERRED_SIZE,
																28,
																GroupLayout.PREFERRED_SIZE))
										.addGap(11)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNombreCurso_1,
																GroupLayout.PREFERRED_SIZE,
																20,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblCdigoCurso,
																GroupLayout.PREFERRED_SIZE,
																20,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textCod,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(2)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																textNombre,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(15)
																		.addComponent(
																				lblNombreCurso_2,
																				GroupLayout.PREFERRED_SIZE,
																				20,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(15)
																		.addComponent(
																				TextNom,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(6)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(btnCrear)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblRutProfesor_1,
																				GroupLayout.PREFERRED_SIZE,
																				20,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(5)
																		.addComponent(
																				textRut,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(21)
																		.addComponent(
																				btnIngresar)
																		.addGap(11)
																		.addComponent(
																				labelAsignar,
																				GroupLayout.PREFERRED_SIZE,
																				14,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(44)
																		.addComponent(
																				codigoYnombre,
																				GroupLayout.PREFERRED_SIZE,
																				13,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(18)
										.addComponent(labelCrear,
												GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED, 24,
												Short.MAX_VALUE)
										.addComponent(btnAtras)
										.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}
