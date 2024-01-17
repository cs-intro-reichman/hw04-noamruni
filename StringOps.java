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
            if (character >= 'A' && character <= 'Z') {
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
        String newWord = "";
        int characterIndex = 0;
        char currentCharacter;
        boolean isNewWord = true;
        boolean startNewWord = false;

        for (int i = 0; i < string.length(); i++) {
            characterIndex = (int) string.charAt(i);
            if (string.charAt(i) != ' ') {
                if (isNewWord) {
                    if (characterIndex > 65 && characterIndex < 90) {
                        characterIndex += 32;
                    }
                    currentCharacter = (char) characterIndex;
                    newWord += currentCharacter;

                    if ((i < (string.length() + 1)) && (string.charAt(i + 1) == ' ')) {
                        isNewWord = false;
                    }
                } else {
                    if (characterIndex > 65 && characterIndex < 90) {
                        if (startNewWord) {
                            startNewWord = false;
                        } else {
                            characterIndex += 32;
                        }
                    } else {
                        if (startNewWord) {
                            characterIndex -= 32;
                            startNewWord = false;
                        }
                    }
                    currentCharacter = (char) characterIndex;
                    newWord += currentCharacter;
                }
            } else if (!isNewWord) {
                startNewWord = true;
            }
        }

        return newWord;
    }

    public static int[] allIndexOf(String string, char chr) {
        int characterCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                characterCount++;
            }
        }
        int[] indexesOfCharacter = new int[characterCount];
        characterCount = 0;
        for (int j = 0; j < string.length(); j++){
            if (chr == string.charAt(j)){
                indexesOfCharacter[characterCount] = j;
                characterCount++;
            }
        }
        return indexesOfCharacter;
    }
}
