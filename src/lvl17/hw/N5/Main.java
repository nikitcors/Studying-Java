package lvl17.hw.N5;


public class Main {
    char[] value;
    int count;

    public Main append(CharSequence s) {
//        synchronized (Solution.class) {
        if (s == null) {
//            synchronized (this) {
            s = "null";
//            }
        }

        if (s instanceof String) {
//            synchronized (this) {
            return this.append((String) s);
//            }
        }

        if (s instanceof Main) {
//            synchronized (this) {
            return this.appendThis((Main) s);
//            }
        }
//        }
        return this.append(s);
    }

    public synchronized Main appendThis(Main s) {
        //do something here....
        return this;
    }

    private static final java.io.ObjectStreamField[] serialPersistentFields =
            {
                    new java.io.ObjectStreamField("value", char[].class),
                    new java.io.ObjectStreamField("count", Integer.TYPE),
                    new java.io.ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();
//        synchronized (fields) {
        fields.put("value", value);
        fields.put("count", count);
        fields.put("shared", false);
//        }
//        synchronized (s) {
        s.writeFields();
//        }
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
//        synchronized (new java.io.IOException()) {
        java.io.ObjectInputStream.GetField fields = s.readFields();
        value = (char[]) fields.get("value", null);
        count = fields.get("count", 0);
//        }
    }

    public static void main(String[] args) {

    }
}
