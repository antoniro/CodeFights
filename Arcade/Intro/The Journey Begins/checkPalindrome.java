boolean checkPalindrome(String inputString) {
    String reverseStr = new StringBuilder(inputString).reverse().toString();
    return inputString.equals(reverseStr);
}
