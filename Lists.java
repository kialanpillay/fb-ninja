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

    public static void main(String[]args){
    }
}

class LinkedList
{
    Element head;
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
