package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	static void kadaiA() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i +"の何回目ループです。 ");
		}
	}


    static void kadaiB() {
        // ランダムな数値を生成
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // 生成した数値を出力
        System.out.println("生成されたランダムな数値: " + randomNumber);

        // 数値を返す場合は、メソッドの戻り値として設定することもできます
        // return randomNumber;
    }
}