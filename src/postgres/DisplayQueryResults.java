/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postgres;
// Fig. 25.31: DisplayQueryResults.java
// Exibe o conteúdo da tabela Authors no
// banco de dados Books.
import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.JPanel;

public class DisplayQueryResults extends JPanel {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Algebra";
    static final String USERNAME = "diegoh";
    static final String PASSWORD = "123123";
    static String DEFAULT_QUERY = "SELECT * FROM empregado";
    private ResultSetTableModel tableModel;
    
    public DisplayQueryResults(String Consulta) {
        try {
            DEFAULT_QUERY = Consulta;
            tableModel = new ResultSetTableModel(JDBC_DRIVER, DATABASE_URL,
                    USERNAME, PASSWORD, DEFAULT_QUERY);

            JTable resultTable = new JTable(tableModel);
            add(new JScrollPane(resultTable), BorderLayout.CENTER);
            setSize(400, 200);    
        }
        catch (ClassNotFoundException classNotFound) {
            JOptionPane.showMessageDialog(null,
                    "POSTGRES driver not found", "Driver not found",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(1); // termina o aplicativo
        }
        catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database error", JOptionPane.ERROR_MESSAGE);
            tableModel.disconnectFromDatabase();
            System.exit(1);
        }
    }
}
