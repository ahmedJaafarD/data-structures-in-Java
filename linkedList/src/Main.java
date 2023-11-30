public class Main {

    public static void main(String[] args) {
    // all the code written in this file serve to test the LinkedList ds class

      //---- this part of the code test the append method-----//
        System.out.println("test number 1 append");

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);


        myLinkedList.printAll();

        System.out.println(" ");
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Linked List:
        	1
        	2

     	*/
      // ----------------------------------------------------//


      //---- this part of the code test the removeLast method-----//
        System.out.println("test number 2 removeLast");

        LinkedList myLinkedList2 = new LinkedList(1);
        myLinkedList2.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList2.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList2.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList2.removeLast());

        System.out.println(" ");

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/

      // ----------------------------------------------------//


       //---- this part of the code test the prepend method-----//
        System.out.println("test number 3 prepend");

        LinkedList myLinkedList3 = new LinkedList(2);
        myLinkedList3.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList3.printAll();

        myLinkedList3.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList3.printAll();

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Linked List:
            1
            2
            3

        */

       // ----------------------------------------------------//




        //---- this part of the code test the removeFirst method-----//
        System.out.println("test number 4 removeFirst");

        LinkedList myLinkedList4 = new LinkedList(2);
        myLinkedList4.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList4.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList4.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList4.removeFirst());

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */


        // ----------------------------------------------------//



        //---- this part of the code test the Get method-----//
        System.out.println("test number 5 Get");

        LinkedList myLinkedList5 = new LinkedList(0);
        myLinkedList5.append(1);
        myLinkedList5.append(2);
        myLinkedList5.append(3);


        System.out.println(myLinkedList5.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */


        System.out.println(" ");
        // ----------------------------------------------------//


        //---- this part of the code test the Set method-----//
        System.out.println("test number 6 Set");

        LinkedList myLinkedList6 = new LinkedList(0);
        myLinkedList6.append(1);
        myLinkedList6.append(2);
        myLinkedList6.append(3);

        System.out.println("Linked List before set():");
        myLinkedList6.printList();

        myLinkedList6.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList6.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3

        */

        System.out.println(" ");
        // ----------------------------------------------------//


        //---- this part of the code test the insert method-----//
        System.out.println("test number 7 insert");

        LinkedList myLinkedList7 = new LinkedList(1);
        myLinkedList7.append(3);

        System.out.println("LL before insert():");
        myLinkedList7.printList();

        myLinkedList7.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList7.printList();

        myLinkedList7.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList7.printList();

        myLinkedList7.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList7.printList();


        System.out.println(" ");

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */

        // ----------------------------------------------------//


        //---- this part of the code test the remove method-----//
        System.out.println("test number 8 remove");

        LinkedList myLinkedList8 = new LinkedList(1);
        myLinkedList8.append(2);
        myLinkedList8.append(3);
        myLinkedList8.append(4);
        myLinkedList8.append(5);

        System.out.println("LL before remove():");
        myLinkedList8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList8.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList8.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList8.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList8.printList();


        System.out.println(" ");

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4

        */

        // ----------------------------------------------------//



        //---- this part of the code test the reverse method-----//
        System.out.println("test number 9 reverse");

        LinkedList myLinkedList9 = new LinkedList(1);
        myLinkedList9.append(2);
        myLinkedList9.append(3);
        myLinkedList9.append(4);

        System.out.println("LL before reverse():");
        myLinkedList9.printList();

        myLinkedList9.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList9.printList();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */

        // ----------------------------------------------------//
    }

}