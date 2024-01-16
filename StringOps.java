public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        String lowerCaseWord = "";
        String newWord = "";

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character >= 'A' && character >= 'Z') {
                character += 32;
            }
            lowerCaseWord += character;
        }

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char newCharacter = lowerCaseWord.charAt(i);
            if (newCharacter == 'a' || newCharacter == 'e' || newCharacter == 'i' || newCharacter == 'o' || newCharacter == 'u') {
                newCharacter -= 32;
            }
            newWord += newCharacter;
        }
        return newWord;
    }

    public static String camelCase(String string) {
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
