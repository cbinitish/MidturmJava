package math.problems;

public class FindLowestDifference {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        static int findMinDiff(int[] arr, int n)
        { int diff = Integer.MAX_VALUE;

            for (int i=0; i<n-1; i++)
                for (int j=i+1; j<n; j++)
                    if (Math.abs((arr[i] - arr[j]) )< diff)
                        diff = Math.abs((arr[i] - arr[j]));
                    return diff;
        }
        public static void main(String[] args)
        {
            int arr[] = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
            int arr2[] = new int[]{18, 3, 41, 47, 17, 36, };

            System.out.println("Minimum difference is "+
                    findMinDiff(arr, arr.length));
            System.out.println("Minimum difference is "+
                    findMinDiff(arr, arr2.length));
    }


}
