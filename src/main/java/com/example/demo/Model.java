package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Model {

    public static String getData() {
        Map<String, String> data = new HashMap<>();

        data.put("Amazon_average_high_price", "3165.71662996");
        data.put("Amazon_average_close_price", "3124.88224507");
        data.put("Amazon_average_open_price", "3129.25893574");
        data.put("Amazon_average_low_price", "3086.07098609");
        data.put("Amazon_average_volume", "4281548.98814");
        data.put("Amazon_total_volume", "1083231894");

        data.put("Google_average_close_price", "1777.57679383");
        data.put("Google_average_volume", "1641952.87747");
        data.put("Google_average_low_price", "1757.39913858");
        data.put("Google_average_high_price", "1796.8592119");
        data.put("Google_average_open_price", "1775.24942199");
        data.put("Google_total_volume", "415414078");

        data.put("Apple_average_open_price", "116.931393617");
        data.put("Apple_average_low_price", "115.2899503");
        data.put("Apple_average_close_price", "116.849248862");
        data.put("Apple_average_high_price", "118.355415265");
        data.put("Apple_average_volume", "127419374.992");
        data.put("Apple_total_volume", "32237101873");

        return data.toString();
    }
}
