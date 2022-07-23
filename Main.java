public class Main {
	    public static void main(String[] args) {
	    	One  one = new One();
	    	Two  two = new Two();
	    	Main three = new Main();
	    	System.out.println(one);
	    	System.out.println(two);
	    	System.out.println(three.toString());
	    }	
    	@Override
        public String toString() {
        	return "Three!";
        }
}