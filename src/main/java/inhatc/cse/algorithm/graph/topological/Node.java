package inhatc.cse.algorithm.graph.topological;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Node {


    private String name;

    private int index;

    private boolean visited; // 방문여부

    public Node(String name, int index) {
        this.name = name;
        this.index = index;
        this.visited=false;
  }
}
