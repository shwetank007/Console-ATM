class Test
{
	public float div(float a,float b)
	{
		float s = a%b;
		return s;
    }
	public static void main(String args[])
	{
		Test ob = new Test();
		float sum = ob.div(100.2f,100f);
		System.out.println("Sum"+sum);
	}
}