public class LeetCode896 {

    public boolean isRise(int[] A){
        int len = A.length;
        if(len<2){
            return true;
        }
        for(int i=1;i<len;i++){
            if(A[i]<A[i-1]){
                return false;
            }
        }
        return true;
    }

    public boolean isDown(int[] A){
        int len = A.length;
        if(len<2){
            return true;
        }
        for(int i=1;i<len;i++){
            if(A[i]>A[i-1]){
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonic(int[] A) {
        if(isRise(A)){
            return true;
        }
        return isDown(A);
    }
}
