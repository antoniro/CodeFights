boolean isLucky(int n) {
    String number = String.valueOf(n);
    int nDigits = number.length();
    int sum1 = 0;
    int sum2 = 0;
    
    for(int i = 0; i < nDigits; i++) {
        if (i < (nDigits/2)) {
            sum1 += Character.getNumericValue(number.charAt(i));
        } else {
            sum2 += Character.getNumericValue(number.charAt(i));
        }
    }
    
    return sum1==sum2;
}
