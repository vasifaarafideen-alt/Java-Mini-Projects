import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams.");
        }
    }
}