package lvl13.lesson1.N10;




public class Main {
    public static void main(String[] args) {

    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person{

    }

    interface Boss extends Person,Workable{

    }

    class SmartGirl implements Secretary{
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }

    class CleverMan implements  Boss{
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
    }
}
