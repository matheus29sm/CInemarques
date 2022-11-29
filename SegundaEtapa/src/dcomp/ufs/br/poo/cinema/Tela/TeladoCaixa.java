package dcomp.ufs.br.poo.cinema.Tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeladoCaixa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeladoCaixa frame = new TeladoCaixa();
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
	public TeladoCaixa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Menu do Caixa");
		setBounds(600, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ir para Menu");
		mnMenu.add(mntmNewMenuItem);
		
		JMenu mnRetornar = new JMenu("Retornar");
		menuBar.add(mnRetornar);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnRetornar.add(mntmLogin);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmLogoff = new JMenuItem("Logoff");
		mnSair.add(mntmLogoff);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CINEMARQUE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 36));
		
		JLabel lblMaisQueUm = new JLabel("Mais que um cinema, sao dois cinemas.");
		
		
		JButton botaoVenderIngresso = new JButton("Vender Ingresso");
		botaoVenderIngresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            TeladeVenda tela = new TeladeVenda();
                            tela.setVisible(true);
                            dispose();
			}
		});
		botaoVenderIngresso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoCadastrarCliente = new JButton("Cadastrar Cliente");
		botaoCadastrarCliente.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            TelaCadastroCliente cadastro = new TelaCadastroCliente();
                            cadastro.setVisible(true);
                            dispose();
			}
		});
		botaoCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeladeLogin login = new TeladeLogin();
				login.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoFechar = new JButton("Fechar");
		botaoFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoFechar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoListarClientes = new JButton("Listar Clientes");
		botaoListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            TeladeClientes listar = new TeladeClientes();
                            listar.setVisible(true);
                            dispose();
			}
		});
		botaoListarClientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(219, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(208))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(224, Short.MAX_VALUE)
					.addComponent(lblMaisQueUm, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addGap(214))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(botaoListarClientes)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botaoCadastrarCliente)
									.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
									.addComponent(botaoVenderIngresso))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botaoFechar)
									.addPreferredGap(ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
									.addComponent(botaoVoltar)))
							.addGap(61))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMaisQueUm)
					.addGap(72)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaoCadastrarCliente)
						.addComponent(botaoVenderIngresso))
					.addGap(18)
					.addComponent(botaoListarClientes)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaoVoltar)
						.addComponent(botaoFechar))
					.addGap(52))
		);
		contentPane.setLayout(gl_contentPane);
	}
}