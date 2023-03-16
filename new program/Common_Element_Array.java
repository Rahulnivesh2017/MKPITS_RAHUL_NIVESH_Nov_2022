// Find Common element between two arrays.

class Common_Element_Array{

public static void main(String []args){

int a[]={8,15,6,21,25,20};

int b[]={3,8,9,15,6,21};

int i,j;
                                            // a[8]==b[3] false
                                            // a[8]==b[8] True
for(i=0;i<a.length;i++)
{                                             // a[15]==b[3] false
                                              // a[15]==b[8] false
for(j=0;j<b.length;j++)                      //a[15]==b[9] false
{                                            // a[15]==b[15] True

if(a[i]==b[j])
{                                            // a[6]==b[3] false
                                             // a[6]==b[8] false
                                              // a[6]==b[9] false
System.out.println(a[i]);                     // a[6]==b[15] false
                                              // a[6]==b[6] True

}
}
}
}
}