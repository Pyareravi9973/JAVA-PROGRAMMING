//Find area of circle by command line
class Area_of_circle
{
    public static void main(String[] args) {
        float area,r;
        r=Float.valueOf(args[0]).floatValue();
        area=3.14f * r * r;
        System.out.println("Area of circle ="+area);
    }
}