package ExceptonQn11;

public class ArrayExcepton {
	public ArrayExcepton() {
			// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		try {
			for(int i=0;i<=4;i++) {
					a[i]=i++;
					
			}
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("The array can be called only 4 times");
		}
		finally {
					System.out.println("Completed!!!");
		}
			

		}

	}


