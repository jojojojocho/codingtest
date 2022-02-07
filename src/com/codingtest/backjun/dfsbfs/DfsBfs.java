package com.codingtest.backjun.dfsbfs;
//DFS와 BFS

import com.codingtest.codeup.tree.GraphNode;

import java.util.*;


public class DfsBfs {
    List<List<VertexNode>> bigList;
    Integer length;
    Integer iter;
    Integer start;

    public DfsBfs(Integer length, Integer iter, Integer start) {
        this.bigList = new LinkedList<>();
        this.length = length;
        this.iter = iter;
        this.start = start;
        for (int i = 0; i < length; i++) {
            bigList.add(new LinkedList<>());
        }
    }

    public void addNode(Integer from, Integer to) {
        VertexNode toNode = new VertexNode(to);
        bigList.get(from - 1).add(toNode);
    }

    class VertexNode {
        public Integer vertex;

        public VertexNode(Integer vertex) {
            this.vertex = vertex;
        }

        public Integer getVertex() {
            return vertex;
        }

        public void setVertex(Integer vertex) {
            this.vertex = vertex;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer length = sc.nextInt();
        Integer iter = sc.nextInt();
        Integer start = sc.nextInt();
        Integer start1 = start;

        DfsBfs dfsBfs = new DfsBfs(length, iter, start1);
        for (int i = 0; i < iter; i++) {
            int[] ints = new int[2];
            for (int j = 0; j < 2; j++) {
                ints[j] = sc.nextInt();
            }
            dfsBfs.addNode(ints[0], ints[1]);
            dfsBfs.addNode(ints[1], ints[0]);
        }

        //이제 선별 dfs
        Set<Integer> intSet = new HashSet<>();
        intSet.add(start1);
        System.out.print(start1 + " ");
        int cnt = 0;
        while (!(intSet.size() == Math.min(length,iter))) {
            try {
                List<VertexNode> smallList = dfsBfs.bigList.get(start1 - 1);
                Collections.sort(smallList, (a, b) -> a.vertex - b.vertex);
                Integer vertex = smallList.get(cnt).getVertex();
                if (!(intSet.contains(vertex))) {
                    intSet.add(vertex);
                    System.out.print(vertex + " ");
                    start1 = vertex;
                    cnt = 0;
                } else {
                    cnt++;
                }
            } catch (IndexOutOfBoundsException e) {
//                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println();

        //이제 bfs
        Queue<Integer> queue = new LinkedList<>();
        //이제 선별 bfs
        intSet = new LinkedHashSet<>();
        intSet.add(start);
        //System.out.print(start + " ");
        cnt = 0;
        while (!(intSet.size() == Math.min(length,iter) )) {
            try {
                List<VertexNode> smallList = dfsBfs.bigList.get(start - 1);
                Collections.sort(smallList, (a, b) -> a.vertex - b.vertex);
                for (int i = 0; i < smallList.size(); i++) {
                    queue.offer(smallList.get(i).getVertex());
                }
                Integer vertex = queue.poll();
                if (!(intSet.contains(vertex))) {
                    intSet.add(vertex);
                    //System.out.print(vertex + " ");
                    start = vertex;
                    cnt = 0;
                } else {
                    cnt++;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        for (Integer integer : intSet) {
            System.out.print(integer+" ");
        }




    }

}
