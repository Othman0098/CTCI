//  Graph;

HashMap<String, Integer> trulyMostPopular(HashMap<String, Integer> names, String[][] synonyms) {

    /* Create data. */
    Graph graph = constructGraph(names);
    connectEdges(graoh, synonyms);
    
    /* Find components. */
    HashMap<String, Integer> rootNames = getTrueFrequencies(graph);
    return rootNames;
}
