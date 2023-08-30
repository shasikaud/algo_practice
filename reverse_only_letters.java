class Solution {
    
    // public String reverseOnlyLetters(String s) {
    //     char temp[] = s.toCharArray();      
    //     int low = 0;
    //     int high = s.length()-1;
    //     while(low < high){
    //         if(Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])){
    //             char i = temp[low];temp[low] = temp[high];
    //             temp[high] = i;
    //             low++; high--;
    //         } else if(!Character.isAlphabetic(temp[low]))  low++;
    //         else if(!Character.isAlphabetic(temp[high]))  high--;   
    //     }
    //     return String.valueOf(temp);
    // }

    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack();

        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) stack.push(s.charAt(i));
        }

        StringBuilder rev = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) rev.append(stack.pop());
            else rev.append(s.charAt(i));
        }

        return rev.toString();
    }
}
