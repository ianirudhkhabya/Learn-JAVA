package Others.AnonymousInnerClass;

public class AnonymousInnerClass {

//        anonymous class = an inner class without a name
//                          only a single object is created from one
//                          The object may have “extras” or "changes"
//                          and no need to create a separate innerclass
//                          when it only needs it once.
//                          Helps us to avoid cluttering code with a class name
//
//                          Syntax is similar to a constructor,
//                          except that there is also a class definition
//                          within a block of code.
//                          GREAT FOR LISTENERS

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        Greeting greeting1 = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("Yo Anirudh");
            }
        };

//        greeting.welcome();
//        greeting1.welcome();

        MyFrame myFrame = new MyFrame();
    }
}
