package com.pk.algos.sort.models;

import java.util.List;

/**
 * @author praveenkamath
 **/
public class Node {

    private String      id;

    private List<Node>  nodes;

    public Node() {
    }

    public Node(String id, List<Node> nodes) {
        this.id = id;
        this.nodes = nodes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
