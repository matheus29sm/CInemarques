package dcomp.ufs.br.poo.cinema.Tela;


import dcomp.ufs.br.poo.cinema.Arquivos.EscrevenoArquivo;
import dcomp.ufs.br.poo.cinema.Arquivos.LeituradeArquivo;
import dcomp.ufs.br.poo.cinema.Recursos.Filme;
import dcomp.ufs.br.poo.cinema.Recursos.Sessao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;




public class TelaCadastroFilme extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldGenero;
	private JTextField fieldFaixa;
	private JTextField fieldDuracao;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFilme frame = new TelaCadastroFilme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
        //Gerente gerente = new Gerente();
        //Cinema cinema = new Cinema();
        Filme filme = new Filme();
        int i = 1;
        LeituradeArquivo ler = new LeituradeArquivo();
        Sessao sessao = new Sessao();
        List<Sessao> sessoes = new ArrayList();
        EscrevenoArquivo esc = new EscrevenoArquivo();
	
	private JTextField fieldNomeSala;
	private JTextField fieldDia;
	private JTextField fieldMinuto;
	private JTextField fieldCapacidade;
	private JTextField fieldHora;
	/**
	 * Create the frame.
	 */
	public TelaCadastroFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Cadastrar Filme");
		setBounds(600, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CINEMARQUE");
		lblNewLabel.setBounds(258, 16, 267, 35);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 36));
		
		JLabel lblMaisQueUm = new JLabel("Mais que um cinema, sao dois cinemas.");
		lblMaisQueUm.setBounds(292, 57, 209, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(40, 167, 59, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Genero:");
		lblNewLabel_2.setBounds(40, 211, 71, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Faixa Etaria:");
		lblNewLabel_3.setBounds(40, 255, 112, 25);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Duracao:");
		lblNewLabel_4.setBounds(40, 300, 81, 25);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));	
		
		fieldNome = new JTextField();
		fieldNome.setBounds(105, 173, 150, 20);
		fieldNome.setColumns(10);
		
		fieldGenero = new JTextField();
		fieldGenero.setBounds(115, 217, 140, 20);
		fieldGenero.setColumns(10);
		
		fieldFaixa = new JTextField();
		fieldFaixa.setBounds(156, 261, 99, 20);
		fieldFaixa.setColumns(10);
		
		fieldDuracao = new JTextField();
		fieldDuracao.setBounds(125, 306, 130, 20);
		fieldDuracao.setColumns(10);
		
		JButton botaoCadastrarFilme = new JButton("Cadastrar");
		botaoCadastrarFilme.setBounds(115, 344, 142, 33);
		
		JList list = new JList();
		list.setBounds(55, 396, 200, 200);
		
		botaoCadastrarFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            filme.setCodigo(i+ (ler.tamanhoarquivo("Filmes.txt") / 5));
			    filme.setNome(fieldNome.getText());
                            filme.setGenero(fieldGenero.getText());
                            filme.setFaixaEtaria(fieldFaixa.getText());
                            filme.setDuracao(fieldDuracao.getText());
                            esc.arquivoFilme(filme, "Filmes.txt");
                            
                            DefaultListModel model = new DefaultListModel();
		            model.addElement("Filme Adicionado!!");
			    model.addElement("___________________________");
			    model.addElement("Filme: " + filme.getNome());
	            model.addElement("Genero: \n"+ filme.getGenero());
	            model.addElement("Faixa Etaria: \n"+ filme.getFaixaEtaria());
	            model.addElement("Duracao: "+ filme.getDuracao());
	            model.addElement("___________________________");
				list.setModel(model);
                            
				
			}
		});
		 
		botaoCadastrarFilme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblFilmes = new JLabel("Cadastrar Filmes");
		lblFilmes.setBounds(105, 106, 149, 25);
		lblFilmes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelNomeSala = new JLabel("Numero da Sala:");
		labelNomeSala.setBounds(434, 167, 131, 25);
		labelNomeSala.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelDia = new JLabel("Dia:");
		labelDia.setBounds(434, 232, 37, 25);
		labelDia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelHora = new JLabel("Hora:");
		labelHora.setBounds(434, 264, 50, 25);
		labelHora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelMinuto = new JLabel("Minuto:");
		labelMinuto.setBounds(434, 296, 67, 25);
		labelMinuto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelVagas = new JLabel("Capacidade:");
		labelVagas.setBounds(434, 198, 110, 25);
		labelVagas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10 = new JLabel("Cadastrar Sessao");
		lblNewLabel_10.setBounds(434, 106, 154, 25);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		fieldNomeSala = new JTextField();
		fieldNomeSala.setBounds(575, 173, 96, 20);
		fieldNomeSala.setColumns(10);
		
		fieldDia = new JTextField();
		fieldDia.setBounds(554, 238, 117, 20);
		fieldDia.setColumns(10);
		
		fieldMinuto = new JTextField();
		fieldMinuto.setBounds(554, 302, 117, 20);
		fieldMinuto.setColumns(10);
		
		fieldCapacidade = new JTextField();
		fieldCapacidade.setBounds(554, 204, 117, 20);
		fieldCapacidade.setColumns(10);
		
		fieldHora = new JTextField();
		fieldHora.setBounds(554, 270, 117, 20);
		fieldHora.setColumns(10);
		
		JList list1 = new JList();
		list1.setBounds(473, 397, 200, 200);
		contentPane.add(list1);
		
		JButton botaoCadastSessao = new JButton("Cadastrar");
		botaoCadastSessao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            sessoes = ler.lerArquivoSessao("Sessoes.txt");
			    sessao.setNumeroDaSala(Integer.parseInt(fieldNomeSala.getText()));
                            sessao.setCapacidade(Integer.parseInt(fieldCapacidade.getText()));
                            sessao.setDia(fieldDia.getText());
                            sessao.setHora(Integer.parseInt(fieldHora.getText()));
                            sessao.setMinuto(Integer.parseInt(fieldMinuto.getText()));
                            sessoes.add(sessao);
                            esc.arquivoSessao(sessoes);
                            
                            sessoes = ler.lerArquivoSessao("Sessoes.txt");
                            for (int i = 0; i < sessoes.size(); i++) {
                                System.out.println(sessoes.get(i).getNumeroDaSala());
                            }  
                            
				
				DefaultListModel model = new DefaultListModel();
				model.addElement("Sessao Adicionada!!");
				model.addElement("___________________________");
				model.addElement("Numero da Sala: " + sessao.getNumeroDaSala());
				model.addElement("Capacidade da Sala: " + sessao.getCapacidade());
	            model.addElement("Dia da Sessao: \n"+ sessao.getDia());
	            model.addElement("Hora da Sessao: \n"+ sessao.getHora());
	            model.addElement("Minuto da Sessao: "+ sessao.getMinuto());
	            model.addElement("___________________________");
				list1.setModel(model);
			}
		});
		botaoCadastSessao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoCadastSessao.setBounds(531, 346, 142, 33);
		contentPane.setLayout(null);
		contentPane.add(list);
		contentPane.add(lblNewLabel);
		contentPane.add(lblFilmes);
		contentPane.add(lblNewLabel_10);
		contentPane.add(lblNewLabel_1);
		contentPane.add(fieldNome);
		contentPane.add(labelNomeSala);
		contentPane.add(fieldNomeSala);
		contentPane.add(lblNewLabel_2);
		contentPane.add(fieldGenero);
		contentPane.add(lblNewLabel_3);
		contentPane.add(fieldFaixa);
		contentPane.add(labelDia);
		contentPane.add(fieldDia);
		contentPane.add(labelHora);
		contentPane.add(fieldHora);
		contentPane.add(labelMinuto);
		contentPane.add(fieldMinuto);
		contentPane.add(lblNewLabel_4);
		contentPane.add(fieldDuracao);
		contentPane.add(labelVagas);
		contentPane.add(fieldCapacidade);
		contentPane.add(botaoCadastrarFilme);
		contentPane.add(lblMaisQueUm);
		contentPane.add(botaoCadastSessao);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeladoGerente gerente = new TeladoGerente();
				gerente.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoVoltar.setBounds(60, 615, 89, 23);
		contentPane.add(botaoVoltar);
		
		
		
		
	}
}
