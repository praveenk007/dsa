import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListStringPalindromeTest {

    @Test
    public void isPalindromeOdd1() {
        DoublyLinkedList<Character> linkedList  = new DoublyLinkedList<>();
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('m'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('d'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('m'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertTrue(isPalindrome);
    }

    @Test
    public void isPalindromeOdd2() {
        DoublyLinkedList<Character> linkedList  = new DoublyLinkedList<>();
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('r'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('c'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('e'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('c'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('r'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertTrue(isPalindrome);
    }

    @Test
    public void isPalindromeEven() {
        DoublyLinkedList<Character> linkedList  = new DoublyLinkedList<>();
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('n'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('n'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertTrue(isPalindrome);
    }

    @Test
    public void isNotPalindromeOdd1() {
        DoublyLinkedList<Character> linkedList  = new DoublyLinkedList<>();
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('m'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('d'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('f'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('m'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertFalse(isPalindrome);
    }

    @Test
    public void isNotPalindromeEven() {
        DoublyLinkedList<Character> linkedList  = new DoublyLinkedList<>();
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('n'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('d'));
        linkedList.addAtEnd(new DoublyLinkedList.Node<>('a'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertFalse(isPalindrome);
    }

}
