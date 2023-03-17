
public class program_to_check_uppercase_lowercase {

    public static void main(String[] args) {
        int upr=0,lwe=0,dg=0,sc=0,sp=0;
        String s="Bharati Dhakate 11@gmail.com";
        char c[]=s.toCharArray();

        for (int i= 0; i < c.length; i++) {
            
            if(c[i]>='A' && c[i]<='Z'){
                upr++;
            } 
            else if (c[i]>='a' && c[i]<='z') {
                lwe++;
                
            } else if (c[i]>='0' && c[i]<='9') {
                dg++;
                
            } else if (c[i] ==' ') {
                sc++;
            } else {
                sp++;
            }

        }
        System.out.println("Upper case :"+upr);
        System.out.println("lowercase :"+lwe);
        System.out.println("number :"+dg);
        System.out.println("space"+sp);
        System.out.println("Special charecter"+sc);

    }
}
