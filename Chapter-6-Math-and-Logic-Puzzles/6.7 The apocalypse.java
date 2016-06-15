/**
 * 1 x (1 / 2) + 2 x (1 / 2^2) + 3 x (1 / 2^3) + ... + n x (1 / 2^n);
 * ratio 100 %;
 */
 
//  Simulation;

double runNFamilies(int n) {
  int boys = 0, girls = 0;
  for(int i = 0; i < n; i++){
    int[] genders = runOneFamily();
    girls += genders[0];
    boys += genders[1];
  }
  return girls / (double)(girls + boys);
}

int[] runOneFamily() {
  Random random = new Random();
  int boys = 0;
  int girls = 0;
  while(girls == 0){
    if(random.nextBoolean())
      girls++;
    else
      boys++;
  }
  int[] genders = {girls, boys};
  return genders;
}
