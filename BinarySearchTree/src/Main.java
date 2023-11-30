public class Main {

    public static void main(String[] args) {

        // all the code written in this file serve to test the BinarySearchTree ds class

        //---- this part of the code test the insert method-----//
        System.out.println("test number 1 insert");

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */




        //---- this part of the code test the contains method-----//
        System.out.println("test number 2 contains");

        BinarySearchTree myBST2 = new BinarySearchTree();

        myBST2.insert(2);
        myBST2.insert(1);
        myBST2.insert(3);
        myBST2.insert(47);
        myBST2.insert(21);
        myBST2.insert(76);
        myBST2.insert(18);
        myBST2.insert(27);
        myBST2.insert(52);
        myBST2.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST2.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST2.contains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

    }

}