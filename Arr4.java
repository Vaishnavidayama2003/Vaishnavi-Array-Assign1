import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter array size:");
		int size=Integer.parseInt(br.readLine());
		
		char arr[]=new char[size];
		
		System.out.println("Enter array elements:");
		
		/*for(int i=0;i<arr.length;i++){
			arr[i]=br.read();
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
				System.out.println(arr[i]);	
		}*/
		
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
			br.skip(2);
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
				System.out.println("vowels are:"+arr[i]);	
		}
		
	}
}

