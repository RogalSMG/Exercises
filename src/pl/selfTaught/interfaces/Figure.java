package pl.selfTaught.interfaces;

public interface Figure {

    double getPerimeter();

    double getArea();

    default String getName() {
        return "name";
    }

}