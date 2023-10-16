package vaipraondeagencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vaipraondeagencia.dominio.Usuario;

public class UsuarioDAO {
	static Connection conexao = null;
	static PreparedStatement pstm = null;
	
	public static void save(Usuario usuario) {

		String sql = "INSERT INTO `vaipraondeagencia`.`usuario` (`cpf`, `nome`, `email`, `senha`) VALUES (?, ?, ?, ?);";

		try {

			conexao = ConexaoMySql.getConnection();
			pstm = conexao.prepareStatement(sql);

			pstm.setString(1, usuario.getCPF());
			pstm.setString(2, usuario.getNome());
			pstm.setString(3, usuario.getEmail());
			pstm.setString(4, usuario.getSenha());

			pstm.execute();
			
			System.out.println("Usuario cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public static List<Usuario>listarUsuarios () {
		
		String sql = "SELECT * FROM vaipraondeagencia.usuario;";
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		ResultSet rset = null;
		
		
		try {

			conexao = ConexaoMySql.getConnection();
			pstm = conexao.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Usuario usuario = new Usuario();
			
				usuario.setCPF(rset.getString("cpf"));
				usuario.setNome(rset.getString("nome"));
				usuario.setEmail(rset.getString("email"));
				usuario.setSenha(rset.getString("senha"));
				
				usuarios.add(usuario);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return usuarios;
	}
	
	public static void update(Usuario usuario) {

		String sql = "UPDATE `vaipraondeagencia`.`usuario` SET `cpf` = ?, `nome` = ?, `email` = ?, `senha` = ? WHERE (`id_usuario` = ?);";

		try {

			conexao = ConexaoMySql.getConnection();
			pstm = conexao.prepareStatement(sql);

			pstm.setString(1, usuario.getCPF());
			pstm.setString(2, usuario.getNome());
			pstm.setString(3, usuario.getEmail());
			pstm.setString(4, usuario.getSenha());
			
			pstm.setInt(5, usuario.getId_usuario());
			
			pstm.execute();
			
			System.out.println("Usuario alterado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void delete(int id_usuario) {
		String sql = "DELETE FROM `vaipraondeagencia`.`usuario` WHERE (`id_usuario` = ?);";

		try {

			conexao = ConexaoMySql.getConnection();
			pstm = conexao.prepareStatement(sql);
			
			pstm.setInt(1, id_usuario);
			
			pstm.execute();
			
			System.out.println("Usuario deletado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	
	
	
	
}
