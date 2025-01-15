package lab14;

public class LAVector {

    private float[] components;

    public LAVector(int size) {
        this.components = new float[size];
        for (int i = 0; i < size; ++i) {
            components[i] = 0;
        }
    }

    public LAVector(float[] components) {
        int size = components.length;
        this.components = new float[size];
        for (int i = 0; i < size; ++i) {
            this.components[i] = components[i];
        }
    }

    public LAVector(int size, float value) {
        this.components = new float[size];
        for (int i = 0; i < size; ++i) {
            components[i] = value;
        }
    }

    public float[] getComponents() {
        return components;
    }

    public LAVector plusVector(LAVector other) {
        int size = size();
        float[] summaVec = new float[size];
        float[] vec1 = this.components;
        float[] vec2 = other.components;
        for (int i = 0; i < size; ++i) {
            summaVec[i] = vec1[i] + vec2[i];
        }
        return new LAVector(summaVec);
    }

    public LAVector multNumber(float number) {
        float[] resultVec = new float[this.size()];
        for (int i = 0; i < this.size(); ++i) {
            resultVec[i] = components[i] * number;
        }
        return new LAVector(resultVec);
    }

    public float scalarMult(LAVector other) {
        float sum = 0;
        for (int i = 0; i < size(); ++i) {
            sum += components[i] * other.components[i];
        }
        return sum;
    }

    public float abs() {
        double sum = 0;
        for (int i = 0; i < size(); ++i) {
            sum += components[i] * components[i];
        }
        return (float) Math.sqrt(sum);
    }

    public float getComponent(int n) {
        if (n < 0 || n >= size()) return -1; // Исправлено условие
        return components[n];
    }

    public int size() {
        return components.length;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < size(); ++i) {
            str += components[i] + " ";
        }
        return str;
    }
}
