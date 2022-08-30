package lvl19.lesson1.N3;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("BL", "Bolgaria");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {

    }
    public static class IncomeDataAdapter implements Customer, Contact{
        IncomeData component;

        public IncomeDataAdapter(IncomeData component) {
            this.component = component;
        }

        @Override
        public String getCompanyName() {
            return String.format("%s Ltd",component.getCompany());
        }

        @Override
        public String getCountryName() {
            return countries.get(component.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s",component.getContactLastName(), component.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String full = String.format("%010d", component.getPhoneNumber());
            return String.format("+%d (%03d)%03d-%02d-%02d",
                    component.getCountryPhoneCode(), (full).substring(0,2),
                                                        (full).substring(3,5),
                                                        (full).substring(6,7),
                                                        (full).substring(8,9));
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example BL

        String getCompany();            //example  F1

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example  +28

        int getPhoneNumber();           //example 214635
    }

    public static interface Customer {
        String getCompanyName();        //example F1 Ltd

        String getCountryName();        //example Bolgaria
    }

    public static interface Contact {
        String getName();               //example  Ivanov, Ivan

        String getPhoneNumber();        //example +28 (21)4635
    }
}

