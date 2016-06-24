Card[] shuffleCards(Card[] cards, Random random) {
    Card[] res = new Card[cards.length];
    for (int i = 0; i < cards.length; i++) {
        //  Check if used?
        res[random.nextInt(cards.length)] = cards[i];
    }
    
    return res;
}


//  Recursive;

int rand(int lower, int higher) {
    return lower + (int)(Math.random() * (higher - lower + 1));
}

int[] shuffleArrayRecursively(int[] cards, int i) {
    if (i == 0)
        return cards;
        
    shuffleArrayRecursively(cards, i - 1);  //Shuffle earlier part;
    int k = rand(0, i);                     //Pick random index to swap with;
    
    /* Swap element k and i */
    int tmp = cards[k];
    cards[k] = cards[i];
    cards[i] = tmp;
    
    /* Return shuffled array */
    return cards;
}


//  Iterative;
void shuffleArrayIteratively(int[] cards) {
    for (int i = 0; i < cards.length; i++) {
        int k = rand(0, i);
        int tmp = cards[k];
        cards[k] = cards[i];
        cards[i] = tmp;
    }
    return;
}
