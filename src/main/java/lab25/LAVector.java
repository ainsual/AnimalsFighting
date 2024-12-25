package lab25;

public class LAVector {

    private float[] components;

    public LAVector(int size) {
        float[] vec = new float[size];
        for (int i=0; i <= size; ++i) {
            vec[i] = 0;
        }

    }

    public LAVector(float[] components) {
        int size = components.length;
        float[] vec = new float[size];
        for (int i=0; i <= size; ++i) {
            vec[i] = components[i];
        }
        this.components = vec;
    }

    public LAVector(int size, float value) {
        float[] vec = new float[size];
        for (int i=0; i <= size; ++i) {
            vec[i] = value;
        }
        this.components = vec;

    }

    public LAVector plusVector(LAVector other) {
        int size = size();
        float[] summaVec = new float[size];
        float[] vec1 = this.components;
        float[] vec2 = other.components;
        for (int i=0; i <= size; ++i) {
            summaVec[i] = vec1[i] + vec2[i];
        }

        return new LAVector(summaVec);

    }

    public LAVector multNumber(float number) {
        return this;
    }

    public float scalarMult(LAVector other) {
        return 0;
    }

    public float abs() {
        return 0;
    }

    public float getComponent(int n) {
        return 0;
    }

    public int size() {
        return components.length;
    }

    public String toString() {
        return "";
    }

}
