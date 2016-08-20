package mstParts;

/**
 * Created by dylan on 20/08/2016.
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
