package recursive;

public class OrtDemoApp {
    public static void main(String[] args) {
        Ort graz = new Ort("graz");
        Ort wien = new Ort ("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");

        graz.addNachbar(marburg);
        graz.addNachbar(wien);

        wien.addNachbar(linz);

        linz.addNachbar(graz);
        marburg.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);


        //graz.hasCircle(graz);

        System.out.println(Ort.getPrint());

        // downNum(10);
    }

   /** public static void downNum( int n) {
        if( n <= 0 ) return;

        downNum( n -1 );

        System.out.println("n = " + n);
    }**/
}
