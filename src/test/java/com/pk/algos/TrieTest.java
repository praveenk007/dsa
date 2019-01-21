package com.pk.algos;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TrieTest {

    @Test
    public void testAddPass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        List<String> words = trie.getAllWords();
        assertThat(words, containsInAnyOrder(
            "hattrick","hat","hater","hates","mess","men"
        ));
    }

    @Test
    public void testAddFail() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        List<String> words = trie.getAllWords();
        assertThat(words, not(hasItem(
                "hatter"
        )));
    }

    @Test
    public void searchOnePass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.startsWith("ha"), containsInAnyOrder(
                "hattrick","hat","hater","hates","ham"
        ));
    }

    @Test
    public void searchTwoPass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.startsWith("me"), containsInAnyOrder(
                "men","mess"
        ));
    }

    @Test
    public void searchFail() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.startsWith("hat"), not(hasItem(
                "ham"
        )));
    }

    @Test
    public void containsOnePass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.contains("at"), containsInAnyOrder(
        "hat","hattrick","hates","hater"
        ));
    }

    @Test
    public void containsTwoPass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("hate");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.contains("te"), containsInAnyOrder(
                "hate","hates","hater"
        ));
    }

    @Test
    public void containsFail() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("ham");
        trie.addWord("hater");
        trie.addWord("hate");
        trie.addWord("men");
        trie.addWord("mess");
        assertThat(trie.contains(""), not(containsInAnyOrder(
                "hate","hates","hater"
        )));
    }
}
