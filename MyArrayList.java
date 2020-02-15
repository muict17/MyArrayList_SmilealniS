public class MyArrayList
{
	public static String[] Array;
	public static int length = 0;
	
	MyArrayList()
	{
		Array = new String[1000];
		length = 0;
	}
	
	public void add(String input)
	{
		Array[length] = input;
		length++;
	}
	
	public void remove(int index)
	{
		for(int i = index; i < length; i++)
		{
			Array[i] = Array[i + 1];
		}
		
		length--;
	}
	
	public String get(int index)
	{
		return Array[index];
	}
	
	public int size()
	{
		return length;
	}
	
	public void printData()
	{
		for(int i = 0; i < length; i++)
		{
			System.out.print(Array[i]);
		}
		
		System.out.print("\n");
	}
}
