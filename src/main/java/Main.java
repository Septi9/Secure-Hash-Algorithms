public class Main {
    public static void main(String[] args) throws Exception {

        SHA1Process sha1 = new SHA1Process();

        String s1 = "example to test cipher";
        System.out.println(s1 + " -> " + SHA1Process.sha1(s1));

    }
}
