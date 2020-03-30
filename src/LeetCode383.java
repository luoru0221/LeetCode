public class LeetCode383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean ans = true;
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        int[] ransomNoteCharsNum = new int[26];
        int[] magazineCharsNum = new int[26];
        for (char ransomNoteChar : ransomNoteChars) {
            ransomNoteCharsNum[ransomNoteChar-'a']++;
        }
        for (char magazineChar : magazineChars) {
            magazineCharsNum[magazineChar-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ransomNoteCharsNum[i]<magazineCharsNum[i]){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
