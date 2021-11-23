package m05Strings;

import java.util.Scanner;

/*
Sistema: twitanon: Sistema de envio de mensagens anônimas
Conteúdos praticados: String, Arrays, Laços, Tipos e Comandos

- Solicitar nome diretamente no login.
- O nome deve ter no máximo 20 caracteres.
- Exibir menu: Listar (l), Escrever (e) ou Sair (x).
- Se o usuário informar "e", perguntar por uma mensagem.
- A mensagem deve ter no máximo 140 caracteres.
- Adicionar a mensagem a uma lista de mensagens no formato "Usuário: mensagem"
- Voltar ao menu inicial.
- Se o usuário informar "l", listar as últimas 10 mensagens e reexibir o menu.
- Se o usuário informar "x", finalizar o programa.
- Caso ocorra qualquer situação de exceção, como caracteres a mais, escrever a exceção e finalizar o programa.
 */
public class ExercicioTwitanon {
    public static void main(String[] args) {
        String nomeUsuario = solicitaNomeUsuario();
        System.out.printf("Olá %s! \n", nomeUsuario);
        menuOpcoesEscreverEListarMensagensPorUsuario(nomeUsuario);
    }

    private static void menuOpcoesEscreverEListarMensagensPorUsuario(String nomeUsuario) {
        Character escolhaMenu = 'X';
        String mensagem;
        int limiteMensagens = 10;
        String[] mensagens = new String[limiteMensagens]; // sou obrigada a definir a quantidade de posições em um array de strings?
        int countIndexMensagens = 0;
        do {
            System.out.println("\nDigite: \n L - para Listar \n E - para Escrever \n X - para Sair");
            escolhaMenu = new Scanner(System.in).nextLine().charAt(0); // TODO corrigir: se só der um enter, da erro :(
            switch (escolhaMenu) {
                case 'L':
                case 'l':
                    if (mensagens[0] != null) {
                        System.out.printf("Mensagens do usuário %s:\n", nomeUsuario);
                        for (int i = 0; i < mensagens.length; i++) {
                            if (mensagens[i] != null) {
                                System.out.println(i + " - " + mensagens[i]);
                            }
                        }
                    } else {
                        System.out.printf("Ainda não há mensagem incluída para o usuário %s\n", nomeUsuario);
                    }
                    break;
                case 'E':
                case 'e':
                    if (countIndexMensagens >= limiteMensagens) {
                        System.out.printf("\nChegamos no LIMITE da capacidade de mensagens para o usuário %s!\n", nomeUsuario);
                        break;
                    }
                    System.out.printf("\nDigite uma mensagem até 140 caracteres:\n");
                    mensagem = new Scanner(System.in).nextLine();
                    if (mensagem.isEmpty()) {
                        System.out.println("Mensagem inválida! NULL");
                        break;
                    } else if (mensagem.isBlank()) {
                        System.out.println("Mensagem inválida! VAZIO");
                        break;
                    } else if (mensagem.trim().length() > 140) {
                        System.out.println("Mensagem deve ter até 140 caracteres!");
                        break;
                    } else {
                        mensagens[countIndexMensagens] = mensagem;
                        countIndexMensagens++;
                        break;
                    }
                case 'X':
                case 'x':
                    System.out.printf("\n TCHAU %s :) \n", nomeUsuario);
                    break;
                default:
                    System.out.println("OPÇÃO NÃO RECONHECIDA!");
                    break;
            }
        } while ((escolhaMenu != 'X') && (escolhaMenu != 'x')); // while para o menu
    }

    private static String solicitaNomeUsuario() {
        String nomeUsuario;
        do {
            System.out.println("Digite o nome do usuário, por favor:");
            nomeUsuario = new Scanner(System.in).nextLine();
            if (nomeUsuario.isEmpty()) {
                System.out.println("Nome inválido! NULL");
            } else if (nomeUsuario.isBlank()) {
                System.out.println("Nome inválido! VAZIO");
            } else if (nomeUsuario.trim().length() > 20) {
                System.out.println("Nome deve ter até 20 caracteres!");
            } else {
                return nomeUsuario;
            }
        } while (true); // while para solicitar o nome do usuário!
    }
}
