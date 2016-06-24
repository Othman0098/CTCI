Card[] shuffleCards(Card[] cards, Random random) {
    Card[] res = new Card[cards.length];
    for (int i = 0; i < cards.length; i++) {
        res[random.nextInt(cards.length)] = cards[i];
    }
    
    return res;
}
