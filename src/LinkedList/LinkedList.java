package LinkedList;

public class LinkedList {

    Node first;
    Node last;

    public void add(int value) {

        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null) {
            first = newWagon;
            last = newWagon;
        } else {
            last.next = newWagon;
            last = newWagon;

        }
    }

    public void printAllNodes() {
        Node current = first;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    public int containsValue(int value) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public Node getAt(int position) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (position == index) {
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    public void deleteAt(int position) {
        Node current = first;
        int index = 1;
        position = position - 1;

        if (position == 0) {
            first = first.next;
            current.next = null;
        } else {
            while (current != null) {
                if (position == index) {
                    Node deleteNode = current.next;
                    current.next = current.next.next;

                    deleteNode.next = null;

                    if (deleteNode == last) {
                        last = current;
                    }
                    break;
                }
                current = current.next;
                index++;
            }
        }
    }

    public void addElement(int position, int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        Node current = first;
        int index = 1;
        position = position - 1;

        if (position == 0) {
            first = newWagon;
            newWagon.next = current;
            return;
        } else {
            while (current != null) {
                if (position == index) {
                    Node next = current.next;
                    current.next = newWagon;
                    newWagon.next = next;
                    if (current == last) {
                        last = newWagon;
                    }
                    break;
                }
                current = current.next;
                index++;
            }
        }
    }

    public void changeValue(int position, int newValue){
        Node current = first;
        int index = 1;
        while (current != null) {
            if (position == index) {
                current.value = newValue;
                break;
            }
            current = current.next;
            index++;
        }
    }
}
