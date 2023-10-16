import java.util.List;
import java.util.Scanner;

import vaipraondeagencia.dominio.Pacote;
import vaipraondeagencia.jdbc.PacoteDAO;
import vaipraondeagencia.util.ValidaEntrada;

public class MenuPacote {

	private static Integer id_cliente;
	private static String preco_pacote;
	private static String cidade_origem;
	private static String cidade_destino;
	private static String hora_partida;
	private static String hora_chegada;

	
	public static void cadastrarPacote() {
		System.out.println("Cadastrando pacote");

		id_cliente = ValidaEntrada.readInteger("Id_Cliente: ");
		preco_pacote = ValidaEntrada.readString("Preço pacote: ");
		cidade_origem = ValidaEntrada.readString("Cidade Origem: ");
		cidade_destino= ValidaEntrada.readString("Cidade Destino: ");
		hora_partida= ValidaEntrada.readString("Data/Hora de partida : ");
		hora_chegada = ValidaEntrada.readString("Data/Hora de chegada: ");
		

		Pacote pacote = new Pacote();

		pacote.setId_cliente(id_cliente);
		pacote.setPreco_pacote(preco_pacote);
		pacote.setCidade_origem(cidade_origem);
		pacote.setCidade_destino(cidade_destino);
		pacote.setHora_partida(hora_partida);
		pacote.setHora_chegada(hora_chegada);

		PacoteDAO.save(pacote);

	}
	

	public static void listarPacote() {

		List<Pacote> pacote = PacoteDAO.listarPacote();

		for (int i = 0; i < pacote.size(); i++) {
			System.out.println("id_cliente: " + pacote.get(i).getId_cliente());
			System.out.println("preco_pacote: " + pacote.get(i).getPreco_pacote());
			System.out.println("cidade_origem: " + pacote.get(i).getCidade_origem());
			System.out.println("cidade_destino: " + pacote.get(i).getCidade_destino());
			System.out.println("hora_partida: " + pacote.get(i).getHora_partida());
			System.out.println("hora_chegada:" + pacote.get(i).getHora_chegada());
			System.out.println("");
		}

	}

	public static void alterarPacote() {

		int id_pacote;

		System.out.println("Alterando Pacote");
	
		id_pacote = ValidaEntrada.readInteger("Informe o id do pacote para alterar:: ");
		id_cliente = ValidaEntrada.readInteger("Id_Cliente: ");
		preco_pacote = ValidaEntrada.readString("Preço pacote: ");
		cidade_origem = ValidaEntrada.readString("Cidade Origem: ");
		cidade_destino= ValidaEntrada.readString("Cidade Destino: ");
		hora_partida= ValidaEntrada.readString("Data/Hora de partida : ");
		hora_chegada = ValidaEntrada.readString("Data/Hora de chegada: ");
		

		Pacote pacote = new Pacote();

		pacote.setId_pacote(id_pacote);
		pacote.setId_cliente(id_cliente);
		pacote.setPreco_pacote(preco_pacote);
		pacote.setCidade_origem(cidade_origem);
		pacote.setCidade_destino(cidade_destino);
		pacote.setHora_partida(hora_partida);
		pacote.setHora_chegada(hora_chegada);

		PacoteDAO.update(pacote);

	}

	public static void deletarPacote() {
		int id_pacote;

		System.out.println("Excluindo um pacote");
		id_pacote = ValidaEntrada.readInteger("Informe o ID do pacote a ser excluído: ");
	

		PacoteDAO.delete(id_pacote);

	}

}
