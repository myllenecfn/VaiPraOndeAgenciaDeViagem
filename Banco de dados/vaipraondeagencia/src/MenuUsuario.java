import java.util.List;
import java.util.Scanner;

import vaipraondeagencia.dominio.Usuario;
import vaipraondeagencia.jdbc.UsuarioDAO;
import vaipraondeagencia.util.ValidaEntrada;
import vaipraondeagencia.util.ValidaEntrada;


public class MenuUsuario {
		
	private static String cpf;
	private static String nome;
	private static String email;
	private static String senha;
	
	public static void cadastrarUsuario() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cadastrando usuario");
		
		cpf = ValidaEntrada.readString("Cpf: ");
		nome = ValidaEntrada.readString("Nome: ");
		email = ValidaEntrada.readString("Email: ");
		senha = ValidaEntrada.readString("Senha: ");

		
		Usuario usuario = new Usuario();
		
		usuario.setCPF(cpf);
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
	
		UsuarioDAO.save(usuario);
			
	}
	
	public static void listarUsuario() {
		
	List<Usuario> usuarios=	UsuarioDAO.listarUsuarios();
	
	for (int i = 0; i < usuarios.size(); i++) {
		System.out.println("Cpf: " + usuarios.get(i).getCPF());
		System.out.println("Nome: " + usuarios.get(i).getNome());
		System.out.println("Email: " + usuarios.get(i).getEmail());
		System.out.println("Senha: " + usuarios.get(i).getSenha());
		System.out.println("");
		
	}
		
	}
	
	
	public static void alterarUsuario() {

		int id_usuario;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Alterando usuario");
		
		id_usuario = ValidaEntrada.readInteger("Informe o id do usuario para alterar: ");

		cpf = ValidaEntrada.readString("Cpf: ");
		nome = ValidaEntrada.readString("Nome: ");
		email = ValidaEntrada.readString("Email: ");
		senha = ValidaEntrada.readString("Senha: ");

		Usuario usuario = new Usuario();

		usuario.setId_usuario(id_usuario);
		usuario.setCPF(cpf);
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);

		UsuarioDAO.update(usuario);

	}
	
	
	public static void deletarUsuario() {
		int id_usuario;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Excluindo um usuario");
		id_usuario = ValidaEntrada.readInteger("Informe o ID a ser excluído:");
		
		UsuarioDAO.delete(id_usuario);
		
	}
	

}
