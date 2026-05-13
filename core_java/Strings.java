
public class Strings {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Concatenation
        System.out.println("Concatenated String: " + str3);

        // String methods
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());
        System.out.println("Substring (0, 5): " + str3.substring(0, 5));
        System.out.println("Index of 'World': " + str3.indexOf("World"));
        //string is class and string literal is object of string class and string pool is a memory area where string literals are 
        //stored and string literals are immutable and string pool is used to optimize memory usage by reusing string literals
        String str4 = "Hello";
        System.out.println("str1 == str4: " + (str1 == str4)); // true because str1 and str4 refer to the same string literal in the string pool
        String str5 = new String("Hello");
        System.out.println("str1 == str5: " + (str1 == str5)); // false because str5 is a new object in the heap
        System.out.println("str1.equals(str5): " + str1.equals(str5)); // true because equals() method compares the content of the strings

        //strings shares the same memory location if they have the same content and string pool is used to optimize memory usage by reusing string literals
        String str6 = "Hello";
        System.out.println("str1 == str6: " + (str1 == str6)); // true because str1 and str6 refer to the same string literal in the string pool

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("StringBuffer: " + sb.capacity());
    }

}
