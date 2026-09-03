package dia01;

public class BytesParaKBMGGB {
    public static void main(String[] args) {
        long bytes = 5000000000L;

        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;

        System.out.println("Bytes: " + bytes);
        System.out.println("KB: " + kb);
        System.out.println("MB: " + mb);
        System.out.println("GB: " + gb);
    }
}
