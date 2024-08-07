package com.projetoDoublyNode;

public class DoublyLinkedList {
    DoublyNode head;

    // método para inserir um novo nó no final da lista
    public void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode current = head;
            while (current.next !=null) {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
        }
    }

    // Método para exibir a lista
    public void display() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
