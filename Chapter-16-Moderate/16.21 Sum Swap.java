/**
 * Straight Forward;
 * 
 * Find the pair which differences is half of the total sum of the two arrays;
 *
 */


    static void sumSwap(int[] a, int[] b) {

        int suma = 0, sumb = 0;

        for(int i : a)
            suma += i;

        HashSet<Integer> set = new HashSet<>();

        for(int i : b) {
            sumb += i;
            set.add(i);
        }

        int diff = (suma - sumb) / 2;

        for(int i : a)
            if(set.contains(i - diff)) {
                System.out.println(i + " " + (i - diff));
                return;
            }

        return;
    }
