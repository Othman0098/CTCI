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

/* Connect synonymous spellings. */
void connectEdges(Graph graph, String[][] synonyms) {
    for (String[] entry : synonyms) {
        String name1 = entry[0];
        String name2 = entry[1];
        graph.addEdge(name1, name2);
    }
}

/* Do DFS of each component. If a node has been visited before, then its component has already been computed. */
HashMap<String, Integer> getTrueFrequencies(Graph graph) {
    HashMap<String, Integer> rootNames = new HashMap<String, Integer>();
    for (GraphNode node : graph.getNodes()) {
        if (!node.isVisited()) { // Already visited this component
            int frequency = getComponentFrequency(node);
            String name = node.getName();
            rootNames.put(name, frequency);
        }
    }
    return rootNames;
}
