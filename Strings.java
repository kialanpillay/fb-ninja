public class Strings{

    static String int2str(int i){
        return Integer.toString(i);
    }

    static int str2int(String s){
        return Integer.parseInt(s);
    }

    static String longestrun(String s){
        if(s.length() == 0){
            return "";
        }
        char current_letter = s.charAt(0);
        char max_letter = s.charAt(0);
        int run = 0; 
        int max = 0;
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i)!=current_letter){
                run = 1;
                current_letter = s.charAt(i);
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

    static String deletechars(String s, String remove){
        StringBuilder str = new StringBuilder("[");
        str.append(remove);
        str.append("]");
        return s.replaceAll(str.toString(), "");
    }

    public static void main(String[]args){
        System.out.println(int2str(-30));
        System.out.println(str2int("-30"));
        System.out.println(longestrun("abccccddef"));
        System.out.println(deletechars("abccccddef", "abc"));
    }
}