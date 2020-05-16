
package hash;

import java.util.Scanner;

public class OperadorHash {
    public static void main(String[] args) {
        // TODO code application logic here
        int num, op, pos, tam = 8;
        Scanner entrada = new Scanner(System.in);
        
        TabelaHashing tabela = new TabelaHashing(tam);

        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Mostrar tabela hashing");
            System.out.println("3 - Excluir elemento");
            System.out.println("4 - Sair");
            System.out.println("Digite sua opção: ");

            op = entrada.nextInt();

            if (op < 1 || op > 4) {
                System.out.println("Opção inválida!");
            } else {
                switch (op) {
                    case 1:
                        System.out.println("Digite um número:");
                        num = entrada.nextInt();
                        tabela.inserir(num);
                        break;
                    case 2:
                        tabela.mostrarTabela();
                        break;
                    case 3:
                        System.out.println("Digite um número:");
                        num = entrada.nextInt();
                        tabela.remover(num);
                        break;
                }

            }

        } while (op != 4);
        
        entrada.close();
    }

}
