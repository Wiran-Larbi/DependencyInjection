package PRESENTATION;

import DAO.IDAO;
import SERVICE.IService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class PresentationV1 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("configuration.properties"));

        // Extracting Configuration From the .properties file
        // * DAO Class
        String daoClassName = scanner.nextLine();
        Class CDao = Class.forName(daoClassName);
        IDAO dao = (IDAO) CDao.newInstance();

        // * SERVICE Class
        String serviceClassName = scanner.nextLine();
        Class CService = Class.forName(serviceClassName);
        IService service = (IService) CService.newInstance();

        // * Implementation
        Method method = CService.getMethod("setDao",IDAO.class);
        // => service.setDao(dao)
        method.invoke(service,dao);

        Double result = service.enumerate();
        System.out.println("The Result is Given by : " + result);



    }
}
