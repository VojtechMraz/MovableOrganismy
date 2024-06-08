import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public String toString(){
        String pomoc = "";
        for(Movable i: this.herd){
            pomoc = pomoc + i.toString() + "\n";
        }return pomoc;
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable i: this.herd){
            i.move(dx, dy);
        }
    }
    
}
