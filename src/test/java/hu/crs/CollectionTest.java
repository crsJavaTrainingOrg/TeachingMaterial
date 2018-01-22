package hu.crs;

import org.junit.Test;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CollectionTest {

    @Test
    public void testHashSet() {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(9);

        assertThat(hashSet.size(), is(3));
        assertThat(hashSet.containsAll(List.of(9, 4, 5)), is(true));
    }

    @Test
    public void testTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(9);

        Iterator<Integer> iterator = treeSet.iterator();
        assertThat(iterator.next(), is(4));
        assertThat(iterator.next(), is(5));
        assertThat(iterator.next(), is(9));
    }

    @Test
    public void testLinkedHashSet() {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(9);

        Iterator<Integer> iterator = linkedHashSet.iterator();
        assertThat(iterator.next(), is(5));
        assertThat(iterator.next(), is(4));
        assertThat(iterator.next(), is(9));
    }

    @Test
    public void testHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 9);
        hashMap.put("c", 5);
        hashMap.put("b", 4);
        assertThat(hashMap.size(), is(3));
        assertThat(hashMap.containsValue(5), is(true));
        assertThat(hashMap.containsValue(9), is(true));
        assertThat(hashMap.containsValue(4), is(true));
    }

    @Test
    public void testTreeMap() {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 9);
        treeMap.put("c", 5);
        treeMap.put("b", 4);

        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        assertThat(iterator.next(), is(Map.entry("a", 9)));
        assertThat(iterator.next(), is(Map.entry("b", 4)));
        assertThat(iterator.next(), is(Map.entry("c", 5)));
    }

    @Test
    public void testLinkedHashMap() {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", 9);
        linkedHashMap.put("c", 5);
        linkedHashMap.put("b", 4);

        Iterator<Map.Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();
        assertThat(iterator.next(), is(Map.entry("a", 9)));
        assertThat(iterator.next(), is(Map.entry("c", 5)));
        assertThat(iterator.next(), is(Map.entry("b", 4)));
    }

    @Test
    public void testQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(1);
        queue.add(7);

        assertThat(queue.poll(), is(4));
        assertThat(queue.poll(), is(1));
        assertThat(queue.poll(), is(7));
    }

    @Test
    public void testDequeue() {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(4);
        deque.push(1);
        deque.push(7);

        assertThat(deque.pop(), is(7));
        assertThat(deque.pop(), is(1));
        assertThat(deque.pop(), is(4));



    }
}
