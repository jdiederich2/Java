package challenge5andAHalf;


public class CustomArrayList {
	
	/**
	 * WELCOME TO CHALLENGE 5 and 1/2! This is going to be a fairly small challenge, but it will
	 * probably make you think outside the box. Today you'll be creating a custom implementation of
	 * an ArrayList. Now, array lists are actually quite simple. They're just arrays that change
	 * size dynamically to fit the objects put into them. They start out small and when the array
	 * they're holding fills up, they copy all of their objects into a larger array. That's it!
	 * Easy, right? Well, I've created a bunch of JUnit tests for this. All you have to do is make
	 * them all pass. Simple as that. I've left a ton of "Todo" comments. Make sure you read them
	 * all!
	 * 
	 * Let me know when you're going to start! I'll start the timer!
	 */
	
	
	public static final int	DEFAULT_STARTING_ARRAY_SIZE	= 4;
	private Object[] array;
	private int	currentLength = 0;
	
	
	public CustomArrayList() {
		// a new array of objects should be stored within the instance variable "array". Its
		// starting size should be the default size (specified as DEFAULT_STARTING_ARRAY_SIZE).
		// The array should be empty by default.
		array = new Object[DEFAULT_STARTING_ARRAY_SIZE];
	}
	
	
	public CustomArrayList(int startingSize) {
		// a new array of objects should be stored within the instance variable "array". Its
		// starting size should be the size that's passed in. If the input isn't valid, it should
		// default to the DEFAULT_STARTING_ARRAY_SIZE.
		// The array should be empty by default.
		if (startingSize > 0) {
			array = new Object[startingSize];
		} else {
			array = new Object[DEFAULT_STARTING_ARRAY_SIZE];
		}
		
	}
	
	
	public boolean add(Object o) {
		// Add the passed in object on the end of the array (at the "currentLength" location).
		// Then increment currentLength by 1.
		// If the currentLength is longer than the size of the array you're using. You'll need to
		// copy all of the elements into a new array with a larger size and then save THAT array
		// into the array instance variable (typically, doubling the size is a good rule of thumb
		// because this is an intensive process).
		// Return true if the operation was successful. If it failed for any reason, return false.
		array[currentLength] = o;
		currentLength++;
		
		if (array.length <= currentLength) {
			Object[] tempArray = new Object[currentLength * 2];
			
			for (int i = 0; i < array.length; i++) {
				tempArray[i] = array[i];
			}
			
			array = tempArray;
		}
		
		return true;
	}
	
	
	// This one can be a bit tricky ;)
	public boolean add(Object o, int index) {
		// Add the passed in object to the passed in position in the array, shifting all other
		// objects in the array down by 1 and increment currentLength by 1.
		// If the currentLength is longer than the size of the array you're using. You'll need to
		// copy all of the elements into a new array with a larger size and then save THAT array
		// into the array instance variable (typically, doubling the size is a good rule of thumb
		// because this is an intensive process).
		// Return true if the operation was successful. If it failed for any reason, return false.
		Object[] tempArray = array.clone();
		tempArray[index] = o;
		
		if (array.length <= currentLength) {
			Object[] tempArray2 = new Object[currentLength * 2];
			for (int i = 0; i < tempArray2.length; i++) {
				tempArray2[i] = tempArray[i];
			}
		}
		
		for (int i = index + 1; i < tempArray.length; i++) {
			tempArray[i] = array[i-1];
		}
		
		currentLength++;
		array = tempArray;
		
		return true;
	}
	
	
	public boolean addToBeginning(Object o) {
		// Add the passed in object to the first position in the array, shifting all other
		// objects in the array down by 1 and increment currentLength by one.
		// If the currentLength is longer than the size of the array you're using. You'll need to
		// copy all of the elements into a new array with a larger size and then save THAT array
		// into the array instance variable (typically, doubling the size is a good rule of thumb
		// because this is an intensive process).
		// Return true if the operation was successful. If it failed for any reason, return false.
		return add(o, 0);
	}
	
	
	public boolean remove(Object o) {
		// Using the ".equals" method, compare the passed in object to all of the other
		// objects in the array. If you find one that matches, remove it from the array (by simply
		// shifting all of the other objects in the array up by one and de-incrementing the
		// currentLength by 1. If you successfully removed it, return true. If you were unable to
		// find a matching object in the array, return false.
		boolean didntFail = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(o)) {
				didntFail = true;
				for (int j = i + 1; j < array.length; j++) {
					array[j - 1] = array[j];
				}
				
				currentLength--;
				break;
			}
		}
		return didntFail;
	}
	
	
	public boolean removeAt(int index) {
		// remove the object at the given index from the array (by simply
		// shifting all of the other objects in the array up by one and de-incrementing the
		// currentLength by 1. If you successfully removed it, return true. If the index is out of
		// bounds, return false.
		if (currentLength < index || index < 0) {
			return false;
		}
		
		for (int i = index + 1; i < array.length; i++) {
			array[i -1] = array[i];
		}
		
		currentLength--;
		return true;
	}
	
	
	public int size() {
		// Return the currentLength of the array
		return currentLength;
	}
	
	
	public int arraySize() {
		// return the maximum number of items in the current array (before you have to expand
		// its size).
		return array.length;
	}
	
	
	public boolean contains(Object o) {
		// use the ".equals" method to determine whether or not the array contains the passed
		// in object. If it does, return true, if not, return false.
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
}
