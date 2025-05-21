package com.comma.geuneulgil.util.shadow;

import org.geotools.referencing.GeodeticCalculator;
import java.awt.geom.Point2D;

public class ShadowCalculator {
    public static Point2D.Double calculateShadowPoint(double lat, double lon, double heightM, double altitudeDeg, double azimuthDeg) throws Exception {
        if (altitudeDeg <= 0) {
            throw new IllegalArgumentException("태양 고도가 0 이하이므로 그림자가 생성되지 않습니다.");
        } return new Point2D.Double(dest.getY(), dest.getX());

        double shadowLength = heightM / Math.tan(Math.toRadians(altitudeDeg));
        double shadowAzimuth = (azimuthDeg + 180) % 360;

        GeodeticCalculator calc = new GeodeticCalculator();
        calc.setStartingGeographicPoint(lon, lat);
        calc.setDirection(shadowAzimuth, shadowLength);
        Point2D dest = calc.getDestinationGeographicPoint();

        return new Point2D.Double(dest.getY(), dest.getX()); // 위도, 경도 순
    }
}