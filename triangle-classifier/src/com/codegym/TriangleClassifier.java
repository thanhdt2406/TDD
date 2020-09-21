package com.codegym;

public class TriangleClassifier {
    public static String classifyTriangle(int[] size) {
        if (isTriangle(size)) {
            if (size[0] == size[1] && size[1] == size[2]) {
                return "Tam giác đều";
            } else if (size[0] == size[1] || size[1] == size[2] || size[2] == size[0]) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        }
        return "Không phải là tam giác";
    }

    public static boolean isTriangle(int[] size) {
        if (size[0] <= 0 || size[1] <= 0 || size[2] <= 0) {
            return false;
        } else return size[0] + size[1] > size[2] &&
                size[1] + size[2] > size[0] &&
                size[2] + size[0] > size[1];
    }
}
