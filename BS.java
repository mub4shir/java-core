public class BS {
    public static void main(String[] args) {
        int[] arr={0,0,0,1,1,1,1};
        int key=1;
        int n=arr.length;
        System.out.println(n-lowerBound(arr,key));




    }
    private static int lowerBound(int[] arr, int key){
        int n = arr.length;
        int s=0;
        int e=n-1;
        int res=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==key){
                res=m;
                e=m-1;
            }
            else if(arr[m]>key) s=m+1;
            else e=m-1;
        }
        return res;
    }

//    private static boolean checkLoop(Node head){
//        Node slow =head;
//        Node fast =head;
//
//        while(slow!= null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow==fast) {
//               return true;
//            }
//            return false;
//        }
//
//    }

}
