package lab25;

public class Matrix {
    private float[][] components;

    // Конструктор из двумерного массива
    public Matrix(float[][] components) {
        this.components = new float[components.length][components[0].length];
        for (int i = 0; i < components.length; ++i) {
            for (int j = 0; j < components[0].length; ++j) {
                this.components[i][j] = components[i][j];
            }
        }
    }

    // Конструктор из массива векторов
    public Matrix(LAVector[] rows) {
        int countRows = rows.length;
        int columns = rows[0].size();
        this.components = new float[countRows][columns];
        for (int i = 0; i < countRows; ++i) {
            components[i] = rows[i].getComponents();
        }
    }

    // Конструктор для создания матрицы из нулей
    public Matrix(int rows, int columns) {
        this.components = new float[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                components[i][j] = 0;
            }
        }
    }

    // Конструктор для создания диагональной матрицы
    public Matrix(int size, float diagElement) {
        this.components = new float[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                components[i][j] = (i == j) ? diagElement : 0;
            }
        }
    }

    public int rows() {
        return components.length;
    }

    public int columns() {
        return components[0].length;
    }

    public float det() {
        return determinant(components);
    }

    public float determinant(float[][] mat) {
        int n = mat.length;
        if (n == 1) {
            return mat[0][0];
        }
        float opred = 0;
        for (int col = 0; col < n; col++) {
            float[][] subMat = new float[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < col) {
                        subMat[i - 1][j] = mat[i][j];
                    } else if (j > col) {
                        subMat[i - 1][j - 1] = mat[i][j];
                    }
                }
            }
            opred += Math.pow(-1, col) * mat[0][col] * determinant(subMat);
        }
        return opred;
    }

    public Matrix multRVector(LAVector vector) {
        if (columns() != 1) return null;
        float[][] multMatrix = new float[rows()][vector.size()];
        for (int i = 0; i < rows(); ++i) {
            for (int j = 0; j < vector.size(); ++j) {
                multMatrix[i][j] = components[i][0] * vector.getComponent(j);
            }
        }
        return new Matrix(multMatrix);
    }

    public LAVector multLVector(LAVector vector) {
        if (vector.size() != columns()) return null;
        float[] result = new float[rows()];
        for (int r = 0; r < rows(); ++r) {
            for (int j = 0; j < columns(); ++j) {
                result[r] += vector.getComponent(j) * components[r][j];
            }
        }
        return new LAVector(result);
    }

    public Matrix transp() {
        float[][] transMatrix = new float[columns()][rows()];
        for (int i = 0; i < rows(); ++i) {
            for (int j = 0; j < columns(); ++j) {
                transMatrix[j][i] = components[i][j];
            }
        }
        return new Matrix(transMatrix);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < rows(); ++i) {
            for (int j = 0; j < columns(); ++j) {
                result += components[i][j] +", ";
            }
            result += "\n";
        }
        return result;
    }
}
