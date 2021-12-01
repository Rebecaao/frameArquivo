package br.senai.sp.jandira.arquivo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class frameArquivo extends JFrame {

	private JPanel contentPane;

	
	public frameArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arquivo:");
		lblNewLabel.setBounds(33, 21, 60, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Texto:");
		lblNewLabel_1.setBounds(33, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(33, 79, 225, 97);
		contentPane.add(textPane);
		
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBounds(42, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		ActionListener gravar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				public boolean gravar (String caminho, String conteudo){
					try {

						FileWriter arquivo = new FileWriter(caminho);
						PrintWriter gravarArquivo = new PrintWriter(arquivo);

						gravarArquivo.append(conteudo);
						gravarArquivo.close();

						return true;

						// exibe o erro se o try não executar
					} catch (IOException e) {

						System.out.println("ERRO: " + e.getMessage());
						return false;
					}
				}
				
			}
		};
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(141, 212, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
