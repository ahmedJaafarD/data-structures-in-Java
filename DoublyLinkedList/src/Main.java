public class Main {

    public static void main(String[] args) {
    // all the code written in this file serve to test the LinkedList ds class

        //---- this part of the code test the append method-----//
        System.out.println("test number 1 append");

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        myDLL.printAll();

        System.out.println(" ");
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Doubly Linked List:
        	1
        	2

     	*/



        //---- this part of the code test the remove method-----//
        System.out.println("test number 2 remove");
        DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
        myDLL2.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL2.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL2.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL2.removeLast());

        System.out.println(" ");
    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/



        //---- this part of the code test the prepend method-----//
        System.out.println("test number 3 prepend");
        DoublyLinkedList myDLL3 = new DoublyLinkedList(2);
        myDLL3.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDLL3.printAll();

        myDLL3.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDLL3.printAll();

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Doubly Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Doubly Linked List:
            1
            2
            3

        */



        //---- this part of the code test the removeFirst method-----//
        System.out.println("test number 4 removeFirst");
        DoublyLinkedList myDLL4 = new DoublyLinkedList(2);
        myDLL4.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL4.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL4.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL4.removeFirst());

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */





        //---- this part of the code test the Get method-----//
        System.out.println("test number 5 Get");
        DoublyLinkedList myDLL5 = new DoublyLinkedList(0);
        myDLL5.append(1);
        myDLL5.append(2);
        myDLL5.append(3);


        System.out.println(myDLL5.get(3).value);

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */





        //---- this part of the code test the Set method-----//
        System.out.println("test number 6 Set");
        DoublyLinkedList myDLL6 = new DoublyLinkedList(0);
        myDLL6.append(1);
        myDLL6.append(2);
        myDLL6.append(3);

        System.out.println("DLL before set():");
        myDLL6.printList();

        myDLL6.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL6.printList();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before set():
            0
            1
            2
            3

            DLL after set():
            0
            1
            99
            3

        */






        //---- this part of the code test the insert method-----//
        System.out.println("test number 7 insert");
        DoublyLinkedList myDLL7 = new DoublyLinkedList(1);
        myDLL7.append(3);

        System.out.println("DLL before insert():");
        myDLL7.printList();

        myDLL7.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL7.printList();

        myDLL7.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL7.printList();

        myDLL7.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL7.printList();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before insert():
            1
            3

            DLL after insert(2) in middle:
            1
            2
            3

            DLL after insert(0) at beginning:
            0
            1
            2
            3

            DLL after insert(4) at end:
            0
            1
            2
            3
            4

        */






        //---- this part of the code test the removemethod-----//
        System.out.println("test number 8 remove");
        DoublyLinkedList myDLL8 = new DoublyLinkedList(1);
        myDLL8.append(2);
        myDLL8.append(3);
        myDLL8.append(4);
        myDLL8.append(5);

        System.out.println("DLL before remove():");
        myDLL8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL8.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL8.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL8.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL8.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL8.printList();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            DLL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            DLL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            DLL after remove() of last node:
            2
            4

        */


    }

}