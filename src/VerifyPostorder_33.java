public class VerifyPostorder_33 {
    public boolean verifyPostorder(int[] postorder) {
        return hepler(postorder,0,postorder.length-1);
    }

    private boolean hepler(int[] postorder, int left, int right) {
        if (left>=right)
            return true;

        int mid=left;
        int root=postorder[right];
        while (postorder[mid]<root)
            mid++;

        int temp=mid;
        while (temp<right){
            if (postorder[temp++]<root)
                return false;
        }

        return hepler(postorder,left,mid-1)&&hepler(postorder,mid,right-1);
    }
}
