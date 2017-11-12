int adjacentElementsProduct(int[] inputArray) {
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length - 1; i++) {
        int product = (inputArray[i] * inputArray[i+1]);
        result = result > product ? result : product;
    }
    
    return result;
}
