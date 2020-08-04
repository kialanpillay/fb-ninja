public class Lists{

    static insertAfter(Element e, int data){
        if(e == null){
            throw new RuntimeException("The element cannot be null");
        }
        if(data == null){
            throw new RuntimeException("The data cannot be null");
        }
        Element n = new Element(data);
        n.next = e.next;
        e.next = n;
    }

    static LinkedList sum(LinkedList a, LinkedList b){
        if(a == null || b == null){
            throw new RuntimeException("The LinkedList cannot be null");
        }

        StringBuilder a_builder, b_builder = new StringBuilder();

        Element current = a.head;

        while(current != null){
          a.append(current.data);
          current = current.next;
        }

        current = b.head;

        while(current != null){
          b.append(current.data);
          current = current.next;
        }

        String[]a_digits = a_builder.toString().split("");
        String[]b_digits = b_builder.toString().split("");
        int a, b = 0;

        if(a_digits.length > 0){
          for (int index = a_digits.length - 1; index >= 0; index--){
            a += a_digits[index] * (10 ** i)
          }
        }

        if(b_digits.length > 0){
          for (int index = b_digits.length - 1; index >= 0; index--){
            a += a_digits[index] * (10 ** i)
          }
        }

        int sum = a + b;
        String[]sum_arr = Integer.toString(sum).split("");

        Element newHead = new Element(sum_arr[0]);
        Element digit = newHead;

        for (int index = 1; sum_arr.length; index++){
           insertAfter(current, sum_arr[i])
           digit = digit.next;
        }

        return new LinkedList(newHead);
    }

    public static void main(String[]args){

    }
}

class LinkedList
{
    Element head;
    LinkedList(Element head){
      this.head = head;
    }
    class Element
    {
        int data;
        Element next;

        Element(int d) {
          data = d;
          next = null;
        }
    }
}
