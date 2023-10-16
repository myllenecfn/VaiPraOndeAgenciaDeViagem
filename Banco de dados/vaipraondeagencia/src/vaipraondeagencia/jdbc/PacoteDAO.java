package vaipraondeagencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vaipraondeagencia.dominio.Pacote;

public class PacoteDAO {
	static Connection conexao = null;
	static PreparedStatement pstm = null;

	public static void save(Pacote pacote) {
		String sql = "INSERT INTO `vaipraondeagencia`.`pacote` (`id_cliente`, `preco_pacote`, `cidade_origem`, `cidade_destino`, `hora_partida`, `hora_chegada`) VALUES (?, ?, ?, ?, ?, ?);";
		try {

			conexao = ConexaoMySql.getConnection();
			pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, pacote.getId_cliente());
			pstm.setString(2, pacote.getPreco_pacote());
			pstm.setString(3, pacote.getCidade_origem());
			pstm.setString(4, pacote.getCidade_destino());
			pstm.setString(5, pacote.getHora_partida());
			pstm.setString(6, pacote.getHora_chegada());

			pstm.execute();

			System.out.println("Pacote cadastrado com sucesso!");

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



// ALTERAR DADOS
public static List<Pacote>listarPacote () {
	
	String sql = "SELECT * FROM vaipraondeagencia.pacote;";
	List<Pacote> pacotes = new ArrayList<Pacote>();
	
	ResultSet rset = null;
	
	
	try {

		conexao = ConexaoMySql.getConnection();
		pstm = conexao.prepareStatement(sql);
		rset = pstm.executeQuery();
		
		while (rset.next()) {
			Pacote pacote = new Pacote();
		
			pacote.setId_cliente(rset.getInt("id_cliente"));
			pacote.setPreco_pacote(rset.getString("preco_pacote"));
			pacote.setCidade_origem(rset.getString("cidade_origem"));
			pacote.setCidade_destino(rset.getString("cidade_destino"));
			pacote.setHora_partida(rset.getString("hora_partida"));
			pacote.setHora_chegada(rset.getString("hora_chegada"));
						
			pacotes.add(pacote);				
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
	
	return pacotes;
}

public static void update(Pacote pacote) {

	String sql = "UPDATE `vaipraondeagencia`.`pacote` SET `id_cliente` = ?, `preco_pacote` = ?, `cidade_origem` = ?, `cidade_destino` = ?, `hora_partida` = ?, `hora_chegada` = ? WHERE (`id_pacote` = ?);";

	try {

		conexao = ConexaoMySql.getConnection();
		pstm = conexao.prepareStatement(sql);

		pstm.setInt(1, pacote.getId_cliente());
		pstm.setString(2, pacote.getPreco_pacote());
		pstm.setString(3, pacote.getCidade_origem());
		pstm.setString(4, pacote.getCidade_destino());
		pstm.setString(5, pacote.getHora_partida());
		pstm.setString(6, pacote.getHora_chegada());
		
		pstm.setInt(7, pacote.getId_pacote());
		
		pstm.execute();
		
		System.out.println("Pacote alterado com sucesso!");

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

public static void delete(int id_pacote) {
	String sql = "DELETE FROM `vaipraondeagencia`.`pacote` WHERE (`id_pacote` = ?);";

	try {

		conexao = ConexaoMySql.getConnection();
		pstm = conexao.prepareStatement(sql);

		pstm.setInt(1, id_pacote);

		pstm.execute();

		System.out.println("Pacote deletado com sucesso!");

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
