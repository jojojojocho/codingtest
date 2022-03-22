package com.codingtest.programmers.devmatching;

//행렬 테두리 회전하기
public class MatrixRolling {
    public int[] solution(int rows, int columns, int[][] queries) {

        // 전체 행렬 만들기
        int[][] matrix = new int[rows][columns];
        int cnt = 1; // 시작숫자
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = cnt;
                cnt++;
            }
        }
        int time = 0;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[queries.length];

        for (int[] query : queries) {
            // 이동 길이
            int heightLength = query[2] - query[0];
            int widthLength = query[3] - query[1];

            // 4개의 배열 선언
            int[] widthPlus = new int[widthLength];
            int[] heightPlus = new int[heightLength];
            int[] widthMinus = new int[widthLength];
            int[] heightMinus = new int[heightLength];

            //시작위치 인덱스
            int heightIdx = query[0] - 1;
            int widthIdx = query[1] - 1;

            //4개의 배열 내용 채워넣기
            int arrIdx = 0;
            for (int i =0; i<widthLength; i++) {
                int matrixValue = matrix[heightIdx][widthIdx];
                widthPlus[arrIdx++] = matrixValue;
                min = Math.min(min, matrixValue);
                widthIdx++;
            }
            arrIdx = 0;
            for (int i =0; i<heightLength; i++) {
                int matrixValue = matrix[heightIdx][widthIdx];
                heightPlus[arrIdx++] = matrixValue;
                min = Math.min(min, matrixValue);
                heightIdx++;
            }
            arrIdx = widthMinus.length - 1;
            for (int i =0; i<widthLength; i++) {
                int matrixValue = matrix[heightIdx][widthIdx];
                widthMinus[arrIdx--] = matrixValue;
                min = Math.min(min, matrixValue);
                widthIdx--;
            }
            arrIdx = heightMinus.length - 1;
            for (int i =0; i<heightLength; i++) {
                int matrixValue = matrix[heightIdx][widthIdx];
                heightMinus[arrIdx--] = matrixValue;
                min = Math.min(min, matrixValue);
                heightIdx--;
            }

            //행렬 움직이기
            heightIdx = query[0]-1;
            widthIdx = query[1] - 1;
            arrIdx=0;
            for (int i =0; i<widthLength; i++) {
                widthIdx++;
                matrix[heightIdx][widthIdx]=widthPlus[arrIdx++];
            }
            arrIdx = 0;
            for (int i =0; i<heightLength; i++) {
                heightIdx++;
                matrix[heightIdx][widthIdx]=heightPlus[arrIdx++];
            }
            arrIdx = widthMinus.length - 1;
            for (int i =0; i<widthLength; i++) {
                widthIdx--;
                matrix[heightIdx][widthIdx]=widthMinus[arrIdx--];
            }
            arrIdx = heightMinus.length - 1;
            for (int i =0; i<heightLength; i++) {
                heightIdx--;
                matrix[heightIdx][widthIdx]=heightMinus[arrIdx--] ;
            }


            answer[time++] = min;
            min = Integer.MAX_VALUE;
        }

        return answer;
    }

    public static void main(String[] args) {
        MatrixRolling matrixRolling = new MatrixRolling();
        int[] solution = matrixRolling.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});
        for (int i : solution) {

            System.out.println("i = " + i);
        }

    }
}
