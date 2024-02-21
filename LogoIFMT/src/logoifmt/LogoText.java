/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logoifmt;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Aluno
 */
public class LogoText extends JFrame{
    private JLabel label1;
    
    
    public LogoText(){
        super("IFMT");
        setLayout(new FlowLayout());
        Icon logo = new ImageIcon(getClass().getResource("ifmtlogo.png"));
        label1 = new JLabel();
        label1.setIcon(logo);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setText("INSTITUTO FEDERAL\n DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA\n DE MATO GROSSO");
        add(label1);
    }
}
