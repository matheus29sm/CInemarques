package dcomp.ufs.br.poo.cinema.Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeladoGerente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeladoGerente frame = new TeladoGerente();
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
	public TeladoGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle(" Menu do Gerente");
		setBounds(400, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCinemarque = new JLabel("CINEMARQUE");
		lblCinemarque.setBounds(200, 16, 184, 35);
		lblCinemarque.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 25));
		lblCinemarque.setForeground(Color.RED);
		
		JLabel lblMaisQueUm = new JLabel("Mais que um cinema, sao dois cinemas.");
		lblMaisQueUm.setBounds(194, 49, 219, 14);
		
		
		JButton botaoCadrasFilme = new JButton("Cadastrar Filme/Sessao");
		botaoCadrasFilme.setBounds(45, 197, 243, 33);
		botaoCadrasFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFilme telacadastro = new TelaCadastroFilme();
				telacadastro.setVisible(true);
                                dispose();
			}
		});
		botaoCadrasFilme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoDesconto = new JButton("Descontos");
		botaoDesconto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoDesconto.setBounds(45, 146, 125, 33);
		botaoDesconto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoListarFilmes = new JButton("Listar Filmes");
		botaoListarFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            TeladeFilmes tela = new TeladeFilmes();
                            tela.setVisible(true);
                            dispose();
			}
		});
		botaoListarFilmes.setBounds(45, 248, 235, 33);
		botaoListarFilmes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(455, 248, 85, 33);
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeladeLogin login = new TeladeLogin();
				login.setVisible(true);
                dispose();
			}
		});
		botaoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.setLayout(null);
		contentPane.add(lblCinemarque);
		contentPane.add(lblMaisQueUm);
		contentPane.add(botaoListarFilmes);
		contentPane.add(botaoVoltar);
		contentPane.add(botaoCadrasFilme);
		contentPane.add(botaoDesconto);
		
		JButton botaoFechar = new JButton("Fechar");
		botaoFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoFechar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoFechar.setBounds(443, 289, 98, 31);
		contentPane.add(botaoFechar);
	}

}