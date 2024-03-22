import java.util.*;

public class Solution {

    public int maximumScore(int[] scores, int[][] edges) {
        int n = scores.length;
        List<PriorityQueue<int[]>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new PriorityQueue<>(Comparator.comparingInt(a -> a[1])));
        }
        for(int i = 0; i < edges.length; i++){
            int[] edge = edges[i];
            int from = edge[0];
            int to = edge[1];
            graph.get(to).offer(new int[]{from, scores[from]});
            graph.get(from).offer(new int[]{to, scores[to]});
            if(graph.get(to).size() > 3){
                graph.get(to).poll();
            }
            if(graph.get(from).size() > 3){
                graph.get(from).poll();
            }
        }
        int max = -1;
        for (int[] e : edges){
            for(int[] i : graph.get(e[0])){
                for(int[] j : graph.get(e[1])){
                    if(e[0] != i[0] && e[0] != j[0] && e[0] != e[1] && i[0] != j[0] && i[0] != e[1] && j[0] != e[1]){
                        max = Math.max(max, scores[e[0]] + i[1] + j[1] + scores[e[1]]);
                    }
                }
            }
        }



        return max;
    }
    void dfs(List<List<Integer>> graph, int i, int[] scores, Set<Integer> vis, int count, int sum, int prev){

    }
}