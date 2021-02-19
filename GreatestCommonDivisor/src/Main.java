public class Main {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int maxNumber = Math.max(first,second);
        int maxDivisor = 0;
        for(int i=1; i<maxNumber; i++){
           if(first % i == 0 && second % i == 0){
               maxDivisor = i;
           }
        }
        return maxDivisor;
    }
}
