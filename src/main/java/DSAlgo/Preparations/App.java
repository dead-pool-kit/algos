package DSAlgo.Preparations;

import java.util.HashMap;
import java.util.Random;

import DSAlgo.Preparations.SourceCodes.Add2NumbersLL;
import DSAlgo.Preparations.SourceCodes.FindMedianOfSortedArrays;
import DSAlgo.Preparations.SourceCodes.HeapSort;
import DSAlgo.Preparations.SourceCodes.InsertionSort;
import DSAlgo.Preparations.SourceCodes.ReorderLinkedList;
import DSAlgo.Preparations.SourceCodes.SelectionSort;
import DSAlgo.Preparations.SourceCodes.TreeSort;
import DSAlgo.Preparations.Utils.ListNode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();
    	
    	
    	
//    	app.callGS1();
//    	app.callFindMedianOfSortedArrays();

    	
    	//    	app.compareSortingAlgos_Asc();
//    	app.compareSortingAlgos_Desc();
    	app.compareSortingAlgos_Rand();

    }
    
    int callFindMedianOfSortedArrays() {
    	Integer [] arr1 = {1, 15, 17, 59, 133};
    	Integer [] arr2 = {2, 3, 11, 69, 113};

    	FindMedianOfSortedArrays fm = new FindMedianOfSortedArrays();
    	return fm.findMedianOfArrays(arr1, arr2, 0, 4, 0, 4);
    }
    
    void callReorderLinkedList() {
    	
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	head.next.next.next = new ListNode(4);
    	
    	ReorderLinkedList rll = new ReorderLinkedList();
    	rll.reorderList(head);
    	
    	head.printll(head);
    }
    
    
    void callAdd2NumbersLL() {
    	
    	ListNode head1 = new ListNode(2);
    	head1.next = new ListNode(4);
    	head1.next.next = new ListNode(3);

    	ListNode head2 = new ListNode(9);
    	head2.next = new ListNode(9);
    	head2.next.next = new ListNode(9);
    	
    	
    	Add2NumbersLL addnum = new Add2NumbersLL();
    	ListNode newll  = addnum.addTwoNumbers(head1, head2);
    	
    	head1.printll(newll);
    }
    
    void callGS1() {
    	
    	ListNode head1 = new ListNode(2);
    	head1.next = new ListNode(4);
    	head1.next.next = new ListNode(3);

    	ListNode head2 = new ListNode(9);
    	head2.next = new ListNode(9);
    	head2.next.next = new ListNode(9);
    	
    	
    	Add2NumbersLL addnum = new Add2NumbersLL();
    	ListNode newll  = addnum.addTwoNumbers(head1, head2);
    	
    	head1.printll(newll);
    }
    
    
    void compareSortingAlgos_Asc() {
    	
    	//Sorted
    	int size = 65536;
    	int[] arr = new int[size];
    	
    	for(int i=0;i<size;i++)
    		arr[i]= i;
    	
    	SelectionSort ssort = new SelectionSort();
    	InsertionSort isort = new InsertionSort();
    	HeapSort hsort = new HeapSort();
    	TreeSort treesort = new TreeSort();


    	long startTime = System.nanoTime();
        //callMethod
        
//        ssort.sort(arr);
//    	isort.sort(arr);
//    	hsort.sort(arr);
    	treesort.treeins(arr);


        long endtime = System.nanoTime();
        long elapsedTime = endtime - startTime;
        System.out.println(elapsedTime);
    }
    
    
    void compareSortingAlgos_Desc() {
    	
    	//Sorted
    	int size = 32768;
    	int[] arr = new int[size];
    	
    	for(int i=0;i<size;i++)
    		arr[i]= size-1-i;
    	
    	
    	SelectionSort ssort = new SelectionSort();
    	InsertionSort isort = new InsertionSort();
    	HeapSort hsort = new HeapSort();
    	TreeSort treesort = new TreeSort();


    	long startTime = System.nanoTime();
        //callMethod
        
//        ssort.sort(arr);
//    	isort.sort(arr);
//    	hsort.sort(arr);
    	treesort.treeins(arr);


        long endtime = System.nanoTime();
        long elapsedTime = endtime - startTime;
        System.out.println(elapsedTime);
    }
    
    
  void compareSortingAlgos_Rand() {
    	
    	//Sorted
    	int [] sizes = {4, 256, 4096, 16384, 32768};
    	
    	for(int size : sizes)
    	{
	    	int[] arr = generateRand(size);
	    	
	    	
	    	SelectionSort ssort = new SelectionSort();
	    	InsertionSort isort = new InsertionSort();
	    	HeapSort hsort = new HeapSort();
	    	TreeSort treesort = new TreeSort();
	    	long startTime = 0, endtime=0, elapsedTime=0;
	
	    	
	    	startTime = System.nanoTime();
	        ssort.sort(arr);
	        endtime = System.nanoTime();
	        elapsedTime = endtime - startTime;
	        System.out.println("Sel sort: "+ size +"--" +elapsedTime);

	        
	    	startTime = System.nanoTime();
	        isort.sort(arr);
	        endtime = System.nanoTime();
	        elapsedTime = endtime - startTime;
	        System.out.println("ins sort: "+ size +"--" +elapsedTime);
	        
	        
	    	startTime = System.nanoTime();
	    	hsort.sort(arr);
	        endtime = System.nanoTime();
	        elapsedTime = endtime - startTime;
	        System.out.println("heap sort: "+ size +"--" +elapsedTime);
	        
	        
	    	startTime = System.nanoTime();
	    	treesort.treeins(arr);
	        endtime = System.nanoTime();
	        elapsedTime = endtime - startTime;
	        System.out.println("tree sort: "+ size +"--" +elapsedTime);
    	}
    }
  
  
  int [] generateRand(int size) {
  	
  	Random rnd = new Random();
  	return rnd.ints(size, 0, 100000).toArray();
  }
  
  
  int getUsers() {
	  
	  HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
	  
	  int ind = map.get(26);
	  
	  System.out.println();
	  return 0;
  }
  
  
  
    


}




