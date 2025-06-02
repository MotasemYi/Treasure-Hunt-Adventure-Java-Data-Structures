/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMR
 */
public class YildizKhouliDblLinkedList<T> {
    private YildizKhouliNode<T> head;
    private YildizKhouliNode<T> tail;
    private YildizKhouliNode<T> current;
    
    
    public void add(T data){
        YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);
        if (head == null) {
            head = tail = current = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        
        
    }

    // Add node at the beginning
    public void addFirst(T data) {
        YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);
        if (head == null) {
            head = tail = current = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }



    public void moveForward(int steps) {
        while (steps > 0 && current != null && current.next != null) {
            
            current = current.next;
            steps--;
        }
    }

    public void moveBackward(int steps) {
        while (steps > 0 && current != null && current.prev != null) {
            current = current.prev;
            steps--;
        }
    }

    // Get current node's data
    public T getCurrent() {
        return current != null ? current.data : null;
    }
    public void setCurrent(T value) {
        if (current != null) {
            current.data = value;
        }
    }

    // Reset to the start
    public void reset() {
        current = head;
    }

    // Check if at start or end
    public boolean isAtStart() {
        return current == head;
    }

    public boolean isAtEnd() {
        return current == tail;
    }

    // Optional: Print all elements
    public void printList() {
        YildizKhouliNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp == current ? " <- current" : "") + "  ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
