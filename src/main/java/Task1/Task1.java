package Task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    private List<String> list = new ArrayList<>();
    public boolean addElement(String element){
        return list.add(element);
    }
    public boolean removeElement(String element){
        return list.remove(element);
    }
    public void swapElement(String element1, String element2){
//        Collections.swap(list,findIndex(element1),findIndex(element2));
        list.set(findIndex(element1),list.set(findIndex(element2),list.get(findIndex(element1))));
    }
    public String findElement(String element){
        int index = 0;
        for (int i = 0; i <= list.size() - 1; i++){
            if (element.equals(list.get(i))){
                index = i;
            }
        }
      return   list.get(index);
    }
    public int findIndex(String element){
        int index = 0;
        for (int i = 0; i <= list.size() - 1; i++){
            if (element.equals(list.get(i))){
                index = i;
            }
        }
        return index;
    }
    public void sizeList(){
        System.out.println(list.size());
    }

    public List<String> getList() {
        return list;
    }
}
