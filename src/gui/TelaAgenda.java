package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAgenda extends JFrame{
	
	public TelaAgenda() {
		setTitle("Minha Agenda");
		setSize(310, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		criarMenu();
		criarFormulario();
	}
	
	public void criarMenu() {
		
		JMenu menuAgenda = new JMenu("Agenda");
		JMenu menuSobre = new JMenu("Sobre");
		JMenuItem itemNovo = new JMenuItem("Novo");
		menuAgenda.add(itemNovo);
		JMenuBar barra = new JMenuBar();
		barra.add(menuAgenda);
		barra.add(menuSobre);
		getContentPane().add(barra, BorderLayout.NORTH);
		
	}
	
	public void criarFormulario() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel lnome = new JLabel("Nome: ");
		JTextField fnome = new JTextField(20);
		JLabel lTelefone = new JLabel("Telefone: ");
		JTextField fTelefone = new JTextField(18);
		panel.add(lnome);
		panel.add(fnome);
		panel.add(lTelefone);
		panel.add(fTelefone);
		getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	

}
