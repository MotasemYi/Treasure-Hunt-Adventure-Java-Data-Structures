/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Motasem
 */
public class YildizKhouliNode<T> {

    T data;
    YildizKhouliNode<T> next;
    YildizKhouliNode<T> prev;

    public YildizKhouliNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }

    public YildizKhouliNode() {
    }

}
