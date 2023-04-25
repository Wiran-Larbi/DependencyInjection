package SERVICE;

import DAO.IDAO;

import java.util.ArrayList;

public class FirstService implements IService{

    private final double FIRST = 1.000000009000102;
    private IDAO dao = null;

    @Override
    public double enumerate() {

        ArrayList<Double> elements = (ArrayList<Double>) this.dao.getData();
        Double result = 0.0;
        for (Double element : elements) {
             result += element - Math.pow(FIRST,2);
        }

        return result;
    }
    @Override
    public void setDao(IDAO dao) {
        this.dao = dao;
    }


}
