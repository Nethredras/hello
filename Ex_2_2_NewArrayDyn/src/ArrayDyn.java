public class ArrayDyn {
    public static void main(String[] args) {
        int[] ar = new int[0];
        ar = append(ar, 5);
        ar = append(ar, 10);
        ar = append(ar, 15);
        printAr(ar);
        System.out.println();
        ar = prepend(ar, 3);
        printAr(ar);
        System.out.println();
        ar = delete(ar);
        printAr(ar);
    }

    /** Methode fuer das loeschen des letzten Elemnts */
    public static int[] delete(int[] ar) {
        int[] temp = new int[ar.length - 1];

        for(int i = 0; i < ar.length - 1; ++i) {
            temp[i] = ar[i];
        }

        ar = temp;
        return ar;
    }

    /** Fügt ein neues Element am Anfang hinzu */
    public static int[] prepend(int[] ar, int n) {
        int[] temp = new int[ar.length + 1];

        for(int i = 1; i < temp.length; ++i) {
            temp[i] = ar[i - 1];
        }

        temp[0] = n;
        ar = temp;
        return ar;
    }

    /** Methode um am Ende des Arrays ein Element hinzuzufuegen */
    public static int[] append(int[] ar, int n) {
        int[] temp = new int[ar.length + 1];

        for(int i = 0; i < ar.length; ++i) {
            temp[i] = ar[i];
        }

        temp[temp.length - 1] = n;
        ar = temp;
        return ar;
    }

    /** Methode für die Ausgabe */
    public static void printAr(int[] ar) {
        for(int i = 0; i < ar.length; ++i) {
            System.out.print(ar[i] + " ");
        }

    }
}
