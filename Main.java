/** * Anwendungsklasse. *  * Wir verwenden die beiden Klassen One und Two, und geben * zusätzlich noch einen weiteren String auf der Konsole aus. *  * @author brill * @version Wintersemester 2019/20 */public class Main {            
	    public static void main(String[] args) {	    			
	    	One  one = new One();
	    	Two  two = new Two();
	    	Main three = new Main();
	    	System.out.println(one);
	    	System.out.println(two);
	    	System.out.println(three.toString());	    	        }	
	    /**	     * Ausgabe auf der Konsole.	     */
    	@Override
        public String toString() {		
        	return "Three!";
        }
}
