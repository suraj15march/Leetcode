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
    void traversal(Node node, Map<Node, Node>map){
        if(node == null || map.containsKey(node)) return;
        map.put(node, new Node(node.val));
        List<Node> neighbors = node.neighbors;
        for(int i=0; i<neighbors.size(); i++){
            traversal(neighbors.get(i), map);
        }
    }
    public Node cloneGraph(Node node) {
        Map<Node, Node>map = new HashMap<>();
        traversal(node, map);
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