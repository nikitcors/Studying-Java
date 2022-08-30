package lvl13.hw.N5;


public class Main {
    public static void main(String[] args)  {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }
    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    public static class User implements DBObject {

        long id;
        String name;
        public User(){
            //super();
            this.id = 0;
            this.name = "";
        }
        public User(long id, String name){
            //super();
            this.id = id;
            this.name = name;
        }
        @Override
        public DBObject initializeIdAndName(long id, String name) {
            System.out.printf("User has name %s, id = %d \n",name, id );
            return new User(id, name);
        }

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }

}
