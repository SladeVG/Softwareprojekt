import javax.management.Query;

public class datenbankzugriff {
    public static void main(String[] args) {
        DatabaseConnector personen = new DatabaseConnector("baum", 2222, "personendb", "user", "password");

        String sql1 = new String("create table Personen(" +
                "Name text primary key," +
                "Alter int)");
        personen.executeStatement(sql1);

        String sql2 = new String("insert into Personen(Name, Alter) values ('Joshua', 10)");

        personen.executeStatement(sql2);

        String sql3 = new String("select * from Personen");

        personen.executeStatement(sql3);

        String test = new String("d");


        for (int y = 0; y < personen.getCurrentQueryResult().getRowCount(); y++)
        {
            for (int x = 0; x < personen.getCurrentQueryResult().getColumnCount(); x++)
            {
                System.out.print(personen.getCurrentQueryResult().getData()[y][x] + " ");
            }

            System.out.println("\r");
        }


        //  System.out.println(personen.getCurrentQueryResult().getData()[2][0]);

    }
}
