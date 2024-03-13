/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.de.doces;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;
public class Doces extends JFrame{
    
    private JTextField qtdBrigadeiro;
    private JTextField qtdBiscoito;
    private JTextField qtdpudim;
    private JLabel label[] = new JLabel[3];
    
    public Doces(){
        super("Loja de doces");
        setLayout(new FlowLayout());
        
        Icon brigadeiro = new ImageIcon(getClass().getResource("brigadeiro.jpg"));
        Icon biscoito = new ImageIcon(getClass().getResource("biscoito.jpg"));
        Icon pudim = new ImageIcon(getClass().getResource("pudim.jpg"));
        
        label[0] = new JLabel();
        label[0].setIcon(brigadeiro);
        //add(label[0],BorderLayout.NORTH);
        
        label[1] = new JLabel();
        label[1].setIcon(biscoito);
        //add(label[1], BorderLayout.CENTER);
        
       // label[2] = new JLabel();
        //label[2].setIcon(pudim);
        //add(label[2]);
        
    }   
}
