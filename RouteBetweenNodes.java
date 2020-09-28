import java.util.*;

public class RouteBetweenNodes {
    static class Node{
        int val;
        List<Node> childs = new ArrayList<>();
        public Node(int n){
            val = n;
        }
    }

    public static void main(String[] args){

    }

    public static boolean route(Node start, Node end){
        if(start == end)
            return true;
        if(start == null)
            return false;
        Queue<Node> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node cur = q.poll();
                if(cur == end)
                    return true;
                for(Node child : cur.childs)
                    q.offer(child);
            }
        }
        return false;
    }
}
