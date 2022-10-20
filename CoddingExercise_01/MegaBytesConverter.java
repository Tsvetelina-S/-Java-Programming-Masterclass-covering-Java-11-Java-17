package CoddingExercise_01;

public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        //*printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
        //* printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
        //* printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"

    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes) {

            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            } else {

                int megabytes = (kiloBytes / 1024);
                int remainingKilobytes = (kiloBytes % 1024);

                System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
