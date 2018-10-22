package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	Item[] vector_ = new Item[] {new Item(2), new Item(4), new Item(6), new Item(8), new Item(10)};
	
	
	//BubbleSort
	//Node coverage and edge coverage case I
	@Test
	public void bubbleSortTest() {
		SortAlgos algosObject = new SortAlgos();
		
		Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
		algosObject.bubbleSort(vector_sorted);
		
		assertTrue(vector_[0].key == vector_sorted[0].key);
		assertTrue(vector_[1].key == vector_sorted[1].key);
		assertTrue(vector_[2].key == vector_sorted[2].key);
		assertTrue(vector_[3].key == vector_sorted[3].key);
		assertTrue(vector_[4].key == vector_sorted[4].key);
	}
	
	// Edge Coverage case I and Condition coverage case III
		@Test
		public void bubbleSortIfKeyFailsForSortedItems() {
			SortAlgos algosObject = new SortAlgos();
			
			Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
			algosObject.bubbleSort(vector_sorted);
		
			assertTrue(vector_[0].key == vector_sorted[0].key);
			assertTrue(vector_[1].key == vector_sorted[1].key);
			assertTrue(vector_[2].key == vector_sorted[2].key);
			assertTrue(vector_[3].key == vector_sorted[3].key);
			assertTrue(vector_[4].key == vector_sorted[4].key);
			
		}

		// Edge Condition coverage case I
			@Test
			public void bubbleSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.bubbleSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
				}
					
			}
			
			//Edge Condition coverage case II
			@Test
			public void bubbleSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.bubbleSort(vector_sort);
			
				assertTrue(8 == vector_sort[0].key);
				
				
			
			}
			
			
			//SelectionSort
			//Node coverage and edge coverage case I
			@Test
			public void selectionSortTest() {
				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
				algosObject.selectionSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
			}
			
			// Edge Coverage case I and Condition coverage case III
			@Test
			public void selectionSortIfKeyFailsForSortedItems() {
				SortAlgos algosObject = new SortAlgos();
					
				Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
				algosObject.selectionSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
					
			}

			// Edge Condition coverage case I
			@Test
			public void selectionSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.selectionSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
					}
							
			}
					
			//Edge Condition coverage case II
			@Test
			public void selectionSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
						
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.selectionSort(vector_sort);
					
				assertTrue(8 == vector_sort[0].key);
						
			}
			
			//InsertionSort
			//Node coverage and edge coverage case I
			@Test
			public void insertionSortTest() {
				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
				algosObject.insertionSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
			}
			
			// Edge Coverage case I and Condition coverage case III
			@Test
			public void insertionSortIfKeyFailsForSortedItems() {
				SortAlgos algosObject = new SortAlgos();
					
				Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
				algosObject.insertionSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
					
			}

			// Edge Condition coverage case I
			@Test
			public void insertionSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.insertionSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
					}
							
			}
					
			//Edge Condition coverage case II
			@Test
			public void insertionSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
						
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.insertionSort(vector_sort);
					
				assertTrue(8 == vector_sort[0].key);
						
			}
			
			//MergeSort
			//Node coverage and edge coverage case I
			@Test
			public void mergeSortTest() {
				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
				algosObject.mergeSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
			}
			
			// Edge Coverage case I and Condition coverage case III
			@Test
			public void mergeSortIfKeyFailsForSortedItems() {
				SortAlgos algosObject = new SortAlgos();
					
				Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
				algosObject.mergeSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
					
			}

			// Edge Condition coverage case I
			@Test
			public void mergeSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.mergeSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
					}
							
			}
					
			//Edge Condition coverage case II
			@Test
			public void mergeSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
						
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.mergeSort(vector_sort);
					
				assertTrue(8 == vector_sort[0].key);
						
			}
			
			//QuickSort
			//Node coverage and edge coverage case I
			@Test
			public void quickSortTest() {
				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
				algosObject.quickSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
			}
			
			// Edge Coverage case I and Condition coverage case III
			@Test
			public void quickSortIfKeyFailsForSortedItems() {
				SortAlgos algosObject = new SortAlgos();
					
				Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
				algosObject.quickSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
					
			}

			// Edge Condition coverage case I
			@Test
			public void quickSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.quickSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
					}
							
			}
					
			//Edge Condition coverage case II
			@Test
			public void quickSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
						
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.quickSort(vector_sort);
					
				assertTrue(8 == vector_sort[0].key);
						
			}
			
			//HeapSort
			//Node coverage and edge coverage case I
			@Test
			public void heapSortTest() {
				SortAlgos algosObject = new SortAlgos();
				
				Item[] vector_sorted = new Item[] {new Item(10), new Item(8), new Item(6), new Item(4), new Item(2)};
				algosObject.heapSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
			}
			
			// Edge Coverage case I and Condition coverage case III
			@Test
			public void heapSortIfKeyFailsForSortedItems() {
				SortAlgos algosObject = new SortAlgos();
					
				Item[] vector_sorted = new Item[]{new Item(2),new Item(6),new Item(10),new Item(8),new Item(4)};
				algosObject.heapSort(vector_sorted);
				
				assertTrue(vector_[0].key == vector_sorted[0].key);
				assertTrue(vector_[1].key == vector_sorted[1].key);
				assertTrue(vector_[2].key == vector_sorted[2].key);
				assertTrue(vector_[3].key == vector_sorted[3].key);
				assertTrue(vector_[4].key == vector_sorted[4].key);
					
			}

			// Edge Condition coverage case I
			@Test
			public void heapSortThrowsException() {
				SortAlgos algosObject = new SortAlgos();	
				try {
					algosObject.heapSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
					}
							
			}
					
			//Edge Condition coverage case II
			@Test
			public void heapSortOneInput() {

				SortAlgos algosObject = new SortAlgos();
						
				Item[] vector_sort = new Item[]{new Item(8)};
				algosObject.heapSort(vector_sort);
					
				assertTrue(8 == vector_sort[0].key);
						
			}
}
