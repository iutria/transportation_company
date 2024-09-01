package GUI;

import BLL.File;
import ENTITY.Address;
import ENTITY.Box;
import ENTITY.Envelope;
import ENTITY.Guide;
import ENTITY.Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File();

        List<Address> address = new ArrayList<Address>();

        address.add(new Address("street1", "city1", "state1", "country1", "COL1", "CP1"));
        address.add(new Address("street2", "city2", "state2", "country2", "COL2", "CP2"));
        address.add(new Address("street3", "city3", "state3", "country3", "COL3", "CP3"));
        address.add(new Address("street4", "city4", "state4", "country4", "COL4", "CP4"));


        Guide guide1 = new Box(
                1,
                "DESPACHO",
                new Date("01/01/2024"),
                350,
                10,
                "Ivan",
                "Cesar",
                "+57",
                "upc",
                "iutria",
                new String[]{"1", "2", "3"},
                address.get(0),
                false
        );

        file.addGuide(guide1);

        Guide guide2 = new Envelope(
                2,
                "FINALIZADA",
                new Date("01/01/2024"),
                350,
                10,
                "Ivan",
                "Cesar",
                "+57",
                "upc",
                "iutria",
                new String[]{"1", "2", "3"},
                address.get(1),
                false
        );

        file.addGuide(guide2);

        Guide guide3 = new Package(
                3,
                "FINALIZADA",
                new Date("01/01/2024"),
                350,
                10,
                "Ivan",
                "Cesar",
                "+57",
                "upc",
                "iutria",
                new String[]{"1", "2", "3"},
                address.get(2),
                false
        );

        file.addGuide(guide3);

        for (Guide guide : file.getGuides()){
            System.out.println(guide.toString());
        }

    }
}
