package br.edu.fatecgru.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecgru.dao.AlunoDAO;
import br.edu.fatecgru.model.Aluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroAluno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtCa;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNascimento;
	private JTextField txtEndereco;
	private JTextField txtIdade;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnConsultar;
	private JButton btnAlterar;
	private JButton btnApagar;
	private JButton btnListar;
	private TextArea txtMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("CA: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(120, 25, 44, 25);
		contentPane.add(lblNewLabel);
		
		lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(108, 61, 44, 25);
		contentPane.add(lblNome);
		
		lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(108, 97, 44, 25);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Data de Nascimento: ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(22, 133, 142, 25);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Endereço:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(83, 169, 89, 25);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(108, 206, 44, 25);
		contentPane.add(lblNewLabel_5);
		
		txtCa = new JTextField();
		txtCa.setBounds(176, 26, 478, 25);
		contentPane.add(txtCa);
		txtCa.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(176, 64, 478, 25);
		contentPane.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(176, 100, 478, 25);
		contentPane.add(txtEmail);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(176, 136, 478, 25);
		contentPane.add(txtDataNascimento);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(176, 172, 478, 25);
		contentPane.add(txtEndereco);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(176, 209, 478, 25);
		contentPane.add(txtIdade);
		
		btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNovo.setBounds(33, 261, 89, 23);
		contentPane.add(btnNovo);
		btnNovo.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				txtCa.setText(null);
				txtNome.setText(null);
				txtEndereco.setText(null);
				txtEmail.setText(null);
				txtIdade.setText(null);
				txtDataNascimento.setText(null);
				txtMostrar.setText(null);
            }
		});
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalvar.setBounds(147, 261, 89, 23);
		contentPane.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				aluno.setCaAlunos(Integer.parseInt(txtCa.getText()));
				aluno.setNomeAluno(txtNome.getText());
				aluno.setEmailAluno(txtEmail.getText());
				aluno.setDataNascimento(txtDataNascimento.getText());
				aluno.setEnderecoAluno(txtEndereco.getText());
				aluno.setIdadeAluno(Integer.parseInt(txtIdade.getText()));
				try {
					// abri o BD
					AlunoDAO dao = new AlunoDAO();
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
				}catch(Exception e1) {
					//JOptionPane.showMessageDialog(null,"Erro ao Gravar");
					JOptionPane.showMessageDialog(null,e1.getMessage());
				}

            }
		});
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnConsultar.setBounds(258, 261, 89, 23);
		contentPane.add(btnConsultar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAlterar.setBounds(372, 261, 89, 23);
		contentPane.add(btnAlterar);
		
		btnApagar = new JButton("Apagar");
		btnApagar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnApagar.setBounds(485, 261, 89, 23);
		contentPane.add(btnApagar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnListar.setBounds(599, 261, 89, 23);
		contentPane.add(btnListar);
		
		txtMostrar = new TextArea();
		txtMostrar.setBounds(33, 294, 655, 151);
		contentPane.add(txtMostrar);
	}
}
