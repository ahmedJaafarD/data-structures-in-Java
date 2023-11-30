public class Main {

    public static void main(String[] args) {

    // all the code written in this file serve to test the Queue ds class

        //---- this part of the code test the enqueue method-----//
        System.out.println("test number 1 enqueue");

        Queue myQueue = new Queue(2);

        System.out.println("Before enqueue():");
        System.out.println("--------------");
        myQueue.printAll();

        myQueue.enqueue(1);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.printAll();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:

            Before enqueue():
            --------------
            First: 2
            Last: 2
            Length: 1

            Queue:
            2


            After enqueue():
            -------------
            First: 2
            Last: 1
            Length: 2

            Queue:
            2
            1

        */



        //---- this part of the code test the dequeue method-----//
        System.out.println("test number 2 dequeue");
        Queue myQueue2 = new Queue(2);
        myQueue2.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue2.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue2.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue2.dequeue());

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }

}