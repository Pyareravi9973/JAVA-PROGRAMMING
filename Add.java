//Adding of two number and value passes by command line//
class Add
{
    public static void main(String[] args) {
        int x,y,z;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        z=x+y;
        System.out.println("Addition=" +z);
    }
}