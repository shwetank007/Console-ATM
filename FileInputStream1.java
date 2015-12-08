import java.io.*; 
class FileInputStream1
{
public static void main(String args[])
{
FileInputStream fis=null;
FileOutputStream fos=null;
try
{
fis=new FileInputStream("C:\\Users\\niraj\\Desktop\\niraj\\niraj1.txt");
fos=new FileOutputStream("C:\\Users\\niraj\\Desktop\\niraj\\niraj2.txt");
int Data;
 while((Data=fis.read())>-1)
{
fos.write(Data);
}
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
try
{
fis.close();
fos.flush();
fos.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}