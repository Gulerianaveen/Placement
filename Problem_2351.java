import java.util.HashSet;

class Problem_2351 {
    public static char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();
        
        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;  // First repeating character
            }
            seen.add(ch);
        }
        
        return ' ';  // Should never reach here as per problem constraints
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz")); // Output: 'c'
        System.out.println(repeatedCharacter("abcdd"));     // Output: 'd'
    }
}
