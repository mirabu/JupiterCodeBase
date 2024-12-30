package String;

public class ModifySen {
    public static void main(String[] args) {

        String teamAnthem = "Manchester is my fav team";
        System.out.println("Original Sentence:");
        System.out.println(teamAnthem);
        char replaceChar = 'z';
        int position= 7;

        char[] charArrayofSentence = replaceWithCharacter(teamAnthem,replaceChar,position);
        System.out.println("Modify with position char: ");
        for (char chars : charArrayofSentence){
            System.out.print(chars+" ");
        }
        System.out.println();
        String modeifyTeamName = modifyTheSentence(teamAnthem,charArrayofSentence);
        System.out.println("Modify Sentences: ");
        System.out.println(modeifyTeamName);


    }

    private static String modifyTheSentence(String teamAnthem,char[] charArrayofSentence) {
        StringBuilder stringBuilder=new StringBuilder();
        int charIndex= 0;
        for (int i=0;i<teamAnthem.length();i++){
            if (teamAnthem.charAt(i)==' '){
                stringBuilder.append(' ');
            }else{
                stringBuilder.append(charArrayofSentence[charIndex]);
                charIndex++;
            }
        }


        return stringBuilder.toString();
    }

    private static char[] replaceWithCharacter(String teamAnthem, char replaceChar, int position) {
        char[] newTeamAnthemChar = teamAnthem.replace(" ","").toCharArray();
        for (int i=0;i<newTeamAnthemChar.length;i++){
            if (newTeamAnthemChar[position]==newTeamAnthemChar[i]){
                newTeamAnthemChar[i]=replaceChar;
            }
        }
        return newTeamAnthemChar;
    }
}
