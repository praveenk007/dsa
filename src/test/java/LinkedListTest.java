import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListTest {

    @Test
    public void test() {
        Integer i1 = 20;
        Integer i2 = 20;
        System.out.println(i1.equals(i2));
    }

    @Test
    public void isCyclic() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList.Node cyclic = new LinkedList.Node<Integer>(111);
        list.addAtEnd(new LinkedList.Node<Integer>(1));
        list.addAtEnd(cyclic);
        list.addAtEnd(new LinkedList.Node<Integer>(2));
        list.addAtEnd(new LinkedList.Node<Integer>(3));
        list.addAtEnd(new LinkedList.Node<Integer>(4));
        list.addAtEnd(new LinkedList.Node<Integer>(5));
        list.addAtEnd(cyclic);
        assertTrue(list.isCyclic());
    }

    @Test
    public void testLl() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addAtEnd(new LinkedList.Node<Integer>(1));
        list.addAtEnd(new LinkedList.Node<Integer>(2));
        list.addAtEnd(new LinkedList.Node<Integer>(3));
        list.addAtEnd(new LinkedList.Node<Integer>(4));
        list.addAtEnd(new LinkedList.Node<Integer>(5));
        list.displayLinkedList();
    }

    @Test
    public void isNotCyclic() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addAtEnd(new LinkedList.Node<Integer>(1));
        list.addAtEnd(new LinkedList.Node<Integer>(2));
        list.addAtEnd(new LinkedList.Node<Integer>(3));
        list.addAtEnd(new LinkedList.Node<Integer>(4));
        list.addAtEnd(new LinkedList.Node<Integer>(5));
        assertFalse(list.isCyclic());
    }
}
