package leetcode;

public class SumofAllOddLengthSubarrays1588 {

    public void SumofAllOddLengthSubarrays1588() {
        int[] arr = {10, 11, 12};
        int iSummation = 1;
        int iValue = 0;
        while (iSummation <= arr.length) {
            iValue += fragmentArray(arr, iSummation);;

            iSummation += 2;
        }
        System.out.println(iValue);
    }

    public int fragmentArray(int iArr[], int iLong) {
        int iArrTemporal[] = new int[iLong];
        int iLongSum = iLong - 1;
        int iCont = 0;
        int iValue = 0;
        iLong--;
        for (int i = 0; i < iArr.length; i++) {
            if (i <= iLong) {
                iArrTemporal[iCont] = iArr[i];
                iCont++;
            } else {
                iCont = 0;
                iLong++;
                i = i - iLongSum - 1;
                iValue += sumSubArr(iArrTemporal);
            }
        }
        iValue += sumSubArr(iArrTemporal);
        return iValue;
    }

    public int sumSubArr(int iArr[]) {
        int iValue = 0;
        for (int i = 0; i < iArr.length; i++) {
            iValue += iArr[i];
        }
        return iValue;
    }
}
