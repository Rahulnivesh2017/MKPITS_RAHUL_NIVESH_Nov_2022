


class RemoveElement1
{
  public static void main(String []args)
  {
    int a[]={10,40,30,80,60,20};

    int del_ete=100;
    int count=0;

    for(int i=0;i<a.length;i++)
    {
      if(del_ete==a[i])
      {
        for(int j=i;j<a.length-1;j++)
        {
          a[j]=a[j+1];
          }
          count=count+1;
          break;
          }
          }
          if(count==0)
          {
           System.out.println("Element not found");
           }
           else
           {
           System.out.println("Element deleted successfully");
		    }
           for(int i=0;i<a.length;i++)
           {
            System.out.println(a[i]+" ");
            }
            }
            }
