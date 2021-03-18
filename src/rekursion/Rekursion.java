package rekursion;

public class Rekursion {

    public static void main(String[] args) {

        // System.out.println("once upon a time, there was a story that began ");
        //lesen(">");
       // System.out.println(reduce(99, 7));
    }

    //public static void lesen(String indent) {
    //  System.out.println(indent + "once upon a time, there was a story that began ");
    //    lesen("-" + indent);
    //}

    public static void reduce(int value, int stopvalue) {
        if (value == 0 || value == stopvalue) {
            return;
        }
        reduce(value - 1, stopvalue);
    }

}

