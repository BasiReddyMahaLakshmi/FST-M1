package activities;


    abstract class Book{
        String title="APIM";
        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    class MyBook extends Book {
        public void setTitle(String s) {
            title = s;
        }
    }
    public class Activity5 {

        public static void main(String []args) {
            Book newNovel = new MyBook();
            newNovel.setTitle(newNovel.title);
            System.out.println("The title is: " + newNovel.getTitle());
        }
    }
