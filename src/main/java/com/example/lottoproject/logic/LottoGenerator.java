package com.example.lottoproject.logic;

import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        int[] lottoNumbers = new int[6];  // 6개의 로또 번호를 담을 배열 생성

        Random random = new Random();  // 랜덤 객체 생성
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(45) + 1;  // 1부터 45까지의 난수 생성
            if (contains(lottoNumbers, num)) {  // 중복된 숫자가 있으면 다시 뽑기
                i--;
                continue;
            }
            lottoNumbers[i] = num;  // 생성된 숫자를 배열에 저장
        }

        // 생성된 로또 번호 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }

    // 배열에 특정 숫자가 포함되어 있는지 검사하는 메소드
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
