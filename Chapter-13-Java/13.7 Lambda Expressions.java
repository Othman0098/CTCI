//  Lambda expressions;
int getPopulation(List<Country> countries, String continent) {
    /* Filter countries. */
    Stream<Country> sublist = countries.stream().filter(
        country -> { return country.getContinent().equals(continent);}
    );
    
    /* Convert to list of populations. */
    Stream<Integer> populations = sublist.map(
        c -> c.getPopulation()
    );
    
    /* Sum List. */
    int population = populations.reduce(0, (a, b) -> a + b);
    return population;
}


//  Concise Lambda expressions;
int getPopulation(List<Country) countries, String continent) {
    Stream<Integer> populations = countries.stream().map(
        c -> c.getContinent().equals(continent) ? c.getPopulations() : 0);
    return populations.reduce(0, (a, b) -> a + b);
}


//  Straight forward;
int getPopulation(List<Country> countries, String continent) {
    int sum = 0;
    for (Country c : countries) {
        if (c.getContinent().equals(continent)) {
            sum += c.getPopulation();
        }
    }
    return sum;
}
