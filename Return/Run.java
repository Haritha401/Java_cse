public class Run{
    public int add (int numOne,int numTwo)
    {
        int numThree = numOne+numTwo;
        return numThree;
    }
    public static void main(String args[]){
        int numOne =10;
        System.out.println(numOne);
        System.out.println("welcome");
        Run obj = new Run();
        int c = obj.add(10,20);
        System.out.println(c);
    }
}