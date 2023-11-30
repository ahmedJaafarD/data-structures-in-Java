public class Main {

    public static void main(String[] args) {

    // all the code written in this file serve to test the Heap ds class

        //---- this part of the code test the insert method-----//
        System.out.println("test number 1 insert");


        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());


        myHeap.insert(100);

        System.out.println(myHeap.getHeap());


        myHeap.insert(75);

        System.out.println(myHeap.getHeap());


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            [99, 72, 61, 58]
            [100, 99, 61, 58, 72]
            [100, 99, 75, 58, 72, 61]

        */


        //---- this part of the code test the remove method-----//
        System.out.println("test number 2 remove");

        Heap myHeap2 = new Heap();
        myHeap2.insert(95);
        myHeap2.insert(75);
        myHeap2.insert(80);
        myHeap2.insert(55);
        myHeap2.insert(60);
        myHeap2.insert(50);
        myHeap2.insert(65);

        System.out.println(myHeap2.getHeap());


        myHeap2.remove();

        System.out.println(myHeap2.getHeap());


        myHeap2.remove();

        System.out.println(myHeap2.getHeap());


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]

        */


        //---- this part of the code test the sinkDown method-----//
        System.out.println("test number 3 sinkDown ");


        Heap myHeap3 = new Heap();
        myHeap3.insert(95);
        myHeap3.insert(75);
        myHeap3.insert(80);
        myHeap3.insert(55);
        myHeap3.insert(60);
        myHeap3.insert(50);
        myHeap3.insert(65);

        System.out.println(myHeap3.getHeap());


        myHeap3.remove();

        System.out.println(myHeap3.getHeap());


        myHeap3.remove();

        System.out.println(myHeap3.getHeap());


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]

        */





    }

}