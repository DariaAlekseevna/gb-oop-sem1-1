package org.example;

public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длину вектора
     */
    public Double vectorlenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2 - вектор для вычисления произведения
     * @return - скалярное проиведение векторов
     */
    public Double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 - вектор для вычисления произведения векторов
     * @return - вектороное произведение
     */
    public Vector product(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    /**
     * @apiNote расширенное описание по сигнатуре
     * @param vector2 - вектор для вычисления
     * @return - косинус между векторами
     */
    public Double cos(Vector vector2) {
        return scalar(vector2)/ (vectorlenght()*vector2.vectorlenght());
    }

    /**
     *
     * @param vector2 - вектор для вычисления
     * @return - сумма векторов
     */
    public  Vector summa(Vector vector2) {
        return new Vector(
                x+vector2.x,
                y+vector2.y,
                z+vector2.z
        );
    }

    /**
     *
     * @param vector2 - вектор для вычисления
     * @return - разность векторов
     */
    public Vector differ(Vector vector2) {
        return new Vector(
                x-vector2.x,
                y-vector2.y,
                z-vector2.z
        );
    }
}
