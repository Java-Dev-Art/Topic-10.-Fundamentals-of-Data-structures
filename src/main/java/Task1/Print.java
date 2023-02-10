package Task1;

import java.util.Arrays;
import java.util.List;

public class Print {
    private Task1 task1;

    public Print(Task1 task1) {
        this.task1 = task1;
    }
    public void print(){
        System.out.println(Arrays.toString(new List[]{task1.getList()}));
    }
}
