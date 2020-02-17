package cursolerolero.dao;
import java.sql.*;
import java.util.List;

public class DAO {

	public static Connection getConexao() throws SQLException 
	{
		Connection conexao = null;
        if ( conexao == null ) {
            try {
                Class.forName("com.mysql.jdbc.Driver");                    
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursolerolero", "root", "");
                System.out.println("Conexão realizada com sucesso!");
            }
            catch( ClassNotFoundException e ) {
                System.out.println(e.getMessage());
            }
        }
        return conexao;
    }

    public static void salvarOuAtualizarNoBanco(Modelo m) throws SQLException  
    {   
        try {
            Connection conexao = getConexao();
            
            String sql;
            if ( a.getId() == 0 ) {
                sql = "INSERT INTO alunos (cpf, email, celular, cep, cidade, bairro, endereco, nome, login, senha) VALUES (?,?,?,?,?,?,?,?,?,?)";
            } else {
                sql = "UPDATE alunos SET cpf=?, email=?, celular=?, cep=?, cidade=?, bairro=?, endereco=?, nome=?, login=?, senha=? WHERE id=?"; 
            }
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getCpf());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getCelular());
            ps.setString(4, a.getCep());
            ps.setString(5, a.getCidade());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getEndereco());
            ps.setString(8, a.getNome());
            ps.setString(9, a.getLogin());
            ps.setString(10, a.getSenha());
            
            if(a.getId() != 0)
                ps.setInt(11, a.getId());
            
            
            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    /*
    public List<Optional> getAll(String tableName, String modelName)
    {   
        ArrayList<Optional> resultado = new ArrayList<>();
        try
        {
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();       
            ResultSet rs = stmt.executeQuery("select * from "+tableName);
            while( rs.next() ) {
                Class classe = Class.forName(modelName);
                Optional model = (Optional) classe.newInstance();
                
                for (String pa : model.getParams) {
                    model[pa] = 
                }

                //Pega o conteúdo da coluna "codigo" do ResultSet (rs)
                contato.setId(rs.getInt("id") );
                //Pega o conteúdo da coluna "nome" do ResultSet (rs)
                contato.setNome( rs.getString("nome") );
                //Pega o conteúdo da coluna "setor" do ResultSet (rs)
                contato.setIdade(rs.getInt("idade") );
                //Adiciona o objeto criado na ArrayList resultado
                resultado.add(contato);
            }
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    */


}
