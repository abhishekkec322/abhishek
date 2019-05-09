package prep_2019;

import java.util.Collections;
import java.util.Stack;

//Solace - Codility

public class MaximumAmplitudeOfBinaryTreeDFSSearch {
    public static void main(String[] args) {
        Tree T = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T2 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T3 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T4 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T5 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T6 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T7 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        Tree T8 = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null, null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
        
        System.out.println("max amplitude is " + solution(T));
        System.out.println("max amplitude is " + solution(T2));
        System.out.println("max amplitude is " + solution(T3));
        System.out.println("max amplitude is " + solution(T4));
        System.out.println("max amplitude is " + solution(T5));
        System.out.println("max amplitude is " + solution(T6));
        System.out.println("max amplitude is " + solution(T7));
        System.out.println("max amplitude is " + solution(T8));
        
    }

    public static int solution(Tree T) {
        int maxAmplitude = -1;
        Stack<Integer> path = new Stack<>();
        maxAmplitude = dfs(T, path, maxAmplitude);
        return maxAmplitude;
    }

    public static int dfs(Tree T, Stack<Integer> path, int maxAmplitude) {
        path.push(T.x);
        if (T.l != null) {
            maxAmplitude = dfs(T.l, path, maxAmplitude);
        }
        if (T.r != null) {
            maxAmplitude = dfs(T.r, path, maxAmplitude);
        }
        int amplitude = Collections.max(path) - Collections.min(path);
        path.pop();
        if (maxAmplitude < amplitude)
            return amplitude;
        else
            return maxAmplitude;
    }
}

class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(int x, Tree l, Tree r) {
        this.x = x;
        this.l = l;
        this.r = r;
    }
}