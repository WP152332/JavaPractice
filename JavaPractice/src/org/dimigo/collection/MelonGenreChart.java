/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *		|_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> b = new ArrayList<>();
		b.add(new Music("팔레트", "아이유"));

		List<Music> d = new ArrayList<>();
		d.add(new Music("I LUV IT", "PSY"));
		d.add(new Music("맞지?", "언니쓰"));

		map.put("[발라드]", b);
		map.put("[댄스]", d);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		d.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		d.remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for (String key : map.keySet()) {
			System.out.println(key);
			int count = 1;
			for(Music a : map.get(key)) {
				System.out.print(count);
				count++;
				System.out.println(a);
			}
		}	
		System.out.println();
	}
}
