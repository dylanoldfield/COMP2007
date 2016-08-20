package mstParts;

import java.util.ArrayList;


/**
 * Created by Dylan Oldfield on 20/08/2016.
 * For COMP2007 Assignment 1 - Creating a MST from given graph
 */
public class AdjacencyList {

    private int size;
    private ArrayList<ArrayList<Vertex>> arr;

    public AdjacencyList(int size)
    {
        this.size = size;
        this.arr = new ArrayList<ArrayList<Vertex>>(size);
    }

    /**
     * this function adds a linked list to the ArrayList arr, it will hold vertex's that Vertex(index)
     * has edges to. Only is used for addNormalNode function.
     * @param index is the Vertex that is having a linked list
     */

    private void addArray(int index)
    {
        if (arr.get(index) == null)
        {
            ArrayList<Vertex> toadd = new ArrayList<Vertex>();
            arr.add(index,toadd);
        }

        return;
    }


    /**
     * This function adds nodes to the array list arr to establish edges between two vertices
     * by default these vertices will not be in set A
     * @param v1 vertex 1
     * @param v2 vertex 2
     * @param weight edge weight between them
     */
    public void addNormalNode(int v1, int v2, double weight)
    {
        Vertex node1 = new Vertex(v1, weight);
        Vertex node2 = new Vertex(v2, weight);

        if(arr.get(v1) == null)
        {
            addArray(v1);
        }
        if(arr.get(v2) == null)
        {
            addArray(v2);
        }

        arr.get(v2).add(v1,node1);
        arr.get(v1).add(v2,node2);

    }

    /**
     * Returns the edges that are linked to a vertex
     * @param v - vertex that is looked at
     * @return
     */
    public ArrayList<Vertex> getConnections (int v)
    {
        return arr.get(v);
    }


}

