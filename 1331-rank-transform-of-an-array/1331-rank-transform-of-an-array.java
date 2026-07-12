class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rank[i] = arr[i];
        }
        Arrays.sort(rank);
        int ranks = 1;
        HashMap<Integer,Integer> ranking = new HashMap<>();
        for(int i=0;i<rank.length;i++){
            if(ranking.containsKey(rank[i])){
                continue;
            }
            ranking.put(rank[i],ranks++);
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = ranking.get(arr[i]);
        }
        return arr;
    }
}