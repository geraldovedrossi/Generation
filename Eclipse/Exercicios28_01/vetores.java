package familia44_3;

import java.util.Arrays;

public class vetores {

	public static void main(String[] args) {

		int[] arr = new int[3];
		
		
        for(int i = 0; i < 5; i++)
        {
            if(i == arr.length)
            {
                int[] newArr = Arrays.copyOf(arr, arr.length + 1);
                arr = newArr;
            }
            arr[i] = i*2;
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
		

	}

}
