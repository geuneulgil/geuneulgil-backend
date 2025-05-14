package com.comma.geuneulgil.util.shadow;

public class SunPositionUtil {
    public static class SunPosition {
        public double altitude;
        public double azimuth;

        public SunPosition(double altitude, double azimuth) {
            this.altitude = altitude;
            this.azimuth = azimuth;
        }
    }

    public static SunPosition getSunPosition(double lat, double lon, LocalDateTime datetime) {
        // TODO: 외부 API 연동 위치
        return new SunPosition(45.0, 135.0); // 테스트용 더미
    }
}
