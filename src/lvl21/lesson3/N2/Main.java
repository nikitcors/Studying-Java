package lvl21.lesson3.N2;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Main {

    public static String greeting = "Hello world";

    /**
     * OutputToConsole is the inner base class for improving your attentiveness.
     * An OutputToConsole object encapsulates the information needed
     * for the displaying [greeting] variable to the console.
     *
     */
    public static class OutputToConsole implements Externalizable {
        private int counter;

        /**
         * @param out A stream for an externalization
         * @throws java.io.IOException
         */

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            counter = in.readInt();
        }

        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(counter);
        }
    }
    public static void main(String[] args)  {

    }
}
