import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ch11_2
{
    /*Write a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating
    elements from the two lists, in the following order:
       • First element from first list
       • First element from second list
       • Second element from first list
       • Second element from second list
       • Third element from first list
       • Third element from second list
       • . . .
    If the lists do not contain the same number of elements, the remaining elements from the longer list should be
    placed consecutively at the end. For example,
    for a first list of [1, 2, 3, 4, 5]
    and a second list of [6, 7, 8, 9, 10, 11, 12],
    a call of alternate(list1, list2) should return a list containing
    [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].*/

    public void run()
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(2);
        list2.add(10);
        list2.add(11);
        list2.add(1);
        list2.add(12);

        System.out.println(alternate(list1,list2));
    }

    public ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> listFinal = new ArrayList<>();
        ArrayList<Integer> copyList1 = list1;
        ArrayList<Integer> copyList2 = list2;

        while (copyList1.size() != 0 || copyList2.size() != 0)
        {
            if(copyList1.size() != 0)
            {
                if (listFinal.contains(copyList1.get(0)) == false)
                {
                    listFinal.add(copyList1.get(0));
                    copyList1.remove(0);
                }else
                {
                    copyList1.remove(0);
                }

            }
            if (copyList2.size() != 0)
            {
                if (listFinal.contains(copyList2.get(0)) == false)
                {
                    listFinal.add(copyList2.get(0));
                    copyList2.remove(0);
                }else
                {
                    copyList2.remove(0);
                }

            }
        }

        return listFinal;
    }

}
