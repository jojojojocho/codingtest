package com.codingtest.codeup.tree;

import java.util.LinkedList;

public class Node {

    private Integer data;

    private Node lc;

    private Node rc;

    public Node(Integer data) {
        this.data = data;
        this.lc =null;
        this.rc =null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;

    }

    public Node getLc() {
        return lc;
    }

    public void setLc(Node lc) {
        this.lc = lc;
    }

    public Node getRc() {
        return rc;
    }

    public void setRc(Node rc) {
        this.rc = rc;
    }
}
