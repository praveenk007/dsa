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
    public void isPalindrome() {
        LinkedList<Character> linkedList  = new LinkedList<>();
        linkedList.addAtEnd(new LinkedList.Node<>('m'));
        linkedList.addAtEnd(new LinkedList.Node<>('a'));
        linkedList.addAtEnd(new LinkedList.Node<>('d'));
        linkedList.addAtEnd(new LinkedList.Node<>('a'));
        linkedList.addAtEnd(new LinkedList.Node<>('m'));
        LinkedListStringPalindrome pService = new LinkedListStringPalindrome();
        boolean isPalindrome = pService.isPalindrome(linkedList);
        assertTrue(isPalindrome);
    }
}
