import org.apache.logging.log4j.LogManager;import org.apache.logging.log4j.Logger;/** * Anwendungsklasse. *  * Wir verwenden die beiden Klassen One und Two, und geben * zusätzlich noch einen weiteren String auf der Konsole aus. *  * @author brill * @version Wintersemester 2019/20 */public class Main {	    /**	     * Instanz eines Loggers für log4j2.	     */        private static final Logger log = LogManager.getLogger();            
	    public static void main(String[] args) {	    				log.trace(">> Main.main");			
	    	One  one = new One();
	    	Two  two = new Two();
	    	Main three = new Main();
	    	System.out.println(one);
	    	System.out.println(two);
	    	System.out.println(three.toString());	    				log.trace("<< Main.main");
	    }	
	    /**	     * Ausgabe auf der Konsole.	     */
    	@Override
        public String toString() {			log.trace(">> Main.tostring");    		
        	return "Three!";
        }
}
