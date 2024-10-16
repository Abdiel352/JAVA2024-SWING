/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displayauthors;

/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class DisplayAuthors {

    /**
     * @param args the command line arguments
     */
    static final String DATABASE_URL = "jdbc:mysql://localhost/books";
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DriverManager.getConnection(DATABASE_URL,"root","admin");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT idAuthors ,FirstName,LastName FROM Authors");
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Authors Table of Books Database:\n");
            
            for(int i = 1 ; i <= numberOfColumns ; i ++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                System.out.println();
             
            while(resultSet.next()){
                for(int i = 1 ; i <= numberOfColumns ; i ++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                    System.out.println();
                
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            
        }finally{
            
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }catch(Exception exception){
                exception.printStackTrace();
            }
        }
    }
    
    
}
