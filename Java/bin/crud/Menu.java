import java.util.Scanner;

public class Menu {

	public static void exibirMenu() {
		Scanner entrada = new Scanner(System.in);
		Integer opcao;

		System.out.println("\n");
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                BEM VINDO A VAI PARA ONDE                   |");
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                                                            |");
		System.out.println("|            ESCOLHA UMA OPÇÃO DE ACESSO                     |");
		System.out.println("|            [ 1 ] CADASTRAR USUARIO                         |");
		System.out.println("|            [ 2 ] LISTAR USUARIOS                           |");
		System.out.println("|            [ 3 ] ALTERAR USUARIO                           |");
		System.out.println("|            [ 4 ] DELETAR USUARIO                           |");
		System.out.println("|            [ 5 ] COMPRAR PACOTE                            |");
		System.out.println("|            [ 6 ] LISTAR PACOTE                             |");
		System.out.println("|            [ 7 ] ALTERAR PACOTE                            |");
		System.out.println("|            [ 8 ] DELETAR PACOTE	                         |");
		System.out.println("|            [ 99 ] FECHAR                                   |");
		System.out.println("|                                                            |");
		System.out.println("|                                                            |");
		System.out.println("+------------------------------------------------------------+");
		System.out.print("Digite a opção escolhida: ");

		try {
			opcao = entrada.nextInt();

			while (opcao != 99) {

				switch (opcao) {
				case 1 -> MenuUsuario.cadastrarUsuario();
				case 2 -> MenuUsuario.listarUsuario();
				case 3 -> MenuUsuario.alterarUsuario();
				case 4 -> MenuUsuario.deletarUsuario();
				case 5 -> MenuPacote.cadastrarPacote();
				case 6 -> MenuPacote.listarPacote();
				case 7 -> MenuPacote.alterarPacote();
				case 8 -> MenuPacote.deletarPacote();
				default -> System.out.println("Opção invalida!");
				}

				System.out.println("\n");
				System.out.println("+------------------------------------------------------------+");
				System.out.println("|                BEM VINDO A VAI PARA ONDE                   |");
				System.out.println("+------------------------------------------------------------+");
				System.out.println("|                                                            |");
				System.out.println("|            ESCOLHA UMA OPÇÃO DE ACESSO                     |");
				System.out.println("|            [ 1 ] CADASTRAR USUARIO                         |");
				System.out.println("|            [ 2 ] LISTAR USUARIOS                           |");
				System.out.println("|            [ 3 ] ALTERAR USUARIO                           |");
				System.out.println("|            [ 4 ] DELETAR USUARIO                           |");
				System.out.println("|            [ 5 ] COMPRAR PACOTE                            |");
				System.out.println("|            [ 6 ] LISTAR PACOTE                             |");
				System.out.println("|            [ 7 ] ALTERAR PACOTE                            |");
				System.out.println("|            [ 8 ] DELETAR PACOTE	                         |");
				System.out.println("|            [ 99 ] FECHAR                                   |");
				System.out.println("|                                                            |");
				System.out.println("|                                                            |");
				System.out.println("+------------------------------------------------------------+");
				System.out.print("Digite a opção escolhida: ");
				opcao = entrada.nextInt();

			}

			System.out.println("Finalizando Sistema!");
		} catch (java.util.InputMismatchException e) {
			System.out.println("Entrada inválida. Esperava-se um número inteiro.");
			exibirMenu();
		}

	}
}
