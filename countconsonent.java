import java.util.Scanner;
class countconsonent 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sixe of array");
		char[]a=new char[sc.nextInt()];
		System.out.println("enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='a'&&a[i]!='e'&&a[i]!='o'&&a[i]!='i'&&a[i]!='u')
			{
				count++;
			}
		}
		System.out.println("consonents="+count);

	}
}
