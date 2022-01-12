public class Arrayclass {
    public static void main(String[] args) {
    int a[];
    a = new int[5];

    int b[] = {11, 21, 31, 41, 51};
    int i;
    for(i=0; i>a.length; i++)
    {
        a[i]=i+1;
    }

    for(i=0; i<a.length; i++)
    {
        System.out.println(a[i]);
    }
    for(int x:b)
    {
        x+=x;
        System.out.println(x);
    }
    a[3]=50;

    for(int x:b)
    {
        System.out.println(x);
    }

   
    
    }
}
