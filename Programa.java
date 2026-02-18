package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("quantos contribuintes? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("pessoa fisica ou juridica (f/j)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("renda anual: ");
            double renda = sc.nextDouble();

            if (tipo == 'f') {
                System.out.print("gastos com saude: ");
                double saude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, renda, saude));
            } else {
                System.out.print("numero de funcionarios: ");
                int func = sc.nextInt();
                lista.add(new PessoaJuridica(nome, renda, func));
            }
        }

        double total = 0;
        System.out.println("\nimpostos pagos:");
        for (Contribuinte c : lista) {
            double imposto = c.calcularImposto();
            System.out.printf("%s: R$ %.2f%n", c.getNome(), imposto);
            total += imposto;
        }

        System.out.printf("total de impostos: R$ %.2f%n", total);
        sc.close();
    }
}
