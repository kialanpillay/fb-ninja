public class Stacks{

    public static Stack<T> sort(Stack<T>input) {
        if (input == null || input.isEmpty()){
            throw new RuntimeException("The input is null or empty.");
        }
        Stack<Integer> temp = new Stack<Integer>();
        while(!input.isEmpty())
        {
            T value = input.pop();
            while(!temp.isEmpty() && temp.peek() > temp)
            {
                input.push(temp.pop());
            }
            temp.push(temp);
        }
        return temp;
    }

    public static void main(String[]args){

    }
}

public class Stack<T>{

    private Stack<T> prev;
    private T head;

    Stack(){
      stack = new T[];
    }

    Stack(T value){
      this.head = value;
    }

    Stack(Stack<T> prev, T value){
      this.prev = prev;
      this.head = value;
    }

    public void push(T value){
        this.prev = new Stack<T>(this.prev, value);
        this.head = value;
    }

    public T pop(){
        if(this.prev == null)  {
            throw new RuntimeException("Stack is empty!")
        }
        T head = this.head;
        this.head = this.prev.head;
        this.prev = this.prev.prev;
        return head;
    }

    public T get_min(){
        T min = T.MAX;
        if (this.prev == null){
            throw new RuntimeException("Stack is empty!");
        }
        Stack<T> copy = this.prev;
        while(!copy.isEmpty()){
          T compare = copy.pop();
          if(compare < min){
              min = compare;
          }
        }
        return min;
        }
    }
}

public class Queue<T>{
  private Stack<T> stack_one;
  private Stack<T> stack_two;

  public void enqueue(T value){
    while(!stack_one.isEmpty()){
      stack_two.push(stack_one.pop());
    }

    stack_one.push(value);

    while(!stack_two.isEmpty()){
      stack_one.push(stack_two.pop());
    }
  }

  public T dequeue(T value){
    if(stack_one.isEmpty()){
      throw new RuntimeException("The input is null or empty.");
    }

    T value = stack_one.pop();
    return value;
  }
}
