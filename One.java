import org.apache.logging.log4j.LogManager;import org.apache.logging.log4j.Logger;/** * Beispielklasse. *  * Der einzige Sinn dieser Klasse besteht darin, * den String "One" auf der Konsole auszugeben * und Logging-Ausgaben zu enthalten. *  * @author brill * @version Wintersemester 2019/20 */public class One {	    /**     * Instanz eines Loggers für log4j2.     */    private static final Logger log = LogManager.getLogger();	        /**     * Ausgabe auf der Konsole.     */
	@Override
    public String toString() {		log.trace(">> One.tostring"); 
    	return "One!";
    }	
}
