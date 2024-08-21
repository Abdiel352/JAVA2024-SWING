/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file;

/**
 *
 * @author Aluno
 */
import java.io.File;
import javax.swing.JOptionPane;
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
        {
                
                String caminho = JOptionPane.showInputDialog("Enter file or directory name: ");
                analyzePath(caminho);
        } 

        public static void analyzePath( String path )
        {
                File name = new File( path );
                if (name.exists() )
                {

                      
                        
                        JOptionPane.showMessageDialog(null,
                  String.format("%s%s%n%s%n%s%n%s%s%n%s%s%n%s%s%n%s%s",
                    name.getName(), " exists",
                        (name.isFile() ? "is a file" : "is not a file"),
                        (name.isDirectory() ? "is a directory" : "is not a directory"),
                        "Last modified: ", name.lastModified(),
                        "Length: ", name.length(),
                        "Path: ", name.getPath(),
                        "Absolute path: ", name.getAbsolutePath(),
                        "Parent: ", name.getParent()
                ),
                "File Information",
                JOptionPane.INFORMATION_MESSAGE);
                        
                        if (name.isDirectory() )
                        {
                                String[] directory = name.list();
                                System.out.println( "\n\nDirectory contents:\n");

                                for ( String directoryName : directory )
                                        System.out.println( directoryName);
                        }
                }

                else
                {
                        JOptionPane.showMessageDialog(null,String.format("%s%s ", path, "does not exist"));
                }
        }
    
}
