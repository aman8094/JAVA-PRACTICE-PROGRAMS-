public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {12,23,34,45,56,67,89,90};
        int target = 90;

        System.out.println(binarysearch(arr,target));

    }
    //return the index of element
    //return -1 if the element is not there
    static int binarysearch(int[] arr,int target ){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            //find middle
//            int mid = (start+end)/2;
            //this might be possible that (start+end) might exceeds the range of int 
            //so we use this
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else
                {
                    return mid;
                }
                
            }
return -1;
        }
        
    }

