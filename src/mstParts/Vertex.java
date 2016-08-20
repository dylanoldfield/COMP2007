package mstParts;

/**
 * Created by Dylan Oldfield on 20/08/2016.
 * Vertex Class
 *
 * This class represents the vertices of the graph
 *
 * Key: vertex number
 * Weight: when linked in a Vertex's arraylist the edge weight between this vertex the root vertex
 */
public class Vertex {

    private int key;
    private double weight;
    Vertex next;

    public Vertex(int key, double weight) {
        this.key = key;
        this.weight = weight;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
