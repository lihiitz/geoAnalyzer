package server;

import org.springframework.stereotype.Component;

@Component("Point")
public class Point implements IShape{

    @Override
    public int numOfVertices(GeoJson geoJson) {
        return 1;
    }

    @Override
    public int numOfPoints(GeoJson geoJson) {
        return 1;
    }
}
