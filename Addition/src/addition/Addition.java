/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String escolha = JOptionPane.showInputDialog("Digite qual das operações básicas:");
        escolha = escolha.toUpperCase();
        
        if(escolha.equals("SOMA")){
                
            String firstNumber = JOptionPane.showInputDialog("Enter first number:");
            String secondNumber = JOptionPane.showInputDialog("Enter second number:");

            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);

            int sum = number1 + number2;

            JOptionPane.showMessageDialog(null,"A soma é " + sum, ". Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);

        }else if(escolha.equals("SUBTRAÇÃO") || escolha.equals("SUBTRACAO")){
            
            String firstNumber = JOptionPane.showInputDialog("Enter first number:");
            String secondNumber = JOptionPane.showInputDialog("Enter second number:");

            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);

            int sum = number1 - number2;

            JOptionPane.showMessageDialog(null,"A subtração é " + sum, ". Subtração de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }else if(escolha.equals("MULTIPLICAÇÂO") || escolha.equals("MULTIPLICACAO")){
            
            String firstNumber = JOptionPane.showInputDialog("Enter first number:");
            String secondNumber = JOptionPane.showInputDialog("Enter second number:");

            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);

            int sum = number1 * number2;

            JOptionPane.showMessageDialog(null,"A multiplicação é " + sum, ". Multiplicação de dois inteiros", JOptionPane.PLAIN_MESSAGE);
            
        }else if(escolha.equals("DIVISÂO") || escolha.equals("DIVISAO")){
            
            String firstNumber = JOptionPane.showInputDialog("Enter first number:");
            String secondNumber = JOptionPane.showInputDialog("Enter second number:");

            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);
            
            if(number2 == 0){
                JOptionPane.showMessageDialog(null, "Não é pósssivel dividir por zero");
            }else{

                int sum = number1 / number2;

                JOptionPane.showMessageDialog(null,"A divisão é " + sum, ". Divisão de dois inteiros", JOptionPane.PLAIN_MESSAGE);
            }
            
        }
    }
    
}
