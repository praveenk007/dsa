import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoublyLinkedListTest {


    @Test
    public void testDLl() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.addAtEnd(new DoublyLinkedList.Node<Integer>(1));
        list.addAtEnd(new DoublyLinkedList.Node<Integer>(2));
        list.addAtEnd(new DoublyLinkedList.Node<Integer>(3));
        list.addAtEnd(new DoublyLinkedList.Node<Integer>(4));
        list.addAtEnd(new DoublyLinkedList.Node<Integer>(5));
        list.displayLinkedList();
    }
}
