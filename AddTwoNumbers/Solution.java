/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //System.out.println(  getlength(l1) );
        //System.out.println(  listToInt( l1 ) );
        //System.out.println(  listToInt( l2 ) );

        long num  = listToLong( l1 ) + listToLong( l2 );

        System.out.println(num);

        return LongToList(num);


    }


    public ListNode LongToList(long x){

        String str = Long.toString(x);

        StringBuffer buffer = new StringBuffer(str);

        str = buffer.reverse().toString();

        System.out.println(str);


        ListNode node = new ListNode(0);
        ListNode ptr = node;


        for(int i = 0; i < str.length() ;i++){
            node.next = new ListNode(  Character.getNumericValue( str.charAt(i) ) );
            node = node.next;
        }

        return ptr.next;



    }


    public Long listToLong(ListNode node){



        long[] num = new long[ getlength(node) ];

        for(int i = num.length -1 ; i >= 0; i--){

            num[i] = node.val;
            node = node.next;

        }

        System.out.println(Arrays.toString(num));

        StringBuilder strNum = new StringBuilder();

        for (long d : num)
        {
            strNum.append(d);
        }

        long finalLong = Long.parseLong(strNum.toString());
        System.out.println(finalLong);

        return finalLong;
    }


    public int getlength(ListNode node){
        if (node == null) return 0;

        int count = 1;

        while (node.next != null){
            count++;
            node = node.next;
        }

        return count;

    }



}
