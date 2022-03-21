import java.util.Random;

public class RandomCharacter {
    Random r = new Random();
    public char getRandomLowerCaseLetter(){
        return (char) (this.r.nextInt(26) + 97);  //random int between 0-25, add 97 which is the value ASCII a represents
    }
    public char getRandomUpperCaseLetter(){
        return (char) (this.r.nextInt(26) + 65);  //random int between 0-25, add 65 which is the value ASCII A represents
    }
    public char getRandomDigitCharacter(){
        return Character.forDigit(this.r.nextInt(10), 10);  //random int between 0-9
    }
    public char getRandomCharacter(){
        if (this.r.nextInt(2) == 0){  //if random int is 0, get lowercase
            return this.getRandomLowerCaseLetter();
        } else {  //if random int is 1, get uppercase
            return this.getRandomUpperCaseLetter();
        }
    }
}
