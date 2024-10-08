package inhatc.cse.algorithm.graph.topological;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    ArrayList<Node> nodeList=new ArrayList<>();
    int [][] adjMatrix;

    public Graph(ArrayList<Node> nodeList){
        this.nodeList=nodeList;
        adjMatrix=new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i,int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void addDirectedEdge(int i,int j){
        i=i-'1';
        j=j-'1';
        adjMatrix[i][j] = 1;
    }

    @Override
    public String toString() {
        System.out.println("=== 인접 행렬 ===");
        StringBuilder sb=new StringBuilder();
        sb.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName()+"  ");
        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName() + "  ");
            for (int j : adjMatrix[i]) {
                sb.append(j+"  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }


    public void topologicalSort(){
        Stack<Node> stack=new Stack<>();
        for (Node node : nodeList) {
            if(!node.isVisited()){
                topologicalVisit(node,stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop().getName()+" ");

        }
    }

    private void topologicalVisit(Node node, Stack<Node> stack) {
        ArrayList<Node> neighbors = getNeighbors(node);
        for (Node neighbor : neighbors) {
            topologicalVisit(neighbor,stack);
        }
        node.setVisited(true);
        stack.push(node);
    }

    private ArrayList<Node> getNeighbors(Node node) {
        ArrayList<Node> neighbors=new ArrayList<>();
        int index = node.getIndex();
        for (int i = 0; i < adjMatrix.length; i++) {
            if(adjMatrix[index][i]==1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }
}
