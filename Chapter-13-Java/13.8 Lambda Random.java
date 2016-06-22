/**
 *  
 */

//  lambda expressions;
List<Integer> getRandomSubset(list<Integer> list) {
  Random random = new Random();
  List<Integer> subset = list.stream().filter(
      k -> { return random.nextBoolean();   /* Flip coin. */
  }).collect(Collectors.toList());
  return subset;
}


//  Using predicate
Random random = new Random;
Predicate<object> flipCoin = o -> {
  return random.nextBoolean();
};

List<Integer> getRandomSubset(List<Integer> list) {
  List<Integer> subset = list.stream().filter(flipCoin).
    collect(Collectors.toList());
  return subset;
}


//  Without lambda expressions;
List<Integer> getRandomSubset(list<Integer> list) {
  Random random = new Random();
  List<Integer> subset = new ArrayList<Integer>();
  for (int item : list) {
    /* Flip coin. */
    if (random.nextBoolean()) {
      subset.add(item);
    }
  }
  return subset;
}

