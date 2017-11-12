boolean almostIncreasingSequence(int[] sequence) {
  boolean found = false;
  for (int i=0;i<sequence.length;i++) {
    if(i-1 >=0 && sequence[i] <= sequence[i-1]) {
      if(found) {
        return false;
      }
      found = true;
       
      if(i == 1 || i + 1 == sequence.length) {
        continue;
      }
      else if ( i-2 >=0 && sequence[i] > sequence[i-2]) {
        sequence[i-1] = sequence[i-2];
      }
      else if( i-1 >=0 && i+1 < sequence.length &&
              sequence[i-1] >= sequence[i+1]) {
        return false;
      }
    }
  }
  return true;
}
