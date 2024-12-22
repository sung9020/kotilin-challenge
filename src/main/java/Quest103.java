import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 *
 * @author snow
 * @since 2024/06/25
 */
class Try{
    String value;
    List<Try> children = new ArrayList<>(); //
    boolean isLeaf = true;

    public String getValue(){
        return this.value;
    }
    public Try(String value){
        this.value = value;
    }
}

class Trie {
    Try root;

    public Trie() {
        root = new Try("");
    }

    public void insert(String word) {
        Try currentNode = root;
        String[] parses = word.split("");

        for(int i =0; i< parses.length; i++){
            String e = parses[i];
            // 자기 자식을 모두 순회 하면서 하나라도 있는지를 찾아낸다.
            Try node = currentNode.children.stream()
                    .filter( n -> n.value.equals(e)).findFirst().orElse(null);

            if(node == null){

            }

            for(Try child : currentNode.children){
                if(child.value.equals(e)){
                    // 노드 파고 들기
                    currentNode.isLeaf = false;
                    currentNode = child;
                    break;
                }
            }
            // 모든 자식을 순회했는데도 없는 경우
            if(i < parses.length - 1){
                currentNode.isLeaf = false;
            }

            currentNode.children.add(new Try(e));
        }
    }

    public boolean search(String word) {
        Try currentNode = root;
        String[] parses = word.split("");

        for(int i =0; i< parses.length; i++){
            String e = parses[i];

            for(Try child : currentNode.children){
                if(!child.value.equals(e)){
                    return false;
                }else{
                    currentNode = child;
                }
            }
        }

        return true;
    }

    public boolean startsWith(String prefix) {
        Try currentNode = root;
        String[] parses = prefix.split("");

        for(int i =0; i< parses.length; i++){
            String e = parses[i];

            for(Try child : currentNode.children){
                if(!child.value.equals(e)){
                    return false;
                }else{
                    currentNode = child;
                }
            }
        }

        return true;
    }
}

public class Quest103 {
    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
//        boolean param_2 = obj.search(word);
//        boolean param_3 = obj.startsWith(prefix);
    }



/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
