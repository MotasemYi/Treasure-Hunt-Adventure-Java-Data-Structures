
public class YildizKhouliLinkedList<T> {

    private YildizKhouliNode<T> head;

    public YildizKhouliNode<T> getHead() {
        return head;
    }

    public void setHead(YildizKhouliNode<T> head) {
        this.head = head;
    }

    public void AddFirst(T data) {
        YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);

        if (head == null) {
            head = newNode;
        } else {

            newNode.next = head;
            head = newNode;
        }

    }

    public void AddLast(T data) {
        YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);

        if (head == null) {
            head = newNode;
        } else {

            YildizKhouliNode<T> temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }

            newNode.next = null;
            temp.next = newNode;

        }

    }

    void insertAfter(T data, T search) { //اضافة بالبحث عن عنصر معين 
        YildizKhouliNode<T> temp = head;

        while (temp != null && temp.data != search) {
            temp = temp.next;
        }

        if (temp != null) {
            YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            AddLast(data);
        }
    }

    public void print() {

        YildizKhouliNode<T> temp = head;

        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("cannot remove becuase the list is empty");
        } else {
            head = head.next;
        }

    }

    public void removeLast() {

        YildizKhouliNode<T> temp = head;
        if (head == null) {
            System.out.println("cannot remove becuase the list is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void addByIndex(T data, int index) {
        YildizKhouliNode<T> temp = head;
        YildizKhouliNode<T> newNode = new YildizKhouliNode<>(data);

        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (index == 0) {

            newNode.next = head;
            head = newNode;
            return;
        }
        int counter = 0;
        while (temp.next != null && counter != (index - 1)) {
            temp = temp.next;
            counter++;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;

        }

    }

    public void reverse() {
        YildizKhouliNode<T> prev = null;
        YildizKhouliNode<T> current = head;
        YildizKhouliNode<T> temp = null;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;
    }

    public void Move(int x) { // Bu method linked listin icinde 1 adim hareket etmesine sagliyor

        for (int i = 0; i < x; i++) {
            if (head == null || head.next == null) {
                break;
            } else {
                head = head.next;
            }
        }

    }

    public T getData() { // Bu method belli bir nodun datasi return etmesine saglioyr 
        return head.data;
    }

    public void SetData(T player) { // Bu method belli bir nodun datasi guncellemesine saglioyr
        head.data = player;
    }

    public T get(int index) {
        YildizKhouliNode<T> temp = head;
        int count = 0;

        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return null; // 
    }

    public int size() { // linkedd listin size don.
        YildizKhouliNode<T> temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}
