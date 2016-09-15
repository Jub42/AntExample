//! Die Anwendungsklasse für unser GitHub-Beispiel
/*!
 * Die Klasse Main gibt mit der überschriebenen toString-Methode
 * "Three!" aus auf der Konsole.
 *
 * Vorher werden noch zwei Instanzen, von One und Two, erzeugt, die
 * ebenfalls etwas auf der Konsole ausgeben.
 *
 * Bei korrektem Verlauf erhalten wir die folgende Konsolenausgabe:
 * One!
 * Two!
 * Three!
 */
public class Main {
	
    
            //! Die Anwendung
	    /*!
	     * Da ist nicht mehr zu sagen, oder?
	     */
	    public static void main(String[] args) {
        
	    	One  one = new One();
	    	Two  two = new Two();
	    	Main three = new Main();
	    	
	    	System.out.println(one);
	    	System.out.println(two);
	    	System.out.println(three.toString());
	    }	


        //! Wir überschreiben die toString-Methode mit der Ausgabe "Three!"
    	@Override
        public String toString() {
        	return "Three!";
        }
}

/*!
 * \mainpage Beispiel eines GitHub-Projekts mit Doxygen-Kommentare für Jenkins
 * 
 * Dies ist die Hauptseite der mit Doxygen erzeugten HTML-Dokumentation.
 * 
 * Dieser Text befindet sich in der Datei Main.java.
 */
