package day_03;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int correctIndex = 0;
        int currentIndex = 0;

        while (currentIndex < nums.length) {
            if (nums[currentIndex] != val) {
                nums[correctIndex] = nums[currentIndex];
                currentIndex++;
                correctIndex++;
            } else currentIndex++;
        }
        return correctIndex;
    }

}
