class Twitter {

    private static int timestamp = 0;

    private final Map<Integer, Set<Integer>> followMap;
    private final Map<Integer, TweetNode> tweetMap;

    private static class TweetNode {
        
        int tweetId;
        int time;
        TweetNode next;

        TweetNode(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    public Twitter() {

        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

        TweetNode node = new TweetNode(tweetId, timestamp++);
        node.next = tweetMap.get(userId);
        tweetMap.put(userId, node);
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> feed = new ArrayList<>();

        PriorityQueue<TweetNode> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.time, a.time)
        );

        if (tweetMap.containsKey(userId)) {
            maxHeap.add(tweetMap.get(userId));
        }

        Set<Integer> followees = followMap.getOrDefault(userId, new HashSet<>());
        for (int followee : followees) {
            TweetNode head = tweetMap.get(followee);
            if (head != null) {
                maxHeap.add(head);
            }
        }

        while (!maxHeap.isEmpty() && feed.size() < 10) {
            TweetNode current = maxHeap.poll();
            feed.add(current.tweetId);

            if (current.next != null) {
                maxHeap.add(current.next);
            }
        }

        return feed;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId) return;

        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (!followMap.containsKey(followerId)) return;

        followMap.get(followerId).remove(followeeId);
    }

}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */