class Problem_7 {
    public static int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;  // Extract last digit
            x /= 10;  // Remove last digit
            
            // Overflow check before multiplication
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }

            rev = rev * 10 + digit;  // Build reversed number
        }
        
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));   // Output: 321
        System.out.println(reverse(-123));  // Output: -321
        System.out.println(reverse(120));   // Output: 21
        System.out.println(reverse(0));     // Output: 0
        System.out.println(reverse(1534236469)); // Output: 0 (overflow case)
    }
}
