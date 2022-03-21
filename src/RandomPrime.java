import java.util.Random;

public class RandomPrime {

    public boolean isPrime(int inputNum){
        int divisor = 3;
        if (inputNum <= 3 || inputNum%2 == 0){  //Number is lesser than 3 or is divisible by 2
            return inputNum == 2 ||  inputNum == 3;
        }
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0)){ //check square root & if it is divisible
            // by the divisor(odd number, even number was checked above)
            divisor += 2;
        } return inputNum % divisor != 0;
    }

    public int getPrimeNum(){
        int prime = 0;
        Random r = new Random();
        prime = r.nextInt(100000);
        while(!this.isPrime(prime)){
            prime = r.nextInt(100000) + 1;
        }
        return prime;
    }
}
