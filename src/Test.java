public class Test {
    private int[] nums = new int[10];

    public static void main(String[] args) {
        Test test = new Test();
        for (int index = 0; index < test.nums.length; index++) {
            test.nums[index] = index;
            System.out.println(test.nums[index]);
        }
    }
}
/*
0
1
2
3
4
5
6
7
8
9
 */

