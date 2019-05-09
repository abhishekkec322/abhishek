/*package prep_2019;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;


public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree T = new Tree(5, new Tree(8, new Tree(12, null, null), new Tree(2, null,null)),
                new Tree(9, new Tree(7, new Tree(1, null, null), null),
                        new Tree(4, new Tree(3, null, null), null)));
		System.out.println(solution(T));

	}

	public static int solution(Tree T) {

		int max = 0;
		
		if (T == null) {
			return 0;
		}
		List<Integer> maxs = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(T.x);
		list.add(T.x);
		deptFirstSearch(T, list, maxs);
		for (int i = 0; i < maxs.size(); i++)
			max = Math.max(maxs.get(i), max);
		return max;
	}

	public static void deptFirstSearch(Tree T, List<Integer> cur, List<Integer> maxs) {
		if (T.l == null && T.r == null)
			maxs.add(cur.get(1) - cur.get(0));
		if (T.l != null) {
			List<Integer> list = new ArrayList<Integer>(cur);
			if (T.l.x < list.get(0))
				list.set(0, T.l.x);
			if (T.l.x > list.get(1))
				list.set(1, T.l.x);
			deptFirstSearch(T.l, list, maxs);
		}
		if (T.r != null) {
			List<Integer> list = new ArrayList<Integer>(cur);
			if (T.r.x < list.get(0))
				list.set(0, T.r.x);
			if (T.r.x > list.get(1))
				list.set(1, T.r.x);
			deptFirstSearch(T.r, list, maxs);
		}
		return;

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
*/