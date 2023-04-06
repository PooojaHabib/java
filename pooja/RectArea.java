//program to illustratye classes and objects 
class Rectangle
{
	int length,width;
	void getdata(int x,int y)
	{
		length=x;
		width=y;
	} 
	int rectArea()
	{
		int area=length*width;
		return(area);
	}
}
class RectArea
{
	public static void main(String args[])
	{
		int area1,area2;
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle();
		rect1.length=15;
		rec1.width=10;
		rect2.getdata(30,50);
		area1=rect1.leghth*rect1.width;
		area2=rect2.rectArea();
		System.out.println("Area1="+area1);
		System.out.println("Area2="+area2);


	}
}
