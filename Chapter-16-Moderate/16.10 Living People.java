/**
 * Solution:
 * 
 */

int mostPeopleAliveYear(LinkedList<Person> people) {
    int[] years = new int[2018];
    
    for (Person p : people) {
        years[p.birth]++;
        years[p.death + 1]--;
    }
    
    int count = 0;
    int max = 0;
    for (int i = 0; i < 2018; i++) {
        count += years[i];
        max = Math.max(max, count);
    }
    
    return max;
}


/**
 * Solution 2:
 * 
 * Sort first;
 * Every birth adds a person and every death removes a person;
 * 
 */
