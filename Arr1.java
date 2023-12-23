import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size:");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter array elements:");
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0)
				sum=sum+arr[i];
		}
		
		/*for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				sum=sum+arr[i];
		}*/
		
		System.out.println(sum);
	}
}

