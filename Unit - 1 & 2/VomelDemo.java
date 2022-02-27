import java.util.*;

class VowelDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character for vowel");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'A':
                System.out.println(ch + " is vowel");
                break;
            case 'e':
            case 'E':
                System.out.println(ch + " is vowel");
                break;
            case 'i':
            case 'I':
                System.out.println(ch + " is vowel");
                break;
            case 'o':
            case 'O':
                System.out.println(ch + " is vowel");
                break;
            case 'u':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println("consonant");
                break;

        }
    }
}