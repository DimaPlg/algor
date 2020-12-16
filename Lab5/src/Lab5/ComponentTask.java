package Lab5;

import java.util.ArrayList;

public class ComponentTask {
    private boolean[] visited;
    private int[] component;
    private int[][] contiguity;

    public ComponentTask(int[][] adjacency) {
        this.contiguity = adjacency;
        this.visited = new boolean[adjacency.length];
        this.component = new int[adjacency.length];
        for (int i = 0; i < adjacency.length; i++) {
            this.visited[i] = false;
            this.component[i] = 0;
        }
    }
    public ArrayList<ArrayList<Integer>> FindСomponents()
    {
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
        ArrayList<Boolean> verticesUsed = new ArrayList<>();
        for(int i = 0; i < contiguity.length; i++)
        {
            verticesUsed.add(false);
        }
        for (int i = 0; i < contiguity.length; i++)
        {
            if (!verticesUsed.get(i))
            {
                ArrayList<Integer> verticesFound = new ArrayList<>();
                DepthSearch(i, verticesUsed, verticesFound);
                components.add(verticesFound);
            }
        }
        return components;
    }

    private void DepthSearch(int vertex, ArrayList<Boolean> verticesUsed, ArrayList<Integer> verticesFound) {
        verticesUsed.set(vertex, true);
        verticesFound.add(vertex);
        for (int i = 0; i < contiguity.length; i++) {
            int nextVertex = contiguity[vertex][i];
            if (!verticesUsed.get(nextVertex)) {
                DepthSearch(nextVertex, verticesUsed, verticesFound);
            }
        }
    }
}
