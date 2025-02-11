package Challenges;

import java.util.Scanner;

public class ChallengeDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ninjas[] = new String[6];
        int contador = 0;

        while (true) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja Cadastrado");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("\n=======================");

            int menuNinja = scanner.nextInt();
            scanner.nextLine();
            switch (menuNinja) {
                case 1:
                    if(contador < ninjas.length){
                        System.out.println("Escreva o nome do ninja:");
                        ninjas[contador] = scanner.nextLine();
                        contador++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else{
                        System.out.println("Limite máximo de ninjas cadastrados excedido.");
                    }
                    break;
                case 2:
                    System.out.println("\nNinjas cadastrados:");
                    if(contador == 0){
                        System.out.println("Nenhum ninja está cadastrado");
                    }else{
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + "- " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("Nenhum ninja cadastrado para ser deletado.");
                    }else {
                        System.out.println("\nDigite o número do ninja que deseja deletar:");
                        for (int i = 0; i < contador ; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i] );
                        }
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if (index > 0 && index <= contador) {
                            for (int i = index - 1; i < contador -1; i++){
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[contador - 1] = null;
                            contador--;
                            System.out.println("Ninja deletado com sucesso!");
                        }else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default: System.out.println("Opção inválida! Tente novamente.");

            }

        }

    }
}
