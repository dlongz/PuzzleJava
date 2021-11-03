import java.util.Random;
import 

public class PuzzleJava {
    Random rndm = new Random();

    /**
    getTenRolls
    Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
     */
    public int[] getTenRolls(){
        int[] rolls;
        rolls = new int[10];
        for ( int i =0;i<rolls.length;i++){
            rolls[i] = rndm.nextInt(21)+1;
        }
        for (int i = 0; i < rolls.length; i++) {
            System.out.println(rolls[i]);
        }
        return rolls;
    }

    /*
    getRandomLetter
    Write a method that will:
    Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    Generate a random index between 0-25, and use it to pull a random letter out of the array.
    Return the random letter.
     */
    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxys".toCharArray();
        int index = rndm.nextInt(26);
        char randomLetter = alphabet[index];
        return randomLetter;
    }

    /**
    generatePassword
    Write a method that uses the previous method to create a random string of eight characters, and return that string.
     */
    public String generatePassword(){
        String password = "";
        for (int i = 0; i <8; i++) {
            char lett = getRandomLetter();
            password = password + lett;
        }
        return password;
    }

    /*
    getNewPasswordSet
    Write a method that takes an int length as an argument and creates an array of random eight character words. 
    The array should be the length passed in as an int.
    */
    public String[] getNewPasswordSet(int length){
        String[] arr;
        arr = new String[length];
        for (int i = 0; i < arr.length; i++) {
            String randWord = generatePassword();
            arr[i] = randWord;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    /*****SENSEI BONUS:*****/

    /**
    huffleArray
    Write a method that takes an array and and mixes up all the values in a pseudo-random way. 
    Hint: use random indexes within the array, and swap values repeatedly. 
    */
    // public Object[] huffleArray(Object[] arr){
    //     int[] index;
    //     index = new int[arr.length];
    //     Object[] arrCopy;
    //     arrCopy = new Object[arr.length];
    
    //     for (int i = 0; i < arr.length; i++) {
    //         randomIndex = rndm.nextInt(arr.length);
    //         if(randomIndex ==  )
    //         index[i] = randomIndex;
    //     }
    // }


}
