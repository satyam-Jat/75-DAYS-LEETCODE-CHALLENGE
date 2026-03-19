
class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();  // string ke sath jo krskte hai vo krre hai
        s = s.replaceAll("[^a-zA-Z0-9]", "");  // string ke sath jo krskte hai vo krre hai
        String rev = new StringBuilder(s).reverse().toString(); //sB se reverse krdia s ko
     return s.equals(rev);  // dhekha content equal he ya nahi , == se refference eq hota
}
}