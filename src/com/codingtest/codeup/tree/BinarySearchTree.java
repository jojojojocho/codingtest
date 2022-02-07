package com.codingtest.codeup.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

    public Node root;
    public Node node1;
    public Node node2;
    public Node node3;
    public Node node4;
    public Node node5;
    public Stack stack;
    public Queue<Node> queue;

    public BinarySearchTree() {
        this.root = new Node(10);
        this.node1 = new Node(5);
        this.node2 = new Node(4);
        this.node3 = new Node(7);
        this.node4 = new Node(13);
        this.node5 = new Node(15);
        this.stack = new Stack();
        this.queue = new LinkedList();
        root.setLc(node1);
        root.setRc(node4);
        node1.setLc(node2);
        node1.setRc(node3);
        node4.setRc(node5);
    }


    public void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getData() + "->");
            preOrder(root.getLc());
            preOrder(root.getRc());
        }


    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.getLc());
            System.out.print(root.getData() + "->");
            inOrder(root.getRc());
        }
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.getLc());
            postOrder(root.getRc());
            System.out.print(root.getData() + "->");
        }
    }

    public void dfs(Node node) {


        if (stack.isEmpty() || node == null) {
            return;
        } else {
            stack.push(node.getData());
            System.out.println(stack.pop());
            //stack.push(node.getLc().getData());
            //stack.push(node.getRc().getData());
            dfs(node.getLc());
            dfs(node.getRc());
        }
    }

    public void bfs(Node node) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node nd= queue.poll();
            if (nd != null) {
                System.out.print(nd.getData()+ " ->");
                queue.offer(nd.getLc());
                queue.offer(nd.getRc());
            }
        }

    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.preOrder(binarySearchTree.root);
//        System.out.println();
//        binarySearchTree.inOrder(binarySearchTree.root);
//        System.out.println();
//        binarySearchTree.postOrder(binarySearchTree.root);
//        binarySearchTree.stack.push(10);
//        binarySearchTree.dfs(binarySearchTree.root);
        binarySearchTree.bfs(binarySearchTree.root);
    }
}
