package com.pk.algos.models.trie;

import java.util.Map;

/**
 * Holds a single trie child
 *
 * @author praveenkamath
 **/
public class TrieNode {

    private Character                   vaue;

    private Map<Character, TrieNode> child;

    private boolean                     isCompleteWord;

    public TrieNode() {
    }

    public TrieNode(Character value, Map<Character, TrieNode> child, boolean isCompleteWord) {
        this.vaue           =   value;
        this.child          =   child;
        this.isCompleteWord =   isCompleteWord;
    }

    public Character getVaue() {
        return vaue;
    }

    public void setVaue(Character vaue) {
        this.vaue = vaue;
    }

    public Map<Character, TrieNode> getChild() {
        return child;
    }

    public void setChild(Map<Character, TrieNode> child) {
        this.child = child;
    }

    public boolean isCompleteWord() {
        return isCompleteWord;
    }

    public void setCompleteWord(boolean completeWord) {
        isCompleteWord = completeWord;
    }
}
