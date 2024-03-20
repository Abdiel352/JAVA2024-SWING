/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jconboboxtest;

/**
 *
 * @author Aluno
 */
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
public class ComboBoxFrame extends JFrame {
    
    private JComboBox imagesJComboBox;
    private JLabel label;
    
    private static final String[] names = 
    {"a.jpg","b.jpg","c.jpg","d.jpg"};
    
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};
        
        public ComboBoxFrame(){
            super("testando Layout");
            setLayout(new FlowLayout());
            
            imagesJComboBox = new JComboBox(names);
            imagesJComboBox.setMaximumRowCount(3);
            
            imagesJComboBox.addItemListener(
                    new ItemListener()
                    {
                     public void itemStateChaged(ItemEvent event)
                     {
                         if(event.getStateChage() == ItemEvent.SELECTED)
                             label.setIcon(icons[
                                     imagesJComboBox.getSelectedIndex()]);
                     }
                    }
            );
                     
                    
            add(imagesJComboBox);
            label = new label(icons[0]);
            add(label);
    }
}
