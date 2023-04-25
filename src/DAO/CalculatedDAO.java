package DAO;

import java.util.ArrayList;

public class CalculatedDAO implements IDAO {

    @Override
    public ArrayList<Double> getData() {
        ArrayList<Double> elements = new ArrayList<Double>();
        for (int i = 1; i <= 20; i++) {
            double rndElement = Math.random() * i;
            elements.add(rndElement);
        }

        return elements;
    }
}
