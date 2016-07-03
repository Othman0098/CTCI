//  Graph;

HashMap<String, Integer> trulyMostPopular(HashMap<String, Integer> names, String[][] synonyms) {

    /* Create data. */
    Graph graph = constructGraph(names);
    connectEdges(graoh, synonyms);
    
    /* Find components. */
    HashMap<String, Integer> rootNames = getTrueFrequencies(graph);
    return rootNames;
}

/* Add all names to graph as nodes. */
Graph constructGraph(HashMap<String, Integer> names) {
    Graph graph = new Graph();
    for (Entry<String, Integer> entry : names.entrySet()) {
        String name = entry.getKey();
        int frequency = entry.getValue();
        graph.createNode(name, frequency);
    }
    return graph;
}
