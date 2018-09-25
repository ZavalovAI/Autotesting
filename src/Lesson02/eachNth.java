package Lesson02;

    class EveryNth {

        public static String everyNth(String str, int n)
        {
            String result = "";
            for (int i=0; i<str.length(); i = i + n)
            {
                result = result + str.charAt(i);
            }
            return result;
        }
        public static void main(String[] args)
        {
            System.out.println(everyNth("abcdefgh",1));
            System.out.println(everyNth("123456789",2));
            System.out.println(everyNth("ячсмить",3));
        }
    }



