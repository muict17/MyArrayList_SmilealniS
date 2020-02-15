public class MyArrayList
{
	public static String[] Array;
	public static int length = 0;
	public int size = 1000;
	
	MyArrayList()
	{
		Array = new String[size];
		length = 0;
	}
	
	public void add(String input)
	{
		Array[length] = input;
		length++;
		size++;
	}
	
	public void remove(int index)
	{
		for(int i = index; i < length; i++)
		{
			Array[i] = Array[i + 1];
		}
		
		length--;
		size--;
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
