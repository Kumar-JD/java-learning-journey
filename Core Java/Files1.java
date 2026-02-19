import java.io.File;
import java.io.IOException;

class Files1 {
    public static void main(String args[]) {
        
        // 1. Define the file objects
        File ofile = new File("ex.txt");
        File nfile = new File("samples.txt");

        try {
            // 2. Actually create the file on the disk first
            if (ofile.createNewFile()) {
                System.out.println("File created: " + ofile.getName());
                
                // 3. Now that it exists, rename it
                if (ofile.renameTo(nfile)) {
                    System.out.println("Successfully renamed to: " + nfile.getName());
                } else {
                    System.out.println("Rename failed.");
                }
            } else {
                System.out.println("File already exists or could not be created.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}