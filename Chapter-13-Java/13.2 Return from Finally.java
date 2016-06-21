private int test() {
        try {
            return 0;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return 1;
        }
    }
    
/**
 * Actually, test() will return 1 instead of 0;
 * ! ! ! ! ! !
 */
 
/**
 * Whether the finally block get excuted when in a try-catch-finally:
 *
 * It will get excuted:
 *      Even we attempt to exit within the try block via
 *      return;     continue;    break;     any exception...
 *
 * It will NOT get excuted:
 *      If the virtual machine exits during try/catch block execution;
 *      If the thread whick is executing during try/catch block gets killed;
 *
 */
