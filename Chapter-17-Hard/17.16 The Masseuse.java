/**
 * Dynamic Programming;
 * 
 * Cannot select adjacent item;
 * 
 */
 
 /**
  * Two array records by far the optimal set with or without item i;
  * 
  */
  
with[0] = nums[0];
without[0] = 0;

for (int i = 1; i < nums.length; i++)
    without[i] = Math.max(with[i - 1] + without[i - 1]);
    with[i] = nums[i] + without[i - 1];

return Math.max(with[nums.length - 1], without[nums.length - 1]);
 
