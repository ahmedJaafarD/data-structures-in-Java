public class Main {

    public static void main(String[] args) {


    // all the code written in this file serve to test the Graph ds class

        //---- this part of the code test the addVertex method-----//
        System.out.println("test number 1 addVertex");


        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        System.out.println("Graph:");
        myGraph.printGraph();

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[], B=[]}

        */


        //---- this part of the code test the addEdge method-----//
        System.out.println("test number 2 addEdge");

        Graph myGraph2 = new Graph();

        myGraph2.addVertex("A");
        myGraph2.addVertex("B");


        System.out.println("Graph before addEdge():");
        myGraph2.printGraph();


        myGraph2.addEdge("A", "B");


        System.out.println("\nGraph after addEdge():");
        myGraph2.printGraph();


        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before addEdge():
            {A=[], B=[]}

            Graph after addEdge():
            {A=[B], B=[A]}

        */


        //---- this part of the code test the removeEdge method-----//
        System.out.println("test number 3 removeEdge");

        Graph myGraph3 = new Graph();

        myGraph3.addVertex("A");
        myGraph3.addVertex("B");
        myGraph3.addVertex("C");

        myGraph3.addEdge("A", "B");
        myGraph3.addEdge("A", "C");
        myGraph3.addEdge("B", "C");


        System.out.println("Graph before removeEdge():");
        myGraph3.printGraph();

        myGraph3.removeEdge("A", "B");

        System.out.println("\nGraph after removeEdge():");
        myGraph3.printGraph();

        System.out.println(" ");
        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before removeEdge():
            {A=[B, C], B=[A, C], C=[A, B]}

            Graph after removeEdge():
            {A=[C], B=[C], C=[A, B]}

        */


        //---- this part of the code test the removeVertex method-----//
        System.out.println("test number 4 removeVertex");

        Graph myGraph4 = new Graph();

        myGraph4.addVertex("A");
        myGraph4.addVertex("B");
        myGraph4.addVertex("C");
        myGraph4.addVertex("D");

        myGraph4.addEdge("A", "B");
        myGraph4.addEdge("A", "C");
        myGraph4.addEdge("A", "D");
        myGraph4.addEdge("B", "D");
        myGraph4.addEdge("C", "D");


        System.out.println("Graph before removeVertex():");
        myGraph4.printGraph();

        myGraph4.removeVertex("D");

        System.out.println("\nGraph after removeVertex():");
        myGraph4.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before removeVertex():
            {A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}

            Graph after removeVertex():
            {A=[B, C], B=[A], C=[A]}

        */

    }

}