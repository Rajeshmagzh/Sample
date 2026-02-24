class ArrayFunction
{
	public static void main(String []args)
	{
		int ar[]={1,2,6,10,9,3};
		
		ArrayFunction obj=new ArrayFunction();
		/*obj.maxi(ar);
		int a=10;
		int b=20;
		obj.add(a,b);
		obj.mini(ar);*/
		
		
		int[] res=obj.reversed(ar);
		for(int i=0;i<res.length;i++)
		{
			
			System.out.println(res[i]);
		}
		
		
	}
	public void maxi(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
			System.out.println("maximum num:"+max);
	}
	public void mini(int arr[])
	{
		int min=arr[0];
		
		for (int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
		
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	
	public int[] reversed(int ar[])
	{
		int br[]=new int[ar.length];
		int j=0;
		
		for(int i=ar.length-1;i>=0;i--)
		{
			br[j]=ar[i];
			j++;
			
		}
		return br;
		
		
	}
	
	
	
}