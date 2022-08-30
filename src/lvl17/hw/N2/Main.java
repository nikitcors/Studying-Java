package lvl17.hw.N2;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
public class Main {
    public static void main(String[] args)   {

    }

    public static class Beach implements Comparable{
        private String name;      //название
        private float distance;   //расстояние
        private int quality;    //качество

        public Beach(String name, float distance, int quality) {
            this.name = name;
            this.distance = distance;
            this.quality = quality;
        }

        public synchronized String getName() {
            return name;
        }

        public synchronized void setName(String name) {
            this.name = name;
        }

        public synchronized float getDistance() {
            return distance;
        }

        public synchronized void setDistance(float distance) {
            this.distance = distance;
        }

        public synchronized int getQuality() {
            return quality;
        }

        public synchronized void setQuality(int quality) {
            this.quality = quality;
        }

        public static void main(String[] args) {

        }

        //@Override
        public synchronized int compareTo(Beach o) {
            return name.compareTo(o.getName()) + (int)(distance*quality - o.getDistance()*o.getQuality());
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

}
