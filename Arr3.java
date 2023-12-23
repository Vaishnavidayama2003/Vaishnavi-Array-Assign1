import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size:");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter array elements:");
		
		int product=1;
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0)
				product=product*arr[i];
		}
		
		/*for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int product=1;
		
		for(int i=0;i<arr.length;i++){
			if(i%2!=0)
				product=product*arr[i];
		}*/
		
		System.out.println(product);
	}
}

