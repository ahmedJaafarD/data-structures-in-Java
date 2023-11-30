public class Main {

    public static void main(String[] args) {

    // all the code written in this file serve to test the Stack ds class

        //---- this part of the code test the push method-----//
        System.out.println("test number 1 push");


        Stack myStack = new Stack(2);

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.printAll();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.printAll();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:

			Before push():
			--------------
			Top: 2
			Height: 1

			Stack:
			2


			After push():
			-------------
			Top: 1
			Height: 2

			Stack:
			1
			2

        */



        //---- this part of the code test the pop method-----//
        System.out.println("test number 2 pop");

        Stack myStack2 = new Stack(2);
        myStack2.push(1);

        // (2) Items - Returns 1 Node
        System.out.println(myStack2.pop().value);
        // (1) Item - Returns 2 Node
        System.out.println(myStack2.pop().value);
        // (0) Items - Returns null
        System.out.println(myStack2.pop());


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            null

        */

    }

}