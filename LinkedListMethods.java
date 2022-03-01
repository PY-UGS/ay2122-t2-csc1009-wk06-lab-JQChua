import java.util.*;
public class LinkedListMethods {
    public LinkedListMethods()
    {

    }

    public void addAndSort (LinkedList<Integer> list, int value)
    {
        for (int i = 0; i < list.size(); i++) {
            if (value >= list.get(i) && value <= list.get(i+1))
            {
                int element = i+1;
                list.add(element, value);
                break;
            }
          }     
    }
    public void swapValues (LinkedList<Integer> list, int indexOne, int indexTwo) 
    {
        int element1 = list.get(indexOne);
        int element2 = list.get(indexTwo);
        list.set(indexOne, element2);
        list.set(indexTwo, element1);
    }

    public int findValue (LinkedList<Integer> list, int searchVal)
    {
        Random random = new Random();
        int number;
        for (int i = 0; i < 500; i++) {
            number = random.nextInt(1000,9999);
            list.add(number);
        }
        return list.indexOf(searchVal);
    }

    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("List Before");
        System.out.println(list);
        int newinteger = 6;
        LinkedListMethods test = new LinkedListMethods();
        test.addAndSort(list,newinteger);
        System.out.println("List After inserting new integer " + newinteger );
        System.out.println(list);

        System.out.println("List Before");
        System.out.println(list);
        test.swapValues(list, 2, 5);
        System.out.println("List After swapping positions:");
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        System.out.println("List Before");
        System.out.println(list2);
        Random random = new Random();
        int number = random.nextInt(1000,9999);
        int position = test.findValue(list2, number);
        System.out.println("List After");
        System.out.println(list2);
        System.out.println("Positions of value");
        System.out.println(position);
    






 
  
    }
}