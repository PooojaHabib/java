//find min element in array(pass arr argument)
class testarray2
{
	static void min(int arr[])
	{
		int min=arr[0];
	for(int i=0;i<arr.length;i++)
		if(min<arr[i])
			min=arr[i];
		System.out.println(min);

	}
	public static void main(String args[])
	{
		int a[]=new int[4];
		a[0]=45;
		a[1]=66;
		a[2]=8;
		a[3]=12;
	    min(i);
	}  }


