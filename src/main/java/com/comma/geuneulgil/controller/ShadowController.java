package com.comma.geuneulgil.controller;

import com.comma.geuneulgil.util.shadow.ShadowCalculator;
import com.comma.geuneulgil.util.shadow.SunPositionUtil;
import com.comma.geuneulgil.util.shadow.SunPositionUtil.SunPosition;

import java.awt.geom.Point2D;

public class ShadowController {
    public Point2D.Double run(double lat, double lon, double height, String datetime) throws Exception {
        SunPosition sun = SunPositionUtil.getSunPosition(lat, lon, datetime);
        return ShadowCalculator.calculateShadowPoint(lat, lon, height, sun.altitude, sun.azimuth);
    }

    public static void main(String[] args) throws Exception {
        ShadowController controller = new ShadowController();
        double lat = 37.5665;
        double lon = 126.9780;
        double height = 20;
        String datetime = "2025-05-14T14:00:00";

        Point2D.Double shadow = controller.run(lat, lon, height, datetime);
        System.out.println("그림자 끝 좌표: " + shadow);
    }
}
