package example;

public class Replace {
	public static void main(String[] args) {
        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);
}
}