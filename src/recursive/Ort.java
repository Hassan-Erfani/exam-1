package recursive;


import java.util.ArrayList;
import java.util.HashSet;

public class Ort {
    private String name;
    private ArrayList<Ort> nachbarn = new ArrayList<>();
    private static HashSet<String> print = new HashSet<>();
    static int counter = 0;
    static Ort old = null;

    public static HashSet<String> getPrint() {
        return print;
    }

    public Ort(String name) {
        this.name = name;
    }

    public void addNachbar(Ort o) {
        nachbarn.add(o);
    }

    public boolean hasCircle(Ort o) {

        if(this.nachbarn.contains(o)) {
            old = this.nachbarn.get(this.nachbarn.indexOf(o));
        }

        if(this.nachbarn.isEmpty()) {
            System.out.println("I am really Empty!!!!!");
            return false;
        }

        if(counter < 2 && this.nachbarn.contains(o)){
            old = this.nachbarn.remove(this.nachbarn.indexOf(o));
        }

        counter++;

        if( this.nachbarn.isEmpty() ){
            counter = 0;
            old.nachbarn.remove(old.nachbarn.indexOf(this));
            if( old.hasCircle(o) ) {
                return true;
            } else {
                return false;
            }

        }

        if(this.nachbarn.contains(o) && counter > 1){
            print.add(this.name);
            return true;
        }

        print.add(this.name);
        this.nachbarn.get(0).hasCircle(o);


        return true;

    }


   /** public boolean hasCircle(Ort o, Ort acc) {

        if(acc.nachbarn.contains(o))  return true;

        acc = nachbarn.get(+1);
        hasCircle(o, acc);
        return false;
    }

    public String toString() {
        return "Ort{" +
                "name='" + name + '\'' +
                ", nachbarn=" + nachbarn +
                '}';
    }**/
}
