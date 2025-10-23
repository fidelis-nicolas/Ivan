public class StringsInJava {
    public static void main(String[] args) {
        String name = "Fidelis";
        String sentence = "Java is a good programming language";

        System.out.println(name.toUpperCase());
        System.out.println(name.length());
//        System.out.println(name.charAt());

       for(int i=0; i<name.length(); i++){
           System.out.println(name.charAt(i));
           //System.out.println(String.valueOf(name.charAt(i)).toUpperCase());
       }

        System.out.println(sentence.replace('o', 'a'));
        System.out.println(sentence.replaceAll("good", "great"));

        StringBuilder words = new StringBuilder();
        words.append("Hello");
        words.append("\nIvan");


        System.out.println();

        System.out.println(words);


        StringBuffer bufferWords = new StringBuffer();




    }
}
