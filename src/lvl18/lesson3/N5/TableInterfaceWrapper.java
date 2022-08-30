package lvl18.lesson3.N5;

import java.util.List;
import java.util.Locale;

public class TableInterfaceWrapper implements ATableInterface{

    ATableInterface component;

    public TableInterfaceWrapper(ATableInterface component) {
        this.component = component;
    }

    @Override
    public void setModel(List rows) {
       System.out.printf("Текущее количество элементов %d", rows.size());
        this.component.setModel(rows);
    }

    @Override
    public String getHeaderText() {
        return this.component.getHeaderText().toUpperCase(Locale.ROOT);
    }

    @Override
    public void setHeaderText(String newHeaderText) {

    }
}
