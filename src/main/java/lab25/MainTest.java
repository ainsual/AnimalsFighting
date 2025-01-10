package lab25;

public class MainTest {
    public static void main(String[] args) {
        // Создание векторов
        LAVector vector1 = new LAVector(3);
        LAVector vector2 = new LAVector(new float[]{1.0f, 2.0f, 3.0f});
        LAVector vector3 = new LAVector(3, 5.0f);

        // Вывод векторов
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        System.out.println("Vector 3: " + vector3);

        // Сложение векторов
        LAVector sumVector = vector2.plusVector(vector3);
        System.out.println("Sum: " + sumVector);

        // Умножение
        LAVector multipliedVector = vector2.multNumber(2.0f);
        System.out.println("Mult: " + multipliedVector);

        // Скалярное произведение
        float scalarProduct = vector2.scalarMult(vector3);
        System.out.println("Scalar: " + scalarProduct);

        // Модуль
        float absValue = vector2.abs();
        System.out.println("abs: " + absValue);

        // Создание матрицы из двумерного массива
        float[][] data = {
                {1, 2, 3},
                {4, 5, 0},
                {7, 8, 9},
        };
        Matrix matrix1 = new Matrix(data);
        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        // Создание нулевой матрицы 3x3
        Matrix matrix2 = new Matrix(3, 4);
        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        // Создание диагональной матрицы
        Matrix matrix3 = new Matrix(3, 5);
        System.out.println("Matrix 3: ");
        System.out.println(matrix3);


        // Транспонирование матрицы
        Matrix transposedMatrix = matrix1.transp();
        System.out.println("Transposed:");
        System.out.println(transposedMatrix);

        // Вычисление определителя
        float determinant = matrix1.det();
        System.out.println("Determinant: " + determinant);
    }
}
