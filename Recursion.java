public class Recursion {

  public static int fibonacci(int n){

    int f[] = new int[2];
    f[0] = 0;
    f[1] = 1;

    for(int i = 2; i <= n; i++){
      f[i] = f[i-1] + f[i-2];
    }

    return f[n];
  }

  public static int factorial(int n){

    int factorial = 1;

    for(int i = 2; i <= n; i++){
      factorial *= (i-1)
    }

    return factorial;
  }

  public static void main(String[]args){

  }
}
