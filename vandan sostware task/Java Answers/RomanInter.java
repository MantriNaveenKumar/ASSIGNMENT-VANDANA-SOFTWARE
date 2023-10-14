 
 //  2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

 class RomanToIntegerConverter {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace this with the Roman numeral you want to convert
        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = romanValue(s.charAt(i));

            if (currentVal < prevValue) {
                result -= currentVal;
            } else {
                result += currentVal;
            }

            prevValue = currentVal;
        }

        return result;
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid character
        }
    }
}

/* 
OUTPUT : 
The integer equivalent of IX is: 9 .

*/
