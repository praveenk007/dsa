package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class LinkedListStringPalindrome {

    public boolean isPalindrome(DoublyLinkedList<Character> list) {
        DoublyLinkedList.Node leftCurrent = list.getHead();
        DoublyLinkedList.Node rightCurrent = list.getEnd();
        while(leftCurrent != null && leftCurrent != rightCurrent && leftCurrent.getPrevious() != rightCurrent) {
            if(leftCurrent.getData().equals(rightCurrent.getData())) {
                leftCurrent     = leftCurrent.next();
                rightCurrent    = rightCurrent.getPrevious();
            } else {
                return false;
            }
        } return true;
    }
}
