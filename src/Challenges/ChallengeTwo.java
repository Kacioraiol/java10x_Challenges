package Challenges;

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[100]; // Array para armazenar até 100 ninjas
        int count = 0; // Contador para armazenar a posição no array


        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    if (count < ninjas.length) {
                        System.out.print("Digite o nome do ninja: ");
                        ninjas[count] = scanner.nextLine();
                        count++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas atingido!");
                    }
                    break;
                case 2:
                    System.out.println("\nLista de Ninjas:");
                    if (count == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
