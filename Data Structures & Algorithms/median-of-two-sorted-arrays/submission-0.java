class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> res = new ArrayList<>();
        int i =0;
        int j =0;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                res.add(nums1[i++]); 
            }
            else{
              res.add(nums2[j++]); 
            }
        }
            while(i<n1){
                 res.add(nums1[i++]); 

            }
            while(j<n2){
                res.add(nums2[j++]);

            }
            int n =n1+n2;
            if(n%2==1){
                return res.get(n/2);
            }
            else{
                return (res.get(n/2) + res.get(n/2 - 1))/2.0;
            }
        }

        
    }

