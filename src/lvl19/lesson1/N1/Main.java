package lvl19.lesson1.N1;

public class Main {
    public static void main(String[] args)  {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Амиго";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };
        TableAdapter BTable =new TableAdapter(aTable);
        System.out.println(BTable.getHeaderText());
    }

    public static class TableAdapter implements BTable{
        ATable component;

        public TableAdapter(ATable component) {
            this.component = component;
        }

        @Override
        public String getHeaderText() {
            return String.format("[%s] : %s", component.getCurrentUserName(), component.getTableName());
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
