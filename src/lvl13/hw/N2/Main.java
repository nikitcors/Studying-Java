package lvl13.hw.N2;

public class Main {
    public static void main(String[] args)   {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    public interface Weather {
        String getWeatherType();
    }



    public  static class Today implements Weather,WeatherType{
        private String type;

        public Today (String weatherType){
            this.type = weatherType;
        }
        @Override
        public String getWeatherType() {
            return type;
        }
    }


}
