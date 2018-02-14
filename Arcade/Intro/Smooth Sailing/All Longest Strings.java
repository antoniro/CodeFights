String[] allLongestStrings(String[] inputArray) {
    int maxLength = 0;
    int count = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() > maxLength) {
            maxLength = inputArray[i].length();
            count = 1;
        } else if (inputArray[i].length() == maxLength){
            count++;
        }
    }
    
    String[] result = new String[count];
    int i = 0;
    int j = 0;
    while (j <= count && i < inputArray.length){
         if (inputArray[i].length() == maxLength) {
             result[j++] = inputArray[i];
        }
        i++;
    }
    
    return result;
}
