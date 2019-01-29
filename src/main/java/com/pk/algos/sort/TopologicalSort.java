package com.pk.algos.sort;

import com.pk.algos.sort.models.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author praveenkamath
 **/
public class TopologicalSort {

    private Stack<Node> stack;

    private Set<Node>   visited;

    public TopologicalSort() {
        this.stack = new Stack<>();
        this.visited = new HashSet<>();
    }

    public void sort() {

    }
}
