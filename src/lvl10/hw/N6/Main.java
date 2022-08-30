package lvl10.hw.N6;


public class Main {

    public static void main(String[] args) {


    }

    public static class Human{
        String name;
        int age;
        int height;
        boolean gender;
        boolean children;
        boolean parents;

        public Human(){
            this.name = "";
            this.age = 0;
            this.height = 0;
            this.gender = true;
            this.children = false;
            this.parents =false;
        }

        public Human(String name){
            this.name = name;

        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age, int height, boolean gender){
            this.name = name;
            this.age = age;
            this.height = height;
            this.gender = gender;
        }

        public Human(String name, int age, int height, boolean gender, boolean children){
            this.name = name;
            this.age = age;
            this.height = height;
            this.gender = gender;
            this.children = children;
        }

        public Human(String name, int age, int height, boolean gender, boolean children, boolean parents){
            this.name = name;
            this.age = age;
            this.height = height;
            this.gender = gender;
            this.children = children;
            this.parents =parents;
        }

        public Human(String name, int height, boolean children, boolean parents){ //Для девушек, которые хотят скрыть свой возраст
            this.name = name;
            this.age = 0;
            this.height = height;
            this.gender = false;
            this.children = children;
            this.parents =parents;
        }

        public Human(String name, boolean children, boolean parents){
            this.name = name;
            this.children = children;
            this.parents =parents;
        }

        public Human(String name, boolean parents){
            this.name = name;
            this.parents =parents;
        }
    }

}
