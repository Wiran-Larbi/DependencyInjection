package SERVICE;

import DAO.IDAO;

import java.util.ArrayList;

public class SecondService implements IService{

    private final double SECOND = 2.43221667002;
    private IDAO dao = null;

    @Override
    public double enumerate() {

        ArrayList<Double> elements = (ArrayList<Double>) this.dao.getData();
        Double result = 0.0;
        for (Double element : elements) {
            result += element - Math.pow(SECOND,2);
        }

        return result;
    }
    @Override
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
