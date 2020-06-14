package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AllPossiblePaths {

    private  boolean[] visited;
    //keep track of nodes already included in a path
    private  boolean[] includedInPath;
    private LinkedList<Integer> queue;
    private int numberOfNodes;
    private List<Integer>[] adj;
    //to find a path you need to store the path that lead to it
    private List<Integer>[] pathToNode;

    public AllPossiblePaths(int numberOfNodes) {

        this.numberOfNodes = numberOfNodes;
        adj = new ArrayList[numberOfNodes];
        pathToNode = new ArrayList[numberOfNodes];

        for (int i = 0; i < numberOfNodes; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // add edge from u to v
    public AllPossiblePaths addEdge(int from, int to) {
        adj[from].add(to);
        //unless unidirectional: //if a is connected to b
        //than b should be connected to a
        adj[to].add(from);
        return this; //makes it convenient to add multiple edges
    }

    public void findPath(int source, int destination) {

        System.out.println("------------Single path search---------------");
        initializeSearch(source);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int src = queue.poll();
            visited[src] = true;

            if (src == destination) {
                System.out.println("Path from "+source+" to "
                        + destination+ " :- "+ pathToNode[src]);
                break; //exit loop if target found
            }

            Iterator<Integer> i = adj[src].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (! visited[n] && ! queue.contains(n)) {
                    queue.add(n);
                    pathToNode[n].addAll(pathToNode[src]);
                    pathToNode[n].add(src);
                }
            }
        }
    }

    public void findAllpaths(int source, int destination) {

        System.out.println("-----------Multiple path search--------------");
        includedInPath = new boolean[numberOfNodes];
        initializeSearch(source);
        int pathCounter = 0;

        while(! allVisited() && !queue.isEmpty()) {

            while (!queue.isEmpty()) {
                // Dequeue a vertex from queue and print it
                int src = queue.poll();
                visited[src] = true;

                if (src == destination) {

                    System.out.println("Path " + ++pathCounter + " from "+source+" to "
                            + destination+ " :- "+ pathToNode[src]);
                    //mark nodes that are included in the path, so they will not be included
                    //in any other path
                    for(int i=1; i < pathToNode[src].size(); i++) {
                        includedInPath[pathToNode[src].get(i)] = true;
                    }
                    initializeSearch(source); //initialize before restarting
                    break; //exit loop if target found
                }

                Iterator<Integer> i = adj[src].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (! visited[n] && ! queue.contains(n)
                            && ! includedInPath[n] /*ignore nodes already in a path*/) {
                        queue.add(n);
                        pathToNode[n].addAll(pathToNode[src]);
                        pathToNode[n].add(src);
                    }
                }
            }
        }
    }

    private void initializeSearch(int source) {

        queue = new LinkedList<>();
        queue.add(source);
        visited = new boolean[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            pathToNode[i]= new ArrayList<>();
        }
    }

    private boolean allVisited() {

        for( boolean b : visited) {
            if(! b ) return false; 
        }
        return true;
    }
    
    public static void main(String[] args){

        AllPossiblePaths app = new AllPossiblePaths(6);
        app.addEdge(0, 4)
        .addEdge(0, 1)
        .addEdge(1, 2)
        .addEdge(1, 4)
        .addEdge(4, 3)
        .addEdge(2, 3)
        .addEdge(2, 5)
        .addEdge(3, 5);

        app.findPath(0,5);
        app.findPath(5,0);
        app.findAllpaths(0,5);
    }
}


