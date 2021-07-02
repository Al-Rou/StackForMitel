public class Stack {
    private int[] stackArr;
    public static int counter;
    public Stack()
    {
        stackArr = new int[100];
        counter = 0;
    }
    public void insert(int input)
    {
        stackArr[counter] = input;
        counter++;
    }
    public int pop()
    {
        counter--;
        int result = stackArr[counter];
        stackArr[counter] = 0;
        return result;
    }
    public boolean isEmpty()
    {
        if(counter == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
