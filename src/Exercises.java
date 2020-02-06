import java.util.ArrayList;

public class Exercises {

// Exercise 1 //

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		if ((a.get(0) == b.get(0)) || (a.get(a.size() - 1) == b.get(b.size() - 1))) {

			return true;

		}

		return false;	// default return value to ensure compilation

	}

// Exercise 2 //

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {

		ArrayList<String> emptyArrayList = new ArrayList();

		if (values.size() < n || values == null || n < 0 || values.isEmpty()) {

			return emptyArrayList;

		}

		ArrayList<String> combinedArrayList = new ArrayList();

		int nValue = n;

		for (int i = 0; i < n; i++) {
			combinedArrayList.add(values.get(i));
		}

		for (int i = n; i < n * 2; i++) {
			combinedArrayList.add(values.get(values.size() - nValue));

			nValue--;

		}

		return combinedArrayList;

	}

// Exercise 3 //

	public int difference(ArrayList<Integer> numbers) {

		if (numbers.size() < 1 || numbers == null) {

		return -1;		// default return value to ensure compilation

	}

		int smallestValue = numbers.get(0);
		int largestValue = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) > largestValue) {

				largestValue = numbers.get(i);

			}

			if (numbers.get(i) < smallestValue) {

				smallestValue = numbers.get(i);

			}
		}

	return largestValue - smallestValue;

	}

// Exercise 4 //

	public double biggest(ArrayList<Double> numbers) {

	if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {

		return -1;		// default return value to ensure compilation

	}

	for (int i = 0; i < numbers.size(); i++){

		if (numbers.get(i) < 0) {

			return -1;

		}
	}

	double firstDigit = numbers.get(0);
	double middleDigit = numbers.get(numbers.size() - 1);
	double lastDigit = numbers.get(numbers.size() / 2);

	if (firstDigit > lastDigit && firstDigit > middleDigit) {

		return firstDigit;

	} else if (lastDigit > middleDigit && lastDigit > firstDigit) {

		return lastDigit;

	} else if (middleDigit > lastDigit && middleDigit > firstDigit) {

		return middleDigit;

	} else if (middleDigit == lastDigit && middleDigit == firstDigit) {

		return firstDigit;

	}

	return -1;

}

// Exercise 5 //

	public ArrayList<String> middle(ArrayList<String> words) {

		ArrayList<String> empty = new ArrayList();

		if (words.isEmpty() || words == null) {

			return empty;

		} else if (words.size() < 3 || words.size() % 2 == 0) {

			return empty;

		}

		for (int i = 0; i < words.size(); i++) {

			if ((words.get(i) == null) ? true : false) {

				return empty;

			}
		}

		ArrayList<String> outputArrayList = new ArrayList();

		outputArrayList.add(words.get((int) Math.floor(words.size() / 2) - 1));
		outputArrayList.add(words.get((int) Math.floor(words.size() / 2)));
		outputArrayList.add(words.get((int) Math.floor(words.size() / 2) + 1));

		return outputArrayList;

	}

// Exercise 6 //

	public boolean increasing(ArrayList<Integer> numbers) {

		if (numbers == null) {

			return false;

		} else if (numbers.size() < 1) {

			return false;

		}

		for (int i = 1; i < numbers.size() - 1; i++) {

			if (numbers.get(i-1) < numbers.get(i) && numbers.get(i) < numbers.get(i+1)) {

				return true;

			}
		}

		return false;	// default return value to ensure compilation

	}

// Exercise 7 //

	public boolean everywhere(ArrayList<Integer> numbers, int x) {

		if (numbers == null || numbers.size() < 1) {

			return false;

		}

		int gap = 0;
		boolean lastPosition = false;

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) == x) {

				gap = 0;
				lastPosition = true;

			} else {

				if (i == 1 && lastPosition == false) {

					return false;

				} else if (lastPosition == false) {

					gap++;

				}

				lastPosition = false;

			}

				if (gap == 2) {

					return false;

				}
			}

		return true;

	}

// Exercise 8 //

	public boolean consecutive(ArrayList<Integer> numbers) {

		if (numbers.size() < 3 || numbers == null) {

			return false;

		}

  	int digitsInRow = 0;
		int remainder1 = -1;
		int remainder2 = -1;

		for (int i = 0; i < numbers.size(); i++) {

			remainder1 = numbers.get(i) % 2;

			if (remainder1 == 1) {

				if (remainder2 == 1) {

					digitsInRow++;

			 	} else {

					digitsInRow = 1;

				}

			} else {

				if (remainder2 == 0) {

					digitsInRow ++;

				} else {

					digitsInRow = 1;

				}
			}

			if (digitsInRow == 3) {

				return true;

			}

			remainder2 = remainder1;

		}

		return false;	// default return value to ensure compilation

	}

// Exercise 9 //

	public boolean balance(ArrayList<Integer> numbers) {


		if (numbers == null || numbers.size() < 2) {

			return false;

		}

		for (int i = 0; i < numbers.size() - 1; i++) {

	 	int halfSum1 = 0;
		int halfSum2 = 0;

		for (int x = i; x >= 0; x--){

			halfSum1 += numbers.get(x);

		}

		for (int z = i + 1; z < numbers.size(); z++) {

			halfSum2 += numbers.get(z);

		}

		if (halfSum1 == halfSum2) {

			return true;

		}
	}

			return false;	// default return value to ensure compilation

		}

// Exercise 10 //

	public int clumps(ArrayList<String> values) {

		if (values == null) {

			return -1;

		}

			for (int i = 0; i < values.size(); i++) {

				if (values.get(i) == null) {

					return -1;

				}
			}

			boolean equal = false;
			boolean prevEqual = false;

			String before = "";
			int clumps = 0;

			for (int i = 0; i < values.size(); i++) {

				if (before.equals(values.get(i))) {

					equal = true;

					if (prevEqual != true) {

						clumps++;

					 }
					} else {

						equal = false;

					}

					before = values.get(i);
					prevEqual = equal;

				}

				return clumps;

			}
		}
