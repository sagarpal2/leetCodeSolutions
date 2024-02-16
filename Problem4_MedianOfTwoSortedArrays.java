class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] arr = new int[l];
        int v = 0;
        int t = 0;
        int m = nums1.length;
        int n = nums2.length;
        float res = 0;
        if(m<n){
            for(int i=0;i<m;i++){
                arr[t++] = nums1[i];
                arr[t++] = nums2[i];
                v++;
            }
            for(int i=v;i<n;i++){
                arr[t++] = nums2[i];
            }
        }
        else{
            for(int i=0;i<n;i++){
                arr[t++] = nums1[i];
                arr[t++] = nums2[i];
                v++;
            }
            for(int i=v;i<m;i++){
                arr[t++] = nums1[i];
            }
        }
        Arrays.sort(arr);
        if(l%2 == 0)
            res = ((float)(arr[l/2-1] + arr[l/2])/2);
        else
            res = (arr[l/2]);
        return res;
    }
}