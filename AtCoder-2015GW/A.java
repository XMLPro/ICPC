package atCodeGW;

import java.util.ArrayList;
import java.util.Collections;

public class A {
	// �S�̂Ŏg���������̂Ȃ̂�static
	static ArrayList<Integer> al = new ArrayList<>();//G���ȊO�̐��l
	static ArrayList<Integer> complete = new ArrayList<>();//�����ł��l�ߍ��ނƂ���
	static int[] points = { 25, 39, 51, 76, 163, 111, 128, 133, 138 };// G���̓_�����������Ă���܂��B

	public static void main(String[] args) {
		int posi = 0;//�[��
		int num = 0;//���v�l

		func(posi, num);

		// G���̏ꍇ����������ŏ���
		/* 0�_�擾�̏ꍇ */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 0);
		}
		/* 58�_�擾�̏ꍇ */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 58);
		}
		/* 136�_�擾�̏ꍇ */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 136);
		}

		Collections.sort(complete);// ���������ɕ��בւ�

		// ���Ԃ��Ă鐔�����폜���鏈��
		int tmp = -1;/* ���̐��ɏ����������0���폜����Ȃ� */
		for (int i = 0; i < complete.size(); i++) {
			if (tmp == complete.get(i)) {
				// System.out.println(tmp+":"+complete.get(i));
				complete.remove(i);
				i--;
			} else {
				tmp = complete.get(i);
			}
		}

		for (int i = 0; i < complete.size(); i++) {
			System.out.println(complete.get(i));
		}
	}

	// �؍\���ŒT��
	/*
	 * �@�@�@�@�@�@      �@0 
	 * �@�@�@�@�@     �@/�@ �@\ 
	 * �@�@�@�@�@      25 �@�@0 
	 * �@�@�@�@       /�@ \�@/ \
	 *      39 0 39 0 
	 *    ............. 
	 *    .............
	 *   /             \
	 *  138             0
	 */
	public static void func(int posi, int num) {
		if (posi == points.length) {
			al.add(num);
		} else {
			func(posi + 1, num);// 0�_�̏ꍇ
			num += points[posi];
			func(posi + 1, num);// �_�����擾�ł��Ă���ꍇ
		}
	}

}
