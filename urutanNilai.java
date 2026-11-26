public class urutanNilai  {
    public static void main(String[] args) {
        int[] nilai = {76, 90, 65, 88, 72};

        System.out.print("Data sebelum diurutkan : ");
        tampilkanArray(nilai);

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                  
                    int sementara = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = sementara;
                }
            }
        }

        System.out.print("Data sesudah diurutkan : ");
        tampilkanArray(nilai);
    }

    static void tampilkanArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}