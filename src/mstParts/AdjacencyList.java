package mstParts;

import java.util.ArrayList;


/**
 * Created by dylan on 20/08/2016.
 */
public class AdjacencyList {

    private int size;
    private ArrayList<ArrayList<Vertex>> arr;

    public AdjacencyList(int size)
    {
        this.size = size;
        this.arr = new ArrayList<ArrayList<Vertex>>(size);
    }

    private void addArray(int index)
    {
        if (arr.get(index) == null)
        {
            ArrayList<Vertex> toadd = new ArrayList<Vertex>();
            arr.add(index,toadd);
        }

        return;
    }


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
    public void addANode(int v, double weight)
    {
        if(arr.get(v) == null)
        {
            addArray(v);
        }

        if(arr.get(v).get(0).getWeight() > weight)
        {
            arr.get(v).get(0).setWeight(weight);
        }
        return;
        Vertex node = new Vertex(v,weight);

        nodes.add(v,node);

    }

    public double getWeight(int v)
    {
        if (nodes.get(v) != null) {

            return nodes.get(v).getWeight();
        }
        return Double.MAX_VALUE;
    }




}

