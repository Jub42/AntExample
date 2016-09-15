/**
 * Das Hauptprogramm des Beispiels für die Verwendung
 * von ant. Die eigentlich vollkommen sinnlose Anwendung
 * instanziiert zwei Klassen, One und Two. Anschließend
 * verwenden wir die ::toString() Methode der Klassen,
 * um eine Ausgabe auf der Konsole zu bekommen.
 * <P>
 * Verläuft alles korrekt, dann erhalten wir die Konsolenausgabe
 * <pre>One!</pre>
 * <pre>Two!</pre>
 * <pre>Three!</pre>
 *
 * @author Manfred Brill
 */
public class Main {
	
    
	    public static void main(String[] args) {
        
	    	One  one = new One();
	    	Two  two = new Two();
	    	Main three = new Main();
	    	
	    	System.out.println(one);
	    	System.out.println(two);
	    	System.out.println(three.toString());
	    }	


        /**
	 * Die Funktion toString() überschreiben, damit wir
	 * aus der Anwendungsklasse die Ausgabe "Three!" bekommen.
	 */
    	@Override
        public String toString() {
        	return "Three!";
        }
}
