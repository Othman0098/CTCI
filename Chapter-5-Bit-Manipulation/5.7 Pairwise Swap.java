int pairwiseSwap(int num){
  int maskEven = 0xaaaaaaaa, maskOdd = 0x55555555;
  
  return ( ((x & maskEven) >>> 1) | ((x & maskOdd) << 1) );
}
