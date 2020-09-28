import java.util.*;

public class PathSum {
    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int n){
            this.val = n;
        }
    }

    public static void main(String[] args){

    }

    public static int pathSum(TreeNode root, int sum){
        return countPaths(root, sum, 0, new HashMap<>());
    }

    public static int countPaths(TreeNode node, int target, int current, Map<Integer, Integer> map){
        if(node == null)
            return 0;
        current += node.val;
        int sum = target - current;
        int paths = map.getOrDefault(sum, 0);
        if(current == target)
            paths++;
        updateMap(map, current, 1);
        paths += countPaths(node.left, target, current, map);
        paths += countPaths(node.right, target, current, map);
        updateMap(map, current, -1);
        return paths;
    }

    public static void updateMap(Map<Integer, Integer> map, int key, int val){
        int count = map.getOrDefault(map, 0) + val;
        if(count == 0)
            map.remove(key);
        else
            map.put(key, count);
    }
    
}
