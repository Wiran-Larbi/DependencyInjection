package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DbExtractDAO implements IDAO {

    @Override
    public ArrayList<Double> getData() {

        /**
         * todo : Lets say this class connect to a database (using JDBC) and fetches the data
         * @return : -> Collections of Doubles
         */

        // * Added by Developper
        ArrayList<Double> elements = new ArrayList<Double>();
        try (BufferedReader br = new BufferedReader(new FileReader("elements.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                double element = Double.parseDouble(line);
                elements.add(element);
            }
        } catch (IOException excep) {
                excep.printStackTrace();
        }

        return elements;
    }
}
