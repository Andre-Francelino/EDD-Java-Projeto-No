package com.projetono;

public class MainNoRefatoracao {
    public static void main(String[] args) {

        NoRefatoracao<String> no1 = new NoRefatoracao<>("Conteúdo nó 1");

        NoRefatoracao<String> no2 = new NoRefatoracao<>("Conteúdo nó 2");
        no1.setProximoNo(no2);

        NoRefatoracao<String> no3 = new NoRefatoracao<>("Conteúdo nó 3");
        no2.setProximoNo(no3);

        NoRefatoracao<String> no4 = new NoRefatoracao<>("Conteúdo nó 4");
        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println("Imprimindo nó 1: " + no1);
        System.out.println("Imprimindo referência de nó 1: " + no1.getProximoNo());
        System.out.println("imprimindo nó 2: " + no2);
        System.out.println("Imprimindo referência de nó 2: " + no2.getProximoNo());
        System.out.println("Imprimindo nó 3: " + no3);
        System.out.println("Imprimindo referência de nó 3: " + no3.getProximoNo());
        System.out.println("Imprimindo nó 4: " + no4);
        System.out.println("Imprimindo referência de nó 4: " + no4.getProximoNo() + "\n");

        System.out.println("========== Encadeamento de Nó ==========");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
