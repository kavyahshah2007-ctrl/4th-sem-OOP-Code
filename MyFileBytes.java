
import java.io.File;
import java.util.Scanner;

public class MyFileBytes {

    public static void main(String[] args) {

        String loc;
        int fi = 0, fo = 0;
        int Bytes;

        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER LOCATION: ");
        loc = scan.next();

        System.out.print("ENTER BYTES: ");
        Bytes = scan.nextInt();

        File f = new File(loc);

        // Check if directory exists
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("Invalid directory!");
            return;
        }

        String cont[] = f.list();

        for (int i = 0; i < cont.length; i++) {
            File ff = new File(loc, cont[i]);

            if (ff.isFile()) {
                fi++;
                if (ff.length() > Bytes) {
                    System.out.println(cont[i] + " = " + ff.length());
                }
            } else if (ff.isDirectory()) {
                fo++;
            }
        }

        System.out.println("\nFiles: " + fi);
        System.out.println("Folders: " + fo);
    }
}