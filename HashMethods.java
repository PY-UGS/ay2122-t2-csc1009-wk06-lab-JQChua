import java.util.* ;  
public class HashMethods {
    public int insertindex;

    public HashMethods(){


    }
    public void addAndSort (HashMap<Integer, Integer> hashmap, int value)
    {
    
        for (int i = 0; i < hashmap.size(); i++) {
            if (value >= hashmap.get(i) && value <= hashmap.get(i+1))
            {
                this.insertindex = i+1;
                break;
            }
          }     
        
          for (int j = hashmap.size() - 1 ; j >= this.insertindex; j--)
          { 
              int newindex = j+1;
              int newvalue = hashmap.get(j);
              hashmap.put(newindex,newvalue);
          }
          hashmap.replace(this.insertindex,value);
    }
    public void swapValues (HashMap<Integer, Integer> hashmap, int indexOne, int indexTwo) 
    {
        int value1 = hashmap.get(indexOne);
        int value2 = hashmap.get(indexTwo);
        hashmap.replace(indexOne,value2);
        hashmap.replace(indexTwo,value1);

    }

    public int findValue (HashMap<Integer, Integer> hashmap, int searchVal)
    {
        Random random = new Random();
        int number;
        for (int i = 0; i < 500; i++) {
            number = random.nextInt(1000,9999);
            hashmap.put(i,number);
        }
        for (int j = 0; j < 500; j++) {
            if (hashmap.get(j) == searchVal)
            {
                return j;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        HashMap<Integer, Integer>  hashmap = new HashMap<Integer, Integer>();
        hashmap.put(0,1);
        hashmap.put(1,3);
        hashmap.put(2,5);
        hashmap.put(3,7);
        hashmap.put(4,9);
        hashmap.put(4,11);
        System.out.println("Hashmap Before");
        System.out.println(hashmap);
        HashMethods test = new HashMethods();
        int value = 6;     
        test.addAndSort(hashmap,value);
        System.out.println("Hashmap After");
        System.out.println(hashmap);
      


        System.out.println("Hashmap Before");
        System.out.println(hashmap);
        test.swapValues(hashmap, 1, 3);
        System.out.println("Hashmap After swapping positions:");
        System.out.println(hashmap);

        HashMap<Integer, Integer>  hashmap2 = new HashMap<Integer, Integer>(500);
        System.out.println("Hashmap Before");
        System.out.println(hashmap2);
        Random random = new Random();
        int number = random.nextInt(1000,9999);
        int position = test.findValue(hashmap2, number);
        System.out.println("Hashmap After");
        System.out.println(hashmap2);
        System.out.println("Positions of value:");
        System.out.println(position);


    }
    
}
