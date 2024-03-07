package nextpermutation;

public class Solution {

        public void nextPermutation(int[] nums) {
            permutation(nums);
        }
        public static void permutation(int arr[])
        {

            int p=-1;
            for(int i=arr.length-2;i>=0;i--)
            {
                if(arr[i]<arr[i+1])
                {
                    p=i;
                    break;
                }

            }
            if(p==-1)
            {
                reverse(arr, 0, arr.length-1);
                return;
            }
            int q=-1;
            for(int i=arr.length-1;i>p;i--)
            {
                if(arr[i]>arr[p])
                {
                    q=i;
                    break;
                }
            }
            int temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            reverse(arr,p+1,arr.length-1);
        }
        public static void reverse(int[] arr,int a,int b){
            int i=a;
            int j=b;
            while(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }

}
