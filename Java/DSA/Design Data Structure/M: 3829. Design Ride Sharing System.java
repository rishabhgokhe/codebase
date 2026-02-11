https://leetcode.com/problems/design-ride-sharing-system/description/

// Time Complexity: O(1) Space Complexity: O(n)
class RideSharingSystem {

    Queue<Integer> riders;
    Queue<Integer> drivers;
    Set<Integer> activeRiders;

    public RideSharingSystem() {
        riders = new LinkedList<>();
        drivers = new LinkedList<>();
        activeRiders = new HashSet<>();
    }
    
    public void addRider(int riderId) {
        riders.offer(riderId);
        activeRiders.add(riderId);
    }
    
    public void addDriver(int driverId) {
        drivers.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while (!riders.isEmpty() && 
            !activeRiders.contains(riders.peek())) {
            riders.poll();
        }

        if (riders.isEmpty() || drivers.isEmpty()) {
            return new int[]{-1, -1};
        }

        int driver=drivers.poll();
        int rider=riders.poll();
        activeRiders.remove(rider);

        return new int[]{driver, rider};
    }
    
    public void cancelRider(int riderId) {
        activeRiders.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */