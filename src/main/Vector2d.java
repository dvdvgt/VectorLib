package main;

import java.lang.Math.*;

/**
 * This class represents a two dimensional vector and contains some methods for
 * operating in a R^2 vector space.
 *
 * @author David Voigt
 */
public final class Vector2d {

    public double x = 0.0;
    public double y = 0.0;

    /**
     * Creates an Vector2d instance with given values. The values given
     * in the array must be in the following order [x, y].
     *
     * @param values
     */
    public Vector2d(double[] values) {
        this.x = values[0];
        this.y = values[1];
    }

    /**
     * Creates an Vector2d instance with given values.
     *
     * @param x
     * @param y
     */
    public Vector2d(double x, double y) {
        set(x, y);
    }

    /**
     * Creates an Vector2d instance with zero values.
     */
    public Vector2d() {
    }

    /**
     * Computes the euclidean distance between two vectors.
     *
     * @param v1
     * @param v2
     * @return The distance between v1 and v2.
     */
    public static double dist(Vector2d v1, Vector2d v2) {
        final double dx = v2.x - v1.x;
        final double dy = v2.y - v1.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    /**
     * Normalizes a given vector and stores the result in the second given vector
     * instance.
     *
     * @param v   Vector to be normalized.
     * @param ret Vector to store the normalized vector in.
     */
    public static void normalize(Vector2d v, Vector2d ret) {
        final double length = v.length();
        final double scalar = (length == 0) ? (0.0) : (1 / length);

        ret.x = v.x * scalar;
        ret.y = v.y * scalar;
    }

    /**
     * Normalizes a given vector and returns the result as new vector instance.
     *
     * @param v Vector to be normalized
     * @return
     */
    public static Vector2d normalize(Vector2d v) {
        final double length = v.length();
        final double scalar = (length == 0) ? (0.0) : (1 / length);

        return mul(v, scalar);
    }

    /**
     * Normalizes the calling vector instance in-place.
     */
    public void normalize() {
        final double length = this.length();
        final double scalar = (length == 0) ? (0.0) : (1 / length);

        this.x *= scalar;
        this.y *= scalar;
    }

    /**
     * Computes the length of a given vector instance.
     *
     * @param v Vector whose length is to be determined.
     * @return The length of the given vector instance.
     */
    public static double length(Vector2d v) {
        return Math.sqrt((v.x * v.x) + (v.y * v.y));
    }

    /**
     * Computes the length of the calling vector instance.
     *
     * @return The length of the calling vector instance.
     */
    public double length() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    /**
     * Copies a given vector instance to a new one.
     *
     * @param v Vector to be copied.
     * @return A copy of the given Vector.
     */
    public static Vector2d copy(Vector2d v) {
        return new Vector2d(v.x, v.y);
    }

    /**
     * Copies the calling vector instance to a new one.
     *
     * @return A copy of the calling vector instance.
     */
    public Vector2d copy() {
        return new Vector2d(this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector2d) {
            return (((Vector2d) obj).x == this.x && ((Vector2d) obj).y == this.y);
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y;
    }

    /**
     * Limits a given vector by a given value and stores the result in
     * the second given vector instance.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param v   Vector which is to be limited.
     * @param limit   Limiting value.
     * @param ret Vector instance where the result will be stored in.
     */
    public static void limit(Vector2d v, double limit, Vector2d ret) {
        final double length = v.length();

        ret.set(v.x, v.y);

        if (length > limit) {
            final double scalar = limit / length;
            ret.set(
                    ret.x * scalar,
                    ret.y * scalar
            );
        }
    }

    /**
     * Limits a given vector by a given value and returns it as a new
     * vector instance.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param v Vector which is to be limited.
     * @param limit Limiting value.
     * @return Limited vector instance.
     */
    public static Vector2d limit(Vector2d v, double limit) {
        final double length = v.length();

        if (length > limit) {
            final double scalar = limit / length;
            return mul(v, scalar);
        } else {
            return v;
        }
    }

    /**
     * Limits a given vector by a given value in-place.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param limit Limiting value.
     */
    public void limit(double limit) {
        final double length = this.length();

        if (length > limit) {
            final double scalar =  limit / length;
            this.x *= scalar;
            this.y *= scalar;
        }
    }

    /**
     * Sets the values of the calling vector instance by replacing
     * them with the values of the given vector.
     *
     * @param v Vector whose values will be set as the new values of the
     *          calling vector instance.
     */
    public void set(Vector2d v) {
        set(v.x, v.y);
    }

    /**
     * Sets the values of the calling vector instance by replacing
     * them with the values of the given vector.
     *
     * @param values An array of numbers representing the new values
     *               to be set for the calling vector instance.
     */
    public void set(double[] values) {
        this.x = values[0];
        this.y = values[1];
    }

    /**
     * Sets the values of the calling instance.
     *
     * @param x X-value
     * @param y Y-Value
     */
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Adds two given vectors and stores the result in the third given
     * vector instance.
     *
     * @param v1  First vector to be added.
     * @param v2  Second vector to be added.
     * @param ret Vector in which to store the sum.
     */
    public static void add(Vector2d v1, Vector2d v2, Vector2d ret) {
        final double dx = v1.x + v2.x;
        final double dy = v1.y + v2.y;

        ret.x = dx;
        ret.y = dy;
    }

    /**
     * Adds the given vectors and returns the sum.
     *
     * @param v1 First vector to be added.
     * @param v2 Second vector to be added.
     * @return Vector containing the sum.
     */
    public static Vector2d add(Vector2d v1, Vector2d v2) {
        final double dx = v1.x + v2.x;
        final double dy = v1.y + v2.y;

        return new Vector2d(dx, dy);
    }

    /**
     * Adds a given vector to the calling vector instance and returns
     * the sum as new vector.
     *
     * @param v Vector to be added to calling instance.
     * @return Vector containing the sum.
     */
    public Vector2d add(Vector2d v) {
        final double dx = this.x + v.x;
        final double dy = this.y + v.y;

        return new Vector2d(dx, dy);
    }

    /**
     * Subtracts to given vectors and stores the result in a third given
     * vector instance.
     *
     * @param v1  First vector to be subtracted from.
     * @param v2  Second vector which will be subtracted from the first one.
     * @param ret The vector to store to result in.
     */
    public static void sub(Vector2d v1, Vector2d v2, Vector2d ret) {
        final double dx = v1.x - v2.x;
        final double dy = v1.y - v2.y;

        ret.x = dx;
        ret.y = dy;
    }

    /**
     * Subtracts to given vectors and returns the result as new vector.
     *
     * @param v1 First vector to be subtracted from.
     * @param v2 Second vector which will be subtracted from the first one.
     * @return
     */
    public static Vector2d sub(Vector2d v1, Vector2d v2) {
        final double dx = v1.x - v2.x;
        final double dy = v1.y - v2.y;

        return new Vector2d(dx, dy);
    }

    /**
     * Subtracts the given vector from the calling vector instance.
     *
     * @param v
     * @return
     */
    public Vector2d sub(Vector2d v) {
        final double dx = this.x - v.x;
        final double dy = this.y - v.y;

        return new Vector2d(dx, dy);
    }

    /**
     * Multiplies a given vector by a scalar value and stores the result in
     * the second given vector.
     *
     * @param v      Vector to be multiplied by a scalar.
     * @param scalar Scalar for the vector to be multiplied with.
     * @param ret    Vector for the result to be stored in.
     */
    public static void mul(Vector2d v, double scalar, Vector2d ret) {
        ret.set(
                v.x * scalar,
                v.y * scalar
        );
    }

    /**
     * Multiplies a given vector by a scalar value and returns the result as
     * a new vector instance.
     *
     * @param v      Vector to be multiplied by a scalar.
     * @param scalar Scalar value for the vector to be multiplied with.
     * @return Vector containing the result.
     */
    public static Vector2d mul(Vector2d v, double scalar) {
        return new Vector2d(
                v.x * scalar,
                v.y * scalar
        );
    }

    /**
     * Multiplies the calling vector instance by a given scalar value and
     * returns the result as a new vector instance.
     *
     * @param scalar Scalar value for the vector to be multiplied with
     * @return
     */
    public Vector2d mul(double scalar) {
        this.set(
                this.x * scalar,
                this.y * scalar
        );
        return this;
    }

    /**
     * Calculates the scalar product of two given vectors.
     *
     * @param v1 First vector of the scalar product.
     * @param v2 Second vector of the scalar product.
     * @return Result containing the scalar product.
     */
    public static double scalar(Vector2d v1, Vector2d v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    /**
     * Calculates the scalar product of the calling vector instance and
     * a given vector.
     *
     * @param v Vector for the scalar product.
     * @return Result containing the scalar product.
     */
    public double scalar(Vector2d v) {
        return this.x * this.x + v.y * v.y;
    }

    public static double cosAngle(final Vector2d v1, final Vector2d v2) {
        final double scalar = scalar(v1, v2);
        final double length = (v1.length() * v2.length());

        return scalar / length;
    }

    /**
     * Computes the angle between to given vectors.
     *
     * @param v1 First vector.
     * @param v2 Second vector.
     * @return Containing the angle between the two given vectors.
     */
    public static double angle(Vector2d v1, Vector2d v2) {
        return Math.acos(cosAngle(v1, v2));
    }

    /**
     * Computes the angle between the calling vector instance and a
     * given vector.
     *
     * @param v Vector whose angle between the calling vector instance will
     *          be determined.
     * @return
     */
    public double angle(Vector2d v) {
        return Math.acos(cosAngle(this, v));
    }
}
