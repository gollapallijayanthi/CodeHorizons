class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = potions.length;
        int[] res = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int currSpell = spells[i];
            int low = 0, high = m - 1;
            int firstValid = m;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                long prod = (long) currSpell * potions[mid];

                if (prod >= success) {
                    firstValid = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            res[i] = m - firstValid;
        }

        return res;
    }
}
