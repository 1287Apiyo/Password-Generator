import java.util.Random;

//this now works as the backend/logic of our program
public class PasswordGenerator {
    //character pools
    public static final String LOWERCASE_CHARACTERS="abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS="0123456789";
    public static final String SPECIAL_SYMBOLS="!@#$%^&*()+=_-{}[];:,.<>/?";


    //the random class helps us to generate a random number which will be used to randomly choose the characters

    private final Random random;
    //constructor
    public PasswordGenerator(){random=new Random();}
    public String generatePassword(int length,boolean includeUppercase,boolean includeLowercase,boolean includeNumbers,boolean includeSpecialSymbols){
        StringBuilder passwordBuilder=new StringBuilder();
        //store valid characters
        String validCharacters="";
        if (includeUppercase)validCharacters+= UPPERCASE_CHARACTERS;
        if (includeLowercase)validCharacters += LOWERCASE_CHARACTERS;
        if (includeNumbers)validCharacters += NUMBERS;
        if (includeSpecialSymbols)validCharacters += SPECIAL_SYMBOLS;
        //build password
        for (int i=0;i<length;i++){
            //generate a random index
            int randomIndex=random.nextInt(validCharacters.length());

            //get the character based on the random index
            char randomChar=validCharacters.charAt(randomIndex);
            //store char into password builder
            passwordBuilder.append(randomChar);
            //do this until it meets the length of the user
        }
        //return the result
        return passwordBuilder.toString();
    }
}
