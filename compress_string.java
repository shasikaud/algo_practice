public class StringCompressor {

    public void compress(String rawString){
        String compressedString = "";
        int count = 1;
        char character = rawString.charAt(0);
        for (int i=1; i<rawString.length(); i++){
            if (rawString.charAt(i) == character){
                count += 1;
            } else {
                compressedString = compressedString.concat(String.valueOf(character)).concat(String.valueOf(count));
                count = 1;
                character = rawString.charAt(i);
            }
        }
        compressedString = compressedString.concat(String.valueOf(character)).concat(String.valueOf(count));
        System.out.println(compressedString);
    }
}
