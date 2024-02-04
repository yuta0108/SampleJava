package Sukirijava3;

public class Sukiri3_3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int height = 159; // Assuming height is an integer, you should replace it with the actual height value

        char size; // Change the type to char

        if (height >= 170) {
            size = 'L';
        } else if (height >= 160) {
            size = 'M';
        } else if (height >= 150) {
            size = 'S';
        } else {
            size = '?';
        }

        System.out.println("Size: " + size);
    }
}