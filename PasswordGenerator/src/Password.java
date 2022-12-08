import java.util.Random;

public class Password {

    private int length = 0;
    private boolean needUpperCase = false;
    private boolean needSpecialCharacter = false;


    public Password(int length, boolean needUpperCase, boolean needSpecialCharacter){
        this.length = length;
        this.needUpperCase = needUpperCase;
        this.needSpecialCharacter = needSpecialCharacter;

    }

    public String makePassword(){
        String generatedPassword = "";
        Random r = new Random();
        String generateFrom = "abcdefghijklmnopqrstuvwxyz";
        if(needUpperCase && needSpecialCharacter){
            generateFrom += "!@#$%^&*-_";
            for(int i = 0; i < length; i++){
                generatedPassword += generateFrom.charAt(r.nextInt(generateFrom.length()));
            }
            for(int i = 0; i < generatedPassword.length(); i++){
                if(!(Character.isDigit(generatedPassword.charAt(i))) && Character.isLetter(generatedPassword.charAt(i))){
                    char upperCased = Character.toUpperCase(generatedPassword.charAt(i));
                    generatedPassword = generatedPassword.substring(0,i) + upperCased + generatedPassword.substring(i+1);
                    break;
                }
                else{
                     continue;
                }
            }
        } else if(needUpperCase){
            for(int i = 0; i < length; i++){
                generatedPassword += generateFrom.charAt(r.nextInt(generateFrom.length()));
            }
            for(int i = 0; i < generatedPassword.length(); i++){
                if(!(Character.isDigit(generatedPassword.charAt(i))) && Character.isLetter(generatedPassword.charAt(i))){
                    char upperCased = Character.toUpperCase(generatedPassword.charAt(i));
                    generatedPassword = generatedPassword.substring(0,i) + upperCased + generatedPassword.substring(i+1);
                    break;
                }
                else{
                    continue;
                }
            }
        } else if(needSpecialCharacter){
            generateFrom += "!@#$%^&*-_";
            for(int i = 0; i < length; i++){
                generatedPassword += generateFrom.charAt(r.nextInt(generateFrom.length()));
            }
        } else {
            for(int i = 0; i < length; i++){
                generatedPassword += generateFrom.charAt(r.nextInt(generateFrom.length()));
            }
        }
        return generatedPassword;


    }
}
