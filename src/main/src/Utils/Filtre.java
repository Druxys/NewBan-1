package Utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Filtre {
    public static ArrayList add( ArrayList _filter, String operator, String col, String value)
    {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        _filter.add(_filter1);

        return _filter;
    }

    public static ArrayList add( ArrayList _filter, String operator, String col, Integer value)
    {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        _filter.add(_filter1);

        return _filter;
    }}
