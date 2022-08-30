package lvl15.hw.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class Main {

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        String inParam = inStr.readLine();
        Planet currentPlanet = getCurrentPlanet(inParam);
    }

    static Planet getCurrentPlanet(String currentPlanet){
        if (currentPlanet.equals(Planet.SUN)){ return Sun.getInstance();}
        if (currentPlanet.equals(Planet.EARTH)){ return Earth.getInstance();}
        if (currentPlanet.equals(Planet.MOON)){ return Moon.getInstance();}
        return null;
    }

    public static void main(String[] args) throws IOException {

    }
}
