import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomCharacter rc = new RandomCharacter();
        char[] lowerCaseArr = new char[15];
        char[] upperCaseArr = new char[15];
        char[] digitArr = new char[15];
        char[] charArr = new char[15];
        for (int i=0; i < 15; i++){
            lowerCaseArr[i] = rc.getRandomLowerCaseLetter();
            upperCaseArr[i] = rc.getRandomUpperCaseLetter();
            digitArr[i] = rc.getRandomDigitCharacter();
            charArr[i] = rc.getRandomCharacter();
        }
        System.out.println(lowerCaseArr);
        System.out.println(upperCaseArr);
        System.out.println(Arrays.toString(digitArr));
        System.out.println(charArr);
    }
}
