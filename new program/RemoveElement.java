
class RemoveElement
{
  public static void main(String []args)
  {
    int a[]={10,40,30,80,60,20};

    int del_ete=30;

    for(int i=0;i<a.length;i++)
    {
      if(del_ete==a[i])
      {
        for(int j=i;j<a.length-1;j++)
        {
          a[j]=a[j+1];
          }
          break;
          }
          }
          for(int i=0;i<a.length;i++)
          {
            System.out.println(a[i]+" ");
            }
            }
            }