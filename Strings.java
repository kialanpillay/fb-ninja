

public class Strings{

    static String int2str(int input){
        if(input == null){
            throw new Exception("The input cannot be null");
        }
        return Integer.toString(i);
    }

    static int str2int(String input){
        if(input == null){
            throw new Exception("The input cannot be null");
        }
        if(input.length() == 0){
            throw new Exception("The input cannot be empty");
        }
        return Integer.parseInt(input);
    }

    static String longestrun(String input){
        if(input == null){
            throw new Exception("The input cannot be null");
        }
        if(input.length() == 0){
            return "";
        }
        char current_letter = input.charAt(0);
        char max_letter = input.charAt(0);
        int run = 0; 
        int max = 0;
        for (int i = 1; i < input.length(); i++){
            if(input.charAt(i)!=current_letter){
                run = 1;
                current_letter = input.charAt(i);
            }
            else{
                run++;
            }

            if(run > max){
                max = run;
                max_letter = current_letter;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < max; i++){
            str.append(max_letter);
        }
        return str.toString();
    }

    static String deletechars(String input, String remove){
        if(input == null || remove == null){
            throw new Exception("The input parameters cannot be null");
        }
        if(remove.length() == 0 || input.length() == 0){
            return input
        }
        StringBuilder str = new StringBuilder("[");
        str.append(remove);
        str.append("]");
        return input.replaceAll(str.toString(), "");
    }

    public static void main(String[]args){
        System.out.println(int2str(-30));
        System.out.println(str2int("-30"));
        System.out.println(longestrun("abccccddef"));
        System.out.println(deletechars("abccccddef", "abc"));
    }
}