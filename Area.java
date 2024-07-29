//Find Area of circle and value passes by command line //
class Area
{
    public static void main(String[] args)
     {
        float a,r;
        r=Float.valueOf(args[0]).floatValue();
        a=3.14f * r * r;
        System.out.println("Area=" +a);
    }
}