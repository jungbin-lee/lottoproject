package com.example.lottoproject.logic;

import java.util.*;

public class LottoMyshop {

        public static void main(String[] args) {
            // 역대 로또 당첨번호 데이터
            int[][] lottoNumbers = {
                    {8	,19	,25	,34	,37	,39	,9},
                    {2	,9	,16	,25	,26	,40	,42},
                    {14	,15	,26	,27	,40	,42	,34},
                    {16	,24	,29	,40	,41	,42	,3},
                    {14	,27	,30	,31	,40	,42	,2},
                    {11	,16	,19	,21	,27	,31	,30},
                    {9	,13	,21	,25	,32	,42	,2},
                    {10	,23	,29	,33	,37	,40	,16},
                    {3,10,24,33,38,45,36},
                    {4,24,27,35,37,45,15},
                    {20,31,32,40,41,45,12},
                    {3,6,22,23,24,38,30},
                    {3,6,9,18,22,35,14},
                    {3,18,19,23,32,45,24},
                    {6,11,16,19,21,32,45}
            };

            Map<Integer, Integer> numberCounts = new HashMap<>();  // 각 숫자의 출현 횟수를 저장할 Map 객체 생성

            // 각 숫자의 출현 횟수 계산
            for (int[] numbers : lottoNumbers) {
                for (int number : numbers) {
                    if (!numberCounts.containsKey(number)) {
                        numberCounts.put(number, 1);
                    } else {
                        numberCounts.put(number, numberCounts.get(number) + 1);
                    }
                }
            }

            // 출현 횟수가 높은 숫자부터 내림차순으로 정렬
            List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(numberCounts.entrySet());
            Collections.sort(sortedEntries, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            // 출현 횟수가 높은 상위 6개의 숫자를 출력
            for (int i = 0; i < 6; i++) {
                System.out.print(sortedEntries.get(i).getKey() + " ");
            }
        }
    }



