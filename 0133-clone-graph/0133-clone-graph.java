/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    void traversal(Node node, Set<Integer>set, Map<Node, Node>map){
        if(node == null || set.contains(node.val)) return;
        set.add(node.val);
        map.put(node, new Node(node.val));
        List<Node> neighbors = node.neighbors;
        for(int i=0; i<neighbors.size(); i++){
            traversal(neighbors.get(i), set, map);
        }
    }
    public Node cloneGraph(Node node) {
        Map<Node, Node>map = new HashMap<>();
        Set<Integer>set = new HashSet<>();
        traversal(node, set, map);
        for(Node temp: map.keySet()){
            List<Node>list1 = temp.neighbors;
            List<Node>list2 = map.get(temp).neighbors;
            for(int i=0; i<list1.size(); i++){
                Node n1 = list1.get(i);
                list2.add(map.get(n1));
            }
        }
        return map.get(node);
    }
}