/**
 *  Solution #1:
 * 
 *  To prevent deadlocks, we can implement a strategy where a philosopher will put down his left chopstick if he is unable to obtain 
 *  the right one.
 *
 */

public class Chopstick {
  /* Same as before */
  
  public boolean pickUp() {
    return lock.tryLock();
  }
}

public class Philosopher extneds Thread {
  /* Same as before */
  
  public void eat() {
    if (pickUp()) {
      chew();
      putDown();
    }
  }
  
  public boolean pickUp() {
    /* Attempt to pick up */
    if (!left.pickUp()) {
      return false;
    }
    if (!right.pickUp()) {
      left.putDown();
      return false;
    }
    return true;
  }
}
