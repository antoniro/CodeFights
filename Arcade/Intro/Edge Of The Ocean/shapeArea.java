int shapeArea(int n) {
    int result = n+(n-1);
    for (int i = result - 2; i >= 1; i -=2) {
        result += 2*i;
    }
    
    return result;
}
