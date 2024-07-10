package Leetcode_Questions;

import java.util.Stack;

public class MaxRectangle {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,5,3};
        System.out.println("Max Rectangle Area "+largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        int arraysize = heights.length;
        int[] leftarr = new int[arraysize];
        int[] rightarr = new int[arraysize];

        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<arraysize;i++)
        {
            if(stack.isEmpty())
            {
                leftarr[i] = 0;
            }
            else
            {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                {
                    stack.pop();
                }
                leftarr[i] = stack.empty() ? 0 : stack.peek()+1;
            }
            stack.push(i);
        }
        stack.clear();

        for (int i=arraysize-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                rightarr[i] = arraysize-1;
            }
            else
            {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                {
                    stack.pop();
                }
                rightarr[i] = stack.isEmpty() ? arraysize-1 : stack.peek()-1;
            }
            stack.add(i);
        }
        int maxArea = 0;
        for (int i=0;i<arraysize;i++)
        {
            int area = heights[i] * (rightarr[i]-leftarr[i] + 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
