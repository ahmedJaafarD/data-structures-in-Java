public class Main {

    public static void main(String[] args) {

    // all the code written in this file serve to test the HashTable ds class

        //---- this part of the code test the Set method-----//
        System.out.println("test number 1 Set");

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */


        //---- this part of the code test the Get method-----//
        System.out.println("test number 2 Get");

        HashTable myHashTable2 = new HashTable();

        myHashTable2.set("nails", 100);
        myHashTable2.set("tile", 50);
        myHashTable2.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( myHashTable2.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable2.get("bolts") );


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */


        //---- this part of the code test the Keys method-----//
        System.out.println("test number 3 Keys");

        HashTable myHashTable3 = new HashTable();

        myHashTable3.set("paint", 20);
        myHashTable3.set("bolts", 40);
        myHashTable3.set("nails", 100);
        myHashTable3.set("tile", 50);
        myHashTable3.set("lumber", 80);

        System.out.println( myHashTable3.keys() );

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	[paint, bolts, nails, tile, lumber]

    	*/



    }

}