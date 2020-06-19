package main;

/**
 * This class represents a three dimensional vector and contains some methods for
 * operating in a R^3 vector space.
 *
 * @author David Voigt
 */
public class Vector3d {

    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;

    /**
     * Creates an Vector3d instance with given values. The values given
     * in the array must be in the following order [x, y, z].
     *
     * @param values
     */
    public Vector3d(double[] values) {
        this.x = values[0];
        this.y = values[1];
    }

    /**
     * Creates an Vector3d instance with given values.
     *
     * @param x
     * @param y
     */
    public Vector3d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Creates an Vector3d instance with zero values.
     */
    public Vector3d() {
    }

    /**
     * Computes the euclidean distance between two vectors.
     *
     * @param v1
     * @param v2
     * @return The distance between v1 and v2.
     */
    public double dist(Vector3d v1, Vector3d v2) {
        return 0;
    }

    /**
     * Normalizes a given vector and stores the result in the second given vector
     * instance.
     *
     * @param v   Vector3d to be normalized.
     * @param ret Vector3d to store the normalized vector in.
     */
    public void normalize(Vector3d v, Vector3d ret) {

    }

    /**
     * Normalizes a given vector and returns the result as new vector instance.
     *
     * @param v Vector3d to be normalized
     * @return
     */
    public Vector3d normalize(Vector3d v) {
        return null;
    }

    /**
     * Normalizes the calling vector instance in-place.
     */
    public void normalize() {

    }

    /**
     * Computes the length of a given vector instance.
     *
     * @param v Vector3d whose length is to be determined.
     * @return The length of the given vector instance.
     */
    public double length(Vector3d v) {
        return 0;
    }

    /**
     * Computes the length of the calling vector instance.
     *
     * @return The length of the calling vector instance.
     */
    public double length() {
        return 0;
    }

    /**
     * Copies a given vector instance to a new one.
     *
     * @param v Vector3d to be copied.
     * @return A copy of the given Vector.
     */
    public Vector3d copy(Vector3d v) {
        return null;
    }

    /**
     * Copies the calling vector instance to a new one.
     *
     * @return A copy of the calling vector instance.
     */
    public Vector3d copy() {
        return null;
    }

    /**
     * Limits a given vector by a given value and stores the result in
     * the second given vector instance.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param v   Vector3d who is to be limited.
     * @param s   Limiting value.
     * @param ret Vector3d instance where the result will be stored in.
     */
    public void limit(Vector3d v, double s, Vector3d ret) {

    }

    /**
     * Limits a given vector by a given value and returns it as a new
     * vector instance.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param v Vector3d who is to be limited.
     * @param s Limiting value.
     * @return Limited vector instance.
     */
    public Vector3d limit(Vector3d v, double s) {
        return null;
    }

    /**
     * Limits a given vector by a given value in-place.
     * If the length of the given vector exceeds the limit set by the
     * given value the vector length is being limited to that value
     * otherwise the vector will be left unchanged.
     *
     * @param s Limiting value.
     */
    public void limit(double s) {

    }

    /**
     * Sets the values of the calling vector instance by replacing
     * them with the values of the given vector.
     *
     * @param v Vector3d whose values will set as the new values of the
     *          calling vector instance.
     */
    public void set(Vector3d v) {

    }

    /**
     * Sets the values of the calling vector instance by replacing
     * them with the values of the given vector.
     *
     * @param values An array of numbers representing the new values
     *               to be set for the calling vector instance.
     */
    public void set(double[] values) {

    }

    /**
     * Adds two given vectors and stores the result in the third given
     * vector instance.
     *
     * @param v1  First vector to be added.
     * @param v2  Second vector to be added.
     * @param ret Vector3d in which to store the sum.
     */
    public void add(Vector3d v1, Vector3d v2, Vector3d ret) {

    }

    /**
     * Adds the given vectors and returns the sum.
     *
     * @param v1 First vector to be added.
     * @param v2 Second vector to be added.
     * @return Vector3d containing the sum.
     */
    public Vector3d add(Vector3d v1, Vector3d v2) {
        return null;
    }

    /**
     * Adds a given vector to the calling vector instance and returns
     * the sum as new vector.
     *
     * @param v Vector3d to be added to calling instance.
     * @return Vector3d containing the sum.
     */
    public Vector3d add(Vector3d v) {
        return null;
    }

    /**
     * Subtracts to given vectors and stores the result in a third given
     * vector instance.
     *
     * @param v1  First vector to be subtracted from.
     * @param v2  Second vector which will be subtracted from the first one.
     * @param ret The vector to store to result in.
     */
    public void sub(Vector3d v1, Vector3d v2, Vector3d ret) {

    }

    /**
     * Subtracts to given vectors and returns the result as new vector.
     *
     * @param v1 First vector to be subtracted from.
     * @param v2 Second vector which will be subtracted from the first one.
     * @return
     */
    public Vector3d sub(Vector3d v1, Vector3d v2) {
        return null;
    }

    /**
     * Subtracts the given vector from the calling vector instance.
     *
     * @param v
     * @return
     */
    public Vector3d sub(Vector3d v) {
        return null;
    }

    /**
     * Multiplies a given vector by a scalar value and stores the result in
     * the second given vector.
     *
     * @param v      Vector3d to be multiplied by a scalar.
     * @param scalar Scalar for the vector to be multiplied with.
     * @param ret    Vector3d for the result to be stored in.
     */
    public void mul(Vector3d v, double scalar, Vector3d ret) {

    }

    /**
     * Multiplies a given vector by a scalar value and returns the result as
     * a new vector instance.
     *
     * @param v      Vector3d to be multiplied by a scalar.
     * @param scalar Scalar value for the vector to be multiplied with.
     * @return Vector3d containing the result.
     */
    public Vector3d mul(Vector3d v, double scalar) {
        return null;
    }

    /**
     * Multiplies the calling vector instance by a given scalar value and
     * returns the result as a new vector instance.
     *
     * @param scalar Scalar value for the vector to be multiplied with
     * @return
     */
    public Vector3d mul(double scalar) {
        return null;
    }

    /**
     * Calculates the scalar product of two given vectors.
     *
     * @param v1 First vector of the scalar product.
     * @param v2 Second vector of the scalar product.
     * @return Result containing the scalar product.
     */
    public double scalar(Vector3d v1, Vector3d v2) {
        return 0;
    }

    /**
     * Calculates the scalar product of the calling vector instance and
     * a given vector.
     *
     * @param v Vector3d for the scalar product.
     * @return Result containing the scalar product.
     */
    public double scalar(Vector3d v) {
        return 0;
    }

    /**
     * Computes the angle between to given vectors.
     *
     * @param v1 First vector.
     * @param v2 Second vector.
     * @return Containing the angle between the two given vectors.
     */
    public double angle(Vector3d v1, Vector3d v2) {
        return 0;
    }

    /**
     * Computes the angle between the calling vector instance and a
     * given vector.
     *
     * @param v Vector3d whose angle between the calling vector instance will
     *          be determined.
     * @return
     */
    public double angle(Vector3d v) {
        return 0;
    }
}
