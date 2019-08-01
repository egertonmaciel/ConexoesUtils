package br.com.egerton.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Egerton Maciel
 */
public class PropSqlUtils {

    public static String get(String properties) {
        String retorno = "";
        ClassLoader classLoader = PropSqlUtils.class.getClassLoader();

        try (InputStream input = classLoader.getResourceAsStream("properties/query.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            retorno = prop.getProperty(properties);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
