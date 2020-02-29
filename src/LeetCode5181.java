public class LeetCode5181 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int sum = 0;
        int sum1 = 0;
        if (start > destination) {
            int t = start;
            start = destination;
            destination = t;
        }
		for (int value : distance) {
			sum += value;
		}
        for (int i = start; i < destination; i++) {
            sum1 += distance[i];
        }
		return Math.min(sum - sum1, sum1);
    }

}
