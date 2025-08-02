package example;

public class Delete {
	
	    public static void main(String[] args) {
	        // Creating StringBuffer
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.delete(5, 6);
	        System.out.println("After delete: " + sb);
}

}