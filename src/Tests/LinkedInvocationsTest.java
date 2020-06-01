package Tests;

public class LinkedInvocationsTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("spring");
        sb = sb.delete(3, 6).insert(2, "umme").deleteCharAt(1);
        System.out.println("sb = " + sb);
    }
}
