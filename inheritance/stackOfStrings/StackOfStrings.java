package inheritence;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;
    private int index;

    public StackOfStrings(){
        this.data = new ArrayList<>();
    }

    public void push(String item){
        this.data.add(item);
        index++;
    }

    public String pop(){
        return this.data.remove(index--);
    }

    public String peek(){
        return this.data.get(index);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
