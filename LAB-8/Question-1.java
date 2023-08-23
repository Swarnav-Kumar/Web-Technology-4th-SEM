/* WAP to design a “MyString” class that perform string 
operations (compute string length, reverse a string, change 
cases, compare two strings) using your own methods. 
Create a package “MyPackage” for “MyString” class and 
define all methods in that package. */
package MyPackage;

public class MyString {

    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public int length() {
        return str.length();
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public String changeCase() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public boolean equals(MyString other) {
        return str.equals(other.str);
    }

}
