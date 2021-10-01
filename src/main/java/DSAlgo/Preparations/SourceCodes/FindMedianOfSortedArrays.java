package DSAlgo.Preparations.SourceCodes;

public class FindMedianOfSortedArrays {
	
	
	public int findMedianOfArrays(Integer [] arr1, Integer [] arr2, int s1, int e1, int s2, int e2) {
		
		 int m1= findMedian(arr1, s1, e1);
		 int m2= findMedian(arr2, s2, e2);
		 
		 if(m1 == m2)
			 return m1;
		 
		 if(e1-s1 == 1) {
			 return (Math.max(arr1[s1], arr2[s2]) + Math.min(arr1[e1], arr2[e2]))/2;
		 } 
		 
		 else if(m1 > m2) {
			 return findMedianOfArrays(arr1, arr2, s1, (e1+s1)/2,  (e2+s2)/2, e2);
		 }
		 
		 else  {
			 return findMedianOfArrays(arr1, arr2, (e1+ s1)/2, e1, s2, (e2 + s2)/2);
		 }
		 

	}
	
	
	private int findMedian(Integer [] arr, int start, int end) {
		
		if((end - start) % 2 == 0) 
			return arr[(end + start)/2];
		
		else
			return (arr[(end + start)/2]+ arr[(end + start + 1)/2])/2;	
	}
}
