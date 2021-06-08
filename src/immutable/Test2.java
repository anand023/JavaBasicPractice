import java.util.ArrayList;
import java.util.List;

final class Box {
    private final List<Integer> values = new ArrayList();;
    Box(ArrayList<Integer> values){
        for (int i=0; i<values.size(); i++){
            this.values.add(values.get(i));
        }
    }
    public List<Integer> getValues(){
        return List.copyOf(this.values);
    }
}