package postgres;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    
    private static boolean logado; 
    private Statement stmt;
    private ResultSet rs;
    public Connection conn;
    private static Conexao conexaoSQL = new Conexao();

    public Conexao() {
        
        String url = "jdbc:postgresql://localhost:5432/genetico";
        String usr = "diegoh";
        String pas = "123123";
        
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usr, pas);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            
//            while(rs.next()){                
//                System.out.println(rs.getString("matricula"));
//                System.out.println(rs.getString("nome"));
//                System.out.println(rs.getString("cpf"));
//            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver JDBC - ODBC não encontrado");
        } catch (SQLException ex) {
            System.err.println("Erro" + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
          
    }
    
    public ResultSet getDados() throws SQLException{
        rs = stmt.executeQuery("select * from dados;");
        return rs;
    }
    
    public ResultSet usuarioUF(String str) throws SQLException{
        rs = stmt.executeQuery("select * from aluno where uf='" + str + "';");
        return rs;
    }
    
    public ResultSet usuarioCPF(String str) throws SQLException{
        rs = stmt.executeQuery("select * from aluno where cpf='" + str + "';");
        return rs;
    }
    
    public ResultSet usuarioNome(String str) throws SQLException{
        rs = stmt.executeQuery("select * from aluno where nome like'%" + str + "%';");
        return rs;
    }
    
    public ResultSet livroTitulo(String str) throws SQLException{
        rs = stmt.executeQuery("select * from livro where titulo like'%" + str + "%';");
        return rs;
    }
    
    public boolean loginAluno(String senha, int mat) throws SQLException{
        rs = stmt.executeQuery("select * from aluno where matricula ="+ mat+" AND senha = '"+ senha+"';");
        
        if(rs.next()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getLogado(){
        return logado;
    }
    
    public void setLogado(boolean b){
        logado = b;
    }
    
    public static Conexao getBanco(){
        return conexaoSQL;
    }
}

