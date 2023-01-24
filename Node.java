/**
 * This class creates nodes which wrap a generic type and point to two other Node children.
 *
 * @author TiKA
 * @date 2022-02-25
 *
 */

public class Node<T> {

    // attributes: an element, and two children

    private T element;
    private Node<T> left;
    private Node<T> right;

    // simple constructor which wraps an element and sets no children

    public Node(T el) {
        this.element = el;
        this.left = null;
        this.right = null;
    }

    // constructor for creating Nodes with children right away

    public Node(T el, Node<T> l, Node<T> r) {
        this.element = el;
        this.left = l;
        this.right = r;
    }

    // getters & setters

    public T getElement() {
        return element;
    }

    public void setElement(T el) {
        this.element = el;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight(){
        return right;
    }

    public void setLeft(Node<T> l) {
        this.left = l;
    }

    public void setRight(Node<T> r) {
        this.right = r;
    }

    // generates a string for printing, wrapping each Node in () for moderately easy viewing
    public String toString() {
        String out = "(";

        // handle an empty node (though these should not be constructable!)
        if (this.element == null) {
            out += "<null> ";
        } else {
            out += "E: " + element.toString() + " ";
        }

        // stringify the left child and any of its children
        out += "L: ";
        if (this.left == null) {
            out += "<null> ";
        } else {
            out += left.toString() + " ";
        }

        // stringify the right node and any of its children
        out += "R: ";
        if (this.right == null) {
            out += "<null>";
        } else {
            out +=  right.toString() + " ";
        }

        out += ")";

        return out;
    }
}
