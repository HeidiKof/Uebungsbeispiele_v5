package LinkedList;

public class TrainDemoApp {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.add(5);
        linkedList.add(37);
        linkedList.add(19);
        linkedList.add(22);
        linkedList.add(69);
        linkedList.add(420);

        linkedList.printAllNodes();
        System.out.println();

        System.out.println("linkedList.containsValue(87) = " + linkedList.containsValue(87));
        System.out.println("linkedList.containsValue(5) = " + linkedList.containsValue(5));
        System.out.println("linkedList.containsValue(19) = " + linkedList.containsValue(19));

        System.out.println(linkedList.getAt(3).value);

        linkedList.addElement(3, 12);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.addElement(1, 7);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.addElement(9, 102);
        linkedList.printAllNodes();


    }
}
