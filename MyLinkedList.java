public class MyLinkedList {
    private int size;
    private Node start, end;
    public MyLinkedList() {
        size = 0;
        start = null;
        tail = null;
    }
    public int size() {
        return size;
    };

    public boolean add(String value) {
        Node temp = new Node(value);
        temp.setNext(start.getNext());
        start.setNext(temp);
        if(size == 1) {
            tail = temp;
        }
    };
    public void add(int index, String value);
    public String get(int index);
    public String set(int index, String value);
    public String toString();
    //Any helper method that returns a Node object MUST BE PRIVATE!
}