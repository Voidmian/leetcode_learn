package DataStructure.MyArray;

/**
 * @Author Voidmian
 * @Date 2019/10/31 12:08
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * <p>
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * <p>
 * 如果是，则返回最大元素的索引，否则返回-1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 * <p>
 * <p>
 * 提示:
 * <p>
 * nums 的长度范围在[1, 50].
 * 每个 nums[i] 的整数范围在 [0, 10
 */
public class DominantIndex747 {
    static public void test() {
        DominantIndex747 dominantIndex747 = new DominantIndex747();
        int[] nums = {0,1};
        System.out.println(dominantIndex747.dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        if(nums == null)
            return -1;
        if(nums.length<2)
            return 0;
        int max1 = 0;
        int max2 = 1;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[max1] < nums[i]) {
                max2 = max1;
                max1 = i;
            } else {
                if (nums[max2] < nums[i] && max1!=i) {
                    max2=i;
                }
            }
        }
        if(nums[max1]>=nums[max2]*2)
            return max1;
        else
            return -1;
    }
}
