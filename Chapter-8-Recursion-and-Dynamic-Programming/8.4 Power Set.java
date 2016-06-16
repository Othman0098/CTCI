    public static Set<Set<Integer>> allSubsets(Set<Integer> set) {
        Set<Set<Integer>> res = new LinkedHashSet<>();
        res.add(new LinkedHashSet<>());

        if (set.isEmpty())
            return res;

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int tmp = iterator.next();
            Set<Set<Integer>> tt = new LinkedHashSet<>(res);
            for(Set<Integer> i : tt){
                Set<Integer> t = new LinkedHashSet<>(i);
                t.add(tmp);
                res.add(t);
            }
        }

        return res;
    }
