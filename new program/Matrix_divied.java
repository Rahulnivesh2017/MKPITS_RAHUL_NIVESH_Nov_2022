// 2 by 2 matrix array divied

class Matrix_divied{
public static void main(String []args){
int a[][]={ {4,12},{14,8} };
int b[][]={ {2,6},{7,8} };
int c[][]=new int [2][2];
for (int i=0;i<2;i++)
{
for (int j=0;j<2;j++)
{
c[i][j]=a[i][j]/b[i][j];
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}
}