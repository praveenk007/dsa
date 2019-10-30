package com.pk.algos;

import org.junit.Test;

/**
 * @author praveenkamath
 **/
public class BinarySearchTreeTest {

    public class Employee implements Comparable<Employee> {

        private Integer age;

        public Employee(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public int compareTo(Employee employee) {
            if(this.age >= employee.getAge())
                return 1;
            return 0;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    '}';
        }
    }

    @Test
    public void testInorder() {
        BinarySearchTree<Employee> bst = new BinarySearchTree<>();
        bst.insert(new Employee(10));
        bst.insert(new Employee(12));
        bst.insert(new Employee(5));
        bst.insert(new Employee(6));
        bst.insert(new Employee(3));
        bst.insert(new Employee(7));
        bst.insert(new Employee(11));
        bst.insert(new Employee(3));

        bst.displayInOrder();
    }

    @Test
    public void testAntiClockLeafs() {
        BinarySearchTree<Employee> bst = new BinarySearchTree<>();
        bst.insert(new Employee(10));
        bst.insert(new Employee(12));
        bst.insert(new Employee(5));
        bst.insert(new Employee(6));
        bst.insert(new Employee(3));
        bst.insert(new Employee(7));
        bst.insert(new Employee(11));
        bst.insert(new Employee(3));

        bst.displayInOrder();
    }
}
