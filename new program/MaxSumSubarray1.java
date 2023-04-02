class MaxSumSubarray1
{
   public static void main(String []args)
   {
     int a[]={4,-2,-3,4,-1,-2,1,5,-3};
     int max_so_for=Integer.MIN_VALUE;
     int max_ending_here=0;
     int start=0,end=0,s=0;
     
     for(int i=0;i<a.length;i++)
     {
       max_ending_here=max_ending_here+a[i];
       if(max_so_for<max_ending_here)
       {
         max_so_for=max_ending_here;
         start=0;
         end=0;
         }
         if(max_ending_here<0)
         {
           max_ending_here=0;
           s=i+1;
           }
           }
           System.out.println(max_so_for);
           System.out.println("start index position of sub array is "+start+" and ending position is "+end);
           }
           }
           