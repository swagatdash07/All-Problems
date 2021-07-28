package numbers;
import java.util.*;
public class numbers {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int j=1;
if(x%2==0)
{
for(int i=1;i<x;i++)
{
System.out.print(j +", ");
j+=2;
}
}
else
{
for(int i=1;i<=x;i++)
{
System.out.print(j +",");
j+=2;
}
}
}
}
Q3.
package series;
import java.util.*;
public class series {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
for(int i=1;i<=x;i++)
{
if(i%2==0)
{
for(int j=i;j>0;j--)
{
System.out.print(j+", ");
}
System.out.println();
}
else
{
for(int j=1;j<=i;j++)
{
System.out.print(j+", ");
}
System.out.println();
}
}
for(int i=x-1;i>0;i--)
{
if(i%2==0)
{
for(int j=i;j>0;j--)
{
System.out.print(j+", ");
}
System.out.println();
}
else
{
for(int j=1;j<=i;j++)
{
System.out.print(j+", ");
}
System.out.println();
}
}
}
}
